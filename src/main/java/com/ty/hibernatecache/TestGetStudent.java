package com.ty.hibernatecache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		Student student1 = entityManager1.find(Student.class, 1);
		System.out.println(student1);
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		Student student2 = entityManager2.find(Student.class, 1);
		System.out.println(student2);

	}

}
