/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class JpaUtil {

    private static EntityManagerFactory emf;

    public static EntityManager getManager() {

        return getEmf().createEntityManager();
    }

    public static void fecharEntityManager(EntityManager manager) {
        try {
            manager.close();
        } catch (Exception ex) {
        }
    }

    private static EntityManagerFactory getEmf() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("pontualWebPU");
        }

        return emf;
    }

}
