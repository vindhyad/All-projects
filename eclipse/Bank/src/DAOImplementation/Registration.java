package DAOImplementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.DAOinterface.Registrationinterface;

public class Registration implements Registrationinterface{

	public void registration() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Registration");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
				PreparedStatement preparedstatement=connection.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?,?)");
				
				System.out.println("enter first name");
				String fname=sc.next();
				System.out.println("enter last name");
				String lastname=sc.next();
				System.out.println("enter acctype");
				String acctype=sc.next();
				System.out.println("enter pancard");
				String pancard=sc.next();
				System.out.println("enter address");
				String address=sc.next();
				System.out.println("enter password");
				String password=sc.next();
				System.out.println("enter aadhar number");
				long aadhar=sc.nextLong();
				System.out.println("enter phoneno");
				long phoneno=sc.nextLong();
				System.out.println("enter balance");
				double  balance=sc.nextDouble();
				System.out.println("enter accnumber");
				long accnumber=sc.nextLong();
				preparedstatement.setString(1, fname);
				preparedstatement.setString(2, lastname);
				preparedstatement.setString(3, acctype);
				preparedstatement.setString(4,pancard );
				preparedstatement.setString(5, address);
				preparedstatement.setString(6,password);
				preparedstatement.setLong(7,aadhar);
				preparedstatement.setLong(8,phoneno);
				
				preparedstatement.setDouble(9,balance);
				preparedstatement.setLong(10,accnumber);
				int i=preparedstatement.executeUpdate();
				if(i==1) {
					System.out.println("successfull registration");
				}
				else {
					System.out.println("error");
				}
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	


