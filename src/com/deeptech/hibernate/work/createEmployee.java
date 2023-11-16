package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work.dto.*;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class createEmployee {
    public static void main(String[] args) {
        // Creating an Employee object and setting its properties
        Employee emp = new Employee();
        emp.setEmpname("Pavithra");
        emp.setEmail("kpavithra3674@gmail.com");
        emp.setMobilenum("9384584693");
        emp.setAge(20);
        emp.setSalary(500000);
        emp.setState("TamilNadu");
        

        // Establishing a session and saving the Employee object to the database
        SessionFactory sf = HibernateUtil.connect();
        Session ses = sf.openSession();
        ses.beginTransaction();
        ses.save(emp);
        ses.getTransaction().commit();
        ses.close();
        sf.close();

        System.out.println("Record inserted successfully");
    }
}