package com.cg.dao;


import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.cg.model.CustomerDetails;
import com.cg.utility.SessionManagament;

public class UserEntryDaoImpl implements UserEntryDao {
	SessionManagament sessionManagament = new SessionManagament();
	public int register(CustomerDetails cd) {
		// TODO Auto-generated method stub
		int i = 0;
		 CustomerDetails c = new CustomerDetails();
		try {
			Session session = sessionManagament.getSession();
	        Transaction transaction = session.beginTransaction();
	        session.persist(cd);
	        transaction.commit();
	        Query query = session.createQuery("select accountNo from CustomerDetails where aadharNo = "+cd.getAadharNo());
	        java.util.List list = query.list();
	        i = (Integer) list.get(0);
	       
		}
		catch(Exception e) {
			
		}
		return i;
	}

	public CustomerDetails login(int id, String password) {
		// TODO Auto-generated method stub
		CustomerDetails cd = null;
		Session session = sessionManagament.getSession();
//        Transaction transaction = session.beginTransaction();
//        Query query = session.createQuery("from CustomerDetails");
//        java.util.List list = query.list();
//        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			CustomerDetails customerDetails = (CustomerDetails) iterator.next();
//			if(id == customerDetails.getAccountNo() && password.equals(customerDetails.getPassword())) {
//				cd = customerDetails;
//			}
//			
//		}
		cd = session.get(CustomerDetails.class, id);
		if(!cd.getPassword().equals(password))
			cd=null;
//        transaction.commit();
        session.close();
        return cd;
	}

}
