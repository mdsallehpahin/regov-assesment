package com.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Self {
	public Self(String name) {
		this.id = (new Random()).nextInt(100);
		this.name = name;
	}

	private int id;
	private String name;
	private List<Account> accounts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		if (this.accounts == null) {
			this.accounts = new ArrayList<Account>();
		}
		return accounts;
	} 
}