package com.cpg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cpg.repos.A;
import com.cpg.repos.C;

@Component
public class B {
	A a;
	C c;

	@Autowired
	public B(A a, C c) {
		super();
		this.a = a;
		this.c = c;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	public C getC() {
		return c;
	}
	@Autowired
	public void setC(C c) {
		this.c = c;
	}

	public void register() {
		System.out.println("In B");
		c.savingB();
		a.savingB();
	}

	
}
