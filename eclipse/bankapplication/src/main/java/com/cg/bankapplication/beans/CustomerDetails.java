package com.cg.bankapplication.beans;

public class CustomerDetails {
		private String firstName;
		private String lastName;
		private String emailId;
		private String password;
		private String pancardNo;
		private String aadharNo;
		private String address;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		private String mobileno;
		private double balance;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPancardNo() {
			return pancardNo;
		}
		public void setPancardNo(String pancardNo) {
			this.pancardNo = pancardNo;
		}
		public String getAadharNo() {
			return aadharNo;
		}
		public void setAadharNo(String aadharNo) {
			this.aadharNo = aadharNo;
		}
		public String getMobileno() {
			return mobileno;
		}
		public void setMobileno(String mobileno) {
			this.mobileno = mobileno;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
}
