package com.cognizant.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.account.dao.AccountDao;
import com.cognizant.account.model.Account;
@Service
public class AccountService {
	@Autowired
	AccountDao accountDao;
	public Account getAccountDetails(String number) {
		return accountDao.getAccountDetails(number);
	}
}
