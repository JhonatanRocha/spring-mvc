package br.com.caelum.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCreateTables {
	public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("fj21");
			factory.close();
	}
}


