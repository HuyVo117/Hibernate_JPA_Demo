package model;

import jakarta.persistence.*;

import javax.script.ScriptEngineManager;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test_001");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        TypedQuery<UseraccountEntity> query = entityManager.createQuery("SELECT s FROM  UseraccountEntity s", UseraccountEntity.class);
        List<UseraccountEntity> list = query.getResultList();
        list.forEach(useraccountEntity -> System.out.println(useraccountEntity.getUsername()));
    }
}
