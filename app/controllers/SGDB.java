package controllers;

import models.*;

import java.util.List;

/**
 * Created by Caio on 31/05/2015.
 */
public class SGDB {

    private static GenericDAO dao = new GenericDAO();

    // Atividade

    public static void addUsuario(String nome, String cpf, int total ){
        Usuario u = new Usuario(nome,cpf,total);
        dao.persist(u);
        dao.flush();
    }

    public static Usuario getUsuario(long id){
        return dao.findByEntityId(Usuario.class,id);
    }

    public static Admin getAdmin(String login){
        List<Admin> l = dao.findByAttributeName(Admin.class.getName(),"login", login);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static boolean incrementaTotal(int t, long iduser){
        Usuario u = getUsuario(iduser);
        if(u!=null){
            u.setTotal(u.getTotal()+t);
            dao.merge(u);
            dao.flush();
            return true;
        }
        return false;
    }

    public static boolean decrementaTotal(int t, long iduser){
        Usuario u = getUsuario(iduser);
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
        Usuario u = getUsuario(id);
        if(u!=null){
            u.setCpf(cpf);
            dao.merge(u);
            dao.flush();
        }
    }

    public static Usuario getUsuario(String cpf){
        List<Usuario> l = dao.findByAttributeName(Usuario.class.getName(),"cpf",cpf);
        if(l.size()>0){
            return l.get(0);
        }
        return null;
    }

    public static void setNomeUsuario(long id, String nome){
        Usuario u = getUsuario(id);
        if(u!=null){
            u.setNome(nome);
            dao.merge(u);
            dao.flush();
        }
    }

    public static void removeUsuario(Usuario u){
        if(u!=null){
            dao.remove(u);
            dao.flush();
        }
    }

    public static void removeUsuario(long id){
        Usuario a= dao.findByEntityId(Usuario.class,id);
        if(a!=null){
            dao.remove(a);
            dao.flush();
        }
    }

    public static List<Usuario> getAllUsers(){
        return dao.findAllByClassName(Usuario.class.getName());
    }


}
