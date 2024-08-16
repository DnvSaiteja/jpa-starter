package com.dnvdev;

import com.dnvdev.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAStarterMain {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("Foo Bar");

        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("myAppPG");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();


    }
}