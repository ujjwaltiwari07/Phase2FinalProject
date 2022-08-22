package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Student;
import com.bean.Subject;

public class SubjectDao {
	public int storeSubject(Subject subject) {
		try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            tran.begin();
                    session.save(subject);
            tran.commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
	}
	
	public List<Subject> findAllSubject() {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        TypedQuery qry = session.createQuery("select s from Subject s");
        List<Subject> listOfSubject = qry.getResultList();
        return listOfSubject;
    }
	
	public int updateSubject(Subject sub) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");	//load xml file
		SessionFactory sf = con.buildSessionFactory();	//connection con
		Session session = sf.openSession();	
		Transaction tran = session.getTransaction();		
		Subject pp = session.get(Subject.class, sub.getSubid());
		if(pp==null) {
			return 0;
		}
		else {
			tran.begin();
			pp.setTsid(sub.getTsid());
			session.update(pp);
			tran.commit();
			return 1;
		}
		
	}
	
	public List<Object[]> findSubjectAndTeacherDetails() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("select s.subname,t.tname from Subject s,Teacher t where s.tsid=t.tid");
		List<Object[]> Details = qry.getResultList();
		return Details;
}
}
