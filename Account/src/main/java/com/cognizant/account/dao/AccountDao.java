package com.cognizant.account.dao;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.account.model.Account;
@Component("accountDao")
public class AccountDao {
	private static ArrayList<Account> accountList;

	public static ArrayList<Account> getAccountList() {
		return accountList;
	}

	public static void setAccountList(ArrayList<Account> accountList) {
		AccountDao.accountList = accountList;
	}

	public AccountDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("account.xml");
		this.setAccountList((ArrayList) context.getBean("accountList"));

	}
	public Account getAccountDetails(String number) {
		for (Account account : accountList) {
			if(account.getNumber().equals(number)){
				return account;
			}
		}
		return null;
	}

}
