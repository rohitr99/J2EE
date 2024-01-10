package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.demo.model.Employee;



public class UpdateEmployee {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee p=session.get(Employee.class, 21);
		p.setEname("shanta");
		//session.update(p);
		//session.saveOrUpdate(p);
		session.merge(p);
		
		tr.commit();
		session.close();
		sf.close();
		
		
	}
}
