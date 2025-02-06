package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.CibilDao;
import com.jocata.externalservices.entity.CibilDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CibilDaoImpl implements CibilDao {

    private final SessionFactory sessionFactory;

    public CibilDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<CibilDetails> getCibilDetails(String panNumber) {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM CibilDetails p WHERE p.pan = :panNum";
        Query<CibilDetails> query = session.createQuery(hql, CibilDetails.class);
        query.setParameter("panNum", panNumber);
        return query.getResultList();
    }
}
