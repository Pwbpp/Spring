package com.peng.service.Impl;

import org.springframework.transaction.annotation.Transactional;

import com.peng.dao.AccountDao;
import com.peng.service.AccountService;

@Transactional
public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer,money);
				//断电
				//int i = 1/0;
				accountDao.in(inner,money);
	}
}

			
