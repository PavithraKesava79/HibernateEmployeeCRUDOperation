package com.deeptech.hibernate.work;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work.dto.*;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class readEmployee 
{
    public static void main(String[] args)
    {
    	SessionFactory sf=HibernateUtil.connect();
    	Session ses=sf.openSession();
    	ses.beginTransaction();
    	
    	Query q=ses.createQuery("from Employee");
    	List<Employee>ls=q.list();
    	for(Employee emp:ls)
		{
			System.out.println(emp.getEmpname()+"\t"+emp.getEmail()+"\t"+emp.getAge()+"\t"+emp.getMobilenum()+"\t"+emp.getSalary()+"\t"+emp.getState());
		}
        ses.getTransaction().commit();
    			
    }
}

