package controllers;

import models.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Created by Caio on 31/05/2015.
 */
public class SGDB {

    private static GenericDAO dao = new GenericDAO();

    // Atividade

    public static void addUsuario(String nome, String cpf, int total ){
        User u = new User(nome,cpf,total);
        dao.persist(u);
        dao.flush();
    }

    public static User getUsuario(long id){
        return dao.findByEntityId(User.class,id);
    }

    public static Admin getAdmin(String login){
        List<Admin> l = dao.findByAttributeName(Admin.class.getName(),"login", login);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static boolean incrementaTotal(int t, long iduser){
        User u = getUsuario(iduser);
        if(u!=null){
            u.setTotal(u.getTotal()+t);
            dao.merge(u);
            dao.flush();
            return true;
        }
        return false;
    }

    public static boolean decrementaTotal(int t, long iduser){
        User u = getUsuario(iduser);
        if(u!=null){
            if(u.getTotal()>0){
                u.setTotal(u.getTotal()-t);
                dao.merge(u);
                dao.flush();
                return true;
            }
        }
        return false;
    }

    public static void setCpfUsuario(long id, String cpf){
        User u = getUsuario(id);
        if(u!=null){
            u.setCpf(cpf);
            dao.merge(u);
            dao.flush();
        }
    }

    public static User getUsuario(String cpf){
        List<User> l = dao.findByAttributeName(User.class.getName(),"cpf",cpf);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static void setNomeUsuario(long id, String nome){
        User u = getUsuario(id);
        if(u!=null){
            u.setNome(nome);
            dao.merge(u);
            dao.flush();
        }
    }

    public static void removeUsuario(User u){
        if(u!=null){
            dao.remove(u);
            dao.flush();
        }
    }

    public static void removeUsuario(long id){
        User a= dao.findByEntityId(User.class,id);
        if(a!=null){
            dao.remove(a);
            dao.flush();
        }
    }

    public static List<User> getAllUsers(){
        return dao.findAllByClassName(User.class.getName());
    }


}
