package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.*;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class deleteEmployee 
{
    public static void main(String[] args)
    {
    	SessionFactory sf=HibernateUtil.connect();
    	Session ses =sf.openSession();
    	ses.beginTransaction();
    	
    	Employee emp=ses.load(Employee.class, 3);
    	ses.delete(emp);
    	ses.getTransaction().commit();
    	ses.close();
    	sf.close();
    	System.out.println("Deleted sucessfully");
    }
}

