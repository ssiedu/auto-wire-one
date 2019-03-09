package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientIoC {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ATMMachine machine=context.getBean("machine",ATMMachine.class);
		machine.doWithdraw();
		machine.doBalanceEnquiry();
		

	}

}
