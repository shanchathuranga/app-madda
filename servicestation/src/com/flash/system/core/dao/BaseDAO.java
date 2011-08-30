package com.flash.system.core.dao;

import com.flash.system.core.entity.Customer;
import com.flash.system.core.entity.EmployeeType;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author shan
 */
public class BaseDAO {

    @SuppressWarnings("unused")
    private static final Logger log = Logger.getAnonymousLogger();
    @SuppressWarnings("unchecked")
    private static final ThreadLocal session = new ThreadLocal();
    private static final SessionFactory sessionFactory = new AnnotationConfiguration()
            .addPackage("com.flash.system.core.entity")
            .addAnnotatedClass(Customer.class)
            .addAnnotatedClass(EmployeeType.class)
            .configure().buildSessionFactory();

    @SuppressWarnings("unchecked")
    public static Session getSession() {
        Session session = (Session) BaseDAO.session.get();
        if (session == null) {
            session = sessionFactory.openSession();
            BaseDAO.session.set(session);
        }
        return session;
    }

    protected void begin() {
        getSession().beginTransaction();
    }

    protected void commit() {
        getSession().getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    protected void rollback() {
        try {
            getSession().getTransaction().rollback();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        try {
            getSession().close();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        }
        BaseDAO.session.set(null);
    }

    @SuppressWarnings("unchecked")
    public static void close() {
        getSession().close();
        BaseDAO.session.set(null);
    }
}
