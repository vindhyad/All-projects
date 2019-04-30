package com.cg.bankapplication.service;

import com.cg.bankapplication.beans.CustomerDetails;

public interface RegisterInterface {
public CustomerDetails register(CustomerDetails customerDetails);

public boolean isAadharValid(String aadharNo);

public boolean isMobileNoValid(String mobileNo);
}
