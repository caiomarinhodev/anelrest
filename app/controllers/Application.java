package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Admin;
import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import play.Logger;

public class Application extends Controller {
    @Transactional
    public static Result index() {
        Admin admin = SGDB.getAdmin(session().get("login"));
        if(admin!=null){
            return ok(index.render(admin));
        }
        return home();
    }

    @Transactional
    public static Result home(){
        return ok(home.render());
    }

    @Transactional
    public static Result login(){
        DynamicForm r = Form.form().bindFromRequest();
        String l = r.get("log");
        String p = r.get("senha");
        Admin ad = SGDB.getAdmin("anelroute");
        if(ad!=null){
            if(l.equals(ad.getLogin()) && p.equals(ad.getPass())){
                session().put("login",l);
                return index();
            }
        }
        return home();
    }

    @Transactional
    public static Result decrementa(Long id, Integer code){
        if(code==33){
            SGDB.decrementaTotal(1,id);
        }
        Usuario u = SGDB.getUsuario(id);
        Logger.info("User:"+u.getNome());
        ObjectNode result = Json.newObject();
        JsonNode obj = Json.toJson(u);
        return ok(obj);
    }

    @Transactional
    public static Result incrementa(){
        DynamicForm r = Form.form().bindFromRequest();
        Long id = Long.parseLong(r.get("id"));
        int t = Integer.parseInt(r.get("total"));
        SGDB.incrementaTotal(t,id);
        return index();
    }

    @Transactional
    public static Result renderEdit(Long id){
        Admin admin = SGDB.getAdmin(session().get("login"));
        Usuario u = SGDB.getUsuario(id);
        return ok(edit.render(admin,u));
    }

    @Transactional
    public static Result addUsuario(){
        DynamicForm r = Form.form().bindFromRequest();
        String nome = r.get("nome");
        String cpf = r.get("cpf");
        int total = Integer.parseInt(r.get("total"));
        SGDB.addUsuario(nome,cpf,total);
        return secondscreen(SGDB.getUsuario(cpf));
    }

    public static Result secondscreen(Usuario user){
        Admin admin = SGDB.getAdmin(session().get("login"));
        return ok(second.render(admin,user));
    }

    @Transactional
    public static Result removeUsuario(Long id){
        Admin admin = SGDB.getAdmin(session().get("login"));
        if(admin!=null){
            SGDB.removeUsuario(id);
            return index();
        }
        return home();
    }




}
