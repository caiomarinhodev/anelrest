package controllers;

import models.Admin;
import models.Usuario;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
    @Transactional
    public static Result index() {
        Admin admin = SGDB.getAdmin(session().get("login"));
        if(admin!=null){
            ok(index.render(admin));
        }
        return home();
    }

    @Transactional
    public static Result home(){
        Admin admin = SGDB.getAdmin(session().get("login"));
        if(admin!=null){
            return index();
        }
        return ok(home.render());
    }

    @Transactional
    public static Result login(){
        DynamicForm r = Form.form().bindFromRequest();
        String l = r.get("login");
        String p = r.get("pass");
        if(l.equals("anelroute") && p.equals("AnelRest15kk")){
            session().put("login",l);
            return index();
        }
        return home();
    }

    @Transactional
    public static Result decrementa(Long id){
        Admin admin = SGDB.getAdmin(session().get("login"));
        if(admin!=null){
            SGDB.decrementaTotal(1,id);
        }
        return index();
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
