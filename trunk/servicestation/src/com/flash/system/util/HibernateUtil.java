package com.flash.system.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author shan
 */
public class HibernateUtil {

    public static final SessionFactory sessionFactory;
    public static final ThreadLocal session = new ThreadLocal();

    static {
        try {
            Configuration config = new Configuration().configure();
            sessionFactory = config.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session currentSession() throws Exception {
        Session s = (Session) session.get();
        if (s == null) {
            s = sessionFactory.openSession();
            session.set(s);
        }
        return s;
    }

    public static void closeSession() throws Exception {
        Session s = (Session) session.get();
        if (s != null) {
            s.close();
        }
        session.set(null);
    }
}
