package com.whit.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarDAO {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("message");
		factory.close();

	}
}
