package com.cg.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cg.model.CustomerDetails;
import com.cg.model.TransactionDetails;

public class SessionManagament {
	public Session getSession() {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(CustomerDetails.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
	}
}
