package com.cg.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cg.model.CustomerDetails;
import com.cg.model.TransactionDetails;
import com.cg.utility.SessionManagament;

public class TransactionDaoImpl implements TransactionDao{
	SessionManagament sessionManagament = new SessionManagament();
	Session session = sessionManagament.getSession();
	public int withdraw(int accountNo, int amount, int balance) {
		// TODO Auto-generated method stub
		int bal = 0;
		Transaction transaction = session.beginTransaction();
		CustomerDetails cd = session.get(CustomerDetails.class, accountNo);
		if(cd.getBalance() > amount) {
			bal = cd.getBalance()-amount;
			cd.setBalance(bal);
			session.update(cd);
			transaction.commit();
		}
		return bal;
	}

	public int deposit(int accountNo, int amount, int balance) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		CustomerDetails cd = session.get(CustomerDetails.class, accountNo);
		int bal = cd.getBalance()+amount;
		cd.setBalance(bal);
		session.update(cd);
		transaction.commit();
		return bal;
	}

	public int showBalance(int accountNo) {
		// TODO Auto-generated method stub
		CustomerDetails cd = session.get(CustomerDetails.class, accountNo);
		return cd.getBalance();
	}

	public int fundTransfer(int fromAccountNo, int toAccountNo, int amount) {
		// TODO Auto-generated method stub
		int fromBal = 0;
		Transaction transaction = session.beginTransaction();
		CustomerDetails fromCustomer = session.get(CustomerDetails.class, fromAccountNo);
		CustomerDetails toCustomer = session.get(CustomerDetails.class, toAccountNo);
		if(fromCustomer.getBalance() > amount) {
			fromBal = fromCustomer.getBalance()-amount;
			fromCustomer.setBalance(fromBal);
			toCustomer.setBalance(toCustomer.getBalance()+amount);
			session.update(fromCustomer);
			session.update(toCustomer);
			TransactionDetails t = new TransactionDetails();
			t.setFromCustomer(fromAccountNo);
			t.setToCustomer(toAccountNo);
			t.setAmount(amount);
	        session.persist(t);
	        transaction.commit();
		}
		return fromBal;
	}

}
