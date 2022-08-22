package com.dao;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.ClassList;
import com.bean.Student;
import com.bean.Teacher;
public class StudentDao {
	public int storeStudent(Student student) {
		try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            tran.begin();
                    session.save(student);
            tran.commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
	}
	
	public List<Student> findAllStudent() {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        TypedQuery qry = session.createQuery("select s from Student s");
        List<Student> listOfStudent = qry.getResultList();
        return listOfStudent;
    }
	
	public int updateStudent(Student std) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");	//load xml file
		SessionFactory sf = con.buildSessionFactory();	//connection con
		Session session = sf.openSession();	
		Transaction tran = session.getTransaction();		
		Student pp = session.get(Student.class, std.getSid());
		if(pp==null) {
			return 0;
		}
		else {
			tran.begin();
			pp.setCsid(std.getCsid());
			session.update(pp);
			tran.commit();
			return 1;
		}
		
	}
	
	public List<Object[]> findClassStudentDetails() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("select s.sname,c.section,c.cid from Student s,ClassList c where s.csid=c.cid");
		List<Object[]> Details = qry.getResultList();
		return Details;
}
}
