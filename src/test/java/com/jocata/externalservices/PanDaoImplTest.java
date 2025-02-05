package com.jocata.externalservices;

import com.jocata.externalservices.dao.impl.PanDaoImpl;
import com.jocata.externalservices.entity.PanDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PanDaoImplTest {

    @Test
    void testGetPanInfoDetails() {
        // Mock dependencies
        SessionFactory sessionFactory = mock(SessionFactory.class);
        Session session = mock(Session.class);
        Query query = mock(Query.class);

        // Stub methods
        when(sessionFactory.getCurrentSession()).thenReturn(session);
        when(session.createQuery("FROM PanDetails p WHERE p.panNum = :panNum", PanDetails.class)).thenReturn(query);
        when(query.setParameter("panNum", "ABCDE1234F")).thenReturn(query);
        when(query.uniqueResult()).thenReturn(new PanDetails());

        // Create DAO instance
        PanDaoImpl panDao = new PanDaoImpl(sessionFactory);

        // Call method
        PanDetails panDetails = panDao.getPanInfoDetails("ABCDE1234F");

        // Verify results
        assertEquals(PanDetails.class, panDetails.getClass());
        verify(query, times(1)).setParameter("panNum", "ABCDE1234F");
    }
}
