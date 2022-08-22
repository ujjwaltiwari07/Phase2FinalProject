package com.dao;

import java.util.List;

import javax.persistence.Parameter;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.ClassList;
import com.bean.Teacher;


public class ClassDao {
	public int storeClass(ClassList cls) {
		try {
            Configuration con = new Configuration();
            con.configure("hibernate.cfg.xml");
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction tran = session.getTransaction();
            tran.begin();
                    session.save(cls);
            tran.commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
	}
	
	public List<ClassList> findAllClass() {
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        TypedQuery qry = session.createQuery("select s from ClassList s");
        List<ClassList> listOfClass = qry.getResultList();
        return listOfClass;
    }
	
	public int updateClass(ClassList cls) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");	//load xml file
		SessionFactory sf = con.buildSessionFactory();	//connection con
		Session session = sf.openSession();	
		Transaction tran = session.getTransaction();		
		ClassList pp = session.get(ClassList.class, cls.getCid());
		Teacher tt = new Teacher();
		if(pp==null) {
			return 0;
		}
		else {
			tran.begin();
			pp.setTcid(cls.getTcid());
			session.update(pp);
			tran.commit();
			return 1;
		}
		
	}
	
	public List<Object[]> findClassAndTeacherDetails() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("select t.tname,c.section,c.cid from Teacher t,ClassList c where c.tcid=t.tid");
		List<Object[]> Details = qry.getResultList();
		return Details;
}
	public List<Object[]> findClassReport(int cid) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		System.out.println(cid);
		//TypedQuery qry = session.createQuery("select c.section,c.cid,s.sid,s.sname,s.age from ClassList c,Student s where s.csid=c.cid");
		TypedQuery qry = session.createQuery("select c.section,c.cid,s.sid,s.sname,s.age from ClassList c,Student s where c.cid=:ci").setParameter("ci", cid);
		List<Object[]> Details = qry.getResultList();
		return Details;
}

}
