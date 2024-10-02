package org.test.config;

import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Getter
public class SQLConfig {
    private final SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    private final Session session = sessionFactory.openSession();
    private final Transaction transaction = session.beginTransaction();
}
