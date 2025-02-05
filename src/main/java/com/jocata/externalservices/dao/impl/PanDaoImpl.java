package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.PanDao;
import com.jocata.externalservices.entity.PanDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class PanDaoImpl implements PanDao {

    private final SessionFactory sessionFactory;

    public PanDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public PanDetails getPanInfoDetails(String panNum) {

        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM PanDetails p WHERE p.panNum = :panNum";
        Query<PanDetails> query = session.createQuery(hql, PanDetails.class);
        query.setParameter("panNum", panNum);
        return query.uniqueResult();
    }
}
