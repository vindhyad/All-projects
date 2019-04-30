package com.cg.dao;

import com.cg.model.CustomerDetails;

public interface UserEntryDao {
	int register(CustomerDetails cd);
	CustomerDetails login(int id,String password);
}
