package com.jocata.externalservices.dao.impl;

import com.jocata.externalservices.dao.AadharDao;
import com.jocata.externalservices.entity.AadharDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AadharDaoImpl implements AadharDao {
    private final SessionFactory sessionFactory;
    public AadharDaoImpl(SessionFactory sessionFactory){this.sessionFactory = sessionFactory;}

    @Override
    public AadharDetails getAadharInfoDetails(String aadharNumber) {
        Session session=sessionFactory.getCurrentSession();
        String hql = "FROM AadharDetails a WHERE a.aadharNum = :aadharNum";
        Query<AadharDetails> query = session.createQuery(hql, AadharDetails.class);
        query.setParameter("aadharNum", aadharNumber);
        return query.uniqueResult();
    }
}
