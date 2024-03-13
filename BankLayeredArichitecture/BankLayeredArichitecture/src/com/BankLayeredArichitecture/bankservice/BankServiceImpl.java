package com.bank.bankservice;

import com.bank.bankdao.BankDaoImpl;
import com.bank.model.Account;

public class BankServiceImpl implements BankService {

	BankDaoImpl dao;

	public BankServiceImpl() {
		dao = new BankDaoImpl();
	}

	@Override
	public String createAccount(Account account) {
		return dao.createAccount(account);
	}

	@Override
	public float showBalance(Long accNo) {

		return dao.showBalance(accNo);
	}

	@Override
	public float deposit(Long accNo, float depositAmount) {

		return dao.deposit(accNo, depositAmount);
	}

	@Override
	public float withdraw(Long accNo, float withdrawAmount) {

		return dao.withdraw(accNo, withdrawAmount);
	}

	@Override
	public float fundTransfer(Long accNoFrom, Long accNoTo, float transferAmount) {

		return dao.fundTransfer(accNoFrom, accNoTo, transferAmount);
	}

}
