package com.cg.bankapplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.bankapplication.beans.CustomerDetails;
import com.cg.bankapplication.service.RegisterInterface;
import com.cg.bankapplication.service.RegisterService;

public class Register implements RegisterInterfacedao {

	public CustomerDetails register(CustomerDetails customerDetails) {
		
		RegisterInterface  rlt1=new RegisterService();
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","VINDHYA","oracle123");
				PreparedStatement preparedStatement=connection.prepareStatement("insert into Customer_details(account_no,first_name,last_name,email_id,password,pancard_no,aadhar_no,address,mobile_no,balance) values(account_no_sequence.nextval,?,?,?,?,?,?,?,?)");
				
				preparedStatement.setString(2, customerDetails.getFirstName());
				
				
				preparedStatement.setString(3, customerDetails.getLastName());
				
				preparedStatement.setString(4, customerDetails.getEmailId());
				
				preparedStatement.setString(5,  customerDetails.getPassword());
				
				preparedStatement.setString(6,customerDetails.getPancardNo());
				
				
				preparedStatement.setString(7, customerDetails.getAadharNo());
				
				preparedStatement.setString(8, customerDetails.getAddress());
				
				
				preparedStatement.setString(9,customerDetails.getMobileno());
				
				int i=preparedStatement.executeUpdate();
				if(i==1) {
					System.out.println("registration is successful");
				}
				else {
					System.out.println("not successful");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	

}
