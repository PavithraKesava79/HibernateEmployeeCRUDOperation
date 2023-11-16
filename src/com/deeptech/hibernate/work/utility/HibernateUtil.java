package com.deeptech.hibernate.work.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
    public static SessionFactory sesfac;
    
    static 
    {
    	sesfac=new Configuration().configure().buildSessionFactory();
    }
    
    public static SessionFactory connect()
    {
    	return sesfac;
    }
}
