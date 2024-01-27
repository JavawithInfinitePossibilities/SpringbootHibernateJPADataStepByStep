package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.BankAccount;
import com.sid.tutorials.springboot.hibernate.services.IBankAccountService;

@SpringBootTest(classes = Section18TransactionManagment.class)
class Section18TransactionManagmentTest {

	@Autowired
	private IBankAccountService ibankAccountServices;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testBankAccountTransactio() {
		BankAccount from = ibankAccountServices.save(BankAccount.builder().name("Sid-Sahu").balance(1000).build());
		BankAccount to = ibankAccountServices.save(BankAccount.builder().name("Sus-Sahoo").balance(500).build());

		ibankAccountServices.transactionAccount(from, to, 500);
	}
}
