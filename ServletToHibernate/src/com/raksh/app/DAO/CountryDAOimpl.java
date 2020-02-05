package com.raksh.app.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.raksh.app.Entity.CountryEntity;


public class CountryDAOimpl implements CountryDAO{

	@Override
	public void save(CountryEntity entity) {
		try {
			Configuration cnf = new Configuration();
			cnf.configure("resources/hibernate.cfg.xml");
			cnf.addAnnotatedClass(CountryEntity.class);
			SessionFactory sfactory = cnf.buildSessionFactory();
			Session session = sfactory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			
			session.close();
			sfactory.close();
			
		} catch (HibernateException he) {
			he.printStackTrace();
		}
	}


		
	}





