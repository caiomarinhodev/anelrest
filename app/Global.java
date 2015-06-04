import models.Admin;
import models.GenericDAO;
import models.Usuario;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;

import java.util.List;

/**
 * Created by caio on 24/03/15.
 */

public class Global extends GlobalSettings {

    private static GenericDAO dao = new GenericDAO();

    @Override
    public void onStart(Application app) {
        Logger.info("inicializada...");

        JPA.withTransaction(new play.libs.F.Callback0() {

            public void invoke() throws Throwable {

                List<Admin> lis = dao.findAllByClassName(Admin.class.getName());
                if (lis.size() <3) {
                    Admin a = new Admin("anelroute","AnelRest15kk");
                    Usuario u = new Usuario("Teste", "111.111.111-11",10);
                    dao.persist(a);
                    dao.persist(u);

//
//                    for(int i=1; i<=31; i++){
//                        Usuario cli = new Usuario("cl"+i,"cl"+i,"cl"+i,1,"","","",foto);
//                        dao.persist(cli);
//                    }


                    dao.flush();
                    Logger.info("Inserindo dados no BD.");
                }
            }
        });
    }

    public void onStop(Application app) {
        Logger.info("desligada...");
    }

}