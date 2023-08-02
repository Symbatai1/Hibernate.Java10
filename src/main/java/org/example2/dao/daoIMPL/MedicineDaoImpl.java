package org.example2.dao.daoIMPL;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example2.dao.MedicinesDao;
import org.example2.entity.Medicines;

import java.util.List;

public class MedicineDaoImpl  implements MedicinesDao {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<Medicines> getAllPriceBySort(boolean ascending) {
        String query = "SELECT m FROM Medicines m WHERE m.price >= 0 ORDER BY m.price " + (ascending ? "ASC" : "DESC");
        TypedQuery<Medicines> typedQuery = entityManager.createQuery(query, Medicines.class);
        return typedQuery.getResultList();}


}
