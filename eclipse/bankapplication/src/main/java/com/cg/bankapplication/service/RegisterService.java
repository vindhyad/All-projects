package com.cg.bankapplication.service;

import com.cg.bankapplication.beans.CustomerDetails;
import com.cg.bankapplication.dao.Register;
import com.cg.bankapplication.dao.RegisterInterfacedao;

public class RegisterService implements RegisterInterface {
	RegisterInterfacedao registerInterfaceDao=new Register();
	public CustomerDetails register(CustomerDetails customerDetails) {
		CustomerDetails cd= registerInterfaceDao.register(customerDetails);
		return cd;
		
	}
	public boolean  isAadharValid(String aadharNo) {
		boolean b=true;
		if(aadharNo.length()==12) {
			return b;
		}
		else {
			System.out.println("Invalid aadhar number");
			
		}
		return b;
	}
	public boolean isMobileNoValid(String mobileNo) {
		boolean b=true;
		if(mobileNo.length()==12) {
			return b;
		}
		else {
			System.out.println("Invalid mobile number");
			
		}
		return false;
	}

	

}
