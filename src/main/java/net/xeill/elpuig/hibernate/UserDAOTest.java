package net.xeill.elpuig.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDAOTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maven");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        User newUser = new User();
        newUser.setEmail("johndoe@elpuig.xeill.net");
        newUser.setFullname("John Doe");
        newUser.setPassword("johndoe");

        entityManager.persist(newUser);

        entityManager.getTransaction().commit();

        entityManager.close();
        factory.close();
    }
}