package org.example2.dao.daoIMPL;

import org.example2.entity.Medicines;

import java.util.List;

public interface PharmacyDao {

    void searchByPharmacyId(Long id);
    List<Medicines> getAllMedicinesByPharmacyId(Long pharmacyId);
    PharmacyDao getPharmacyByWorkerId(Long workerId);
}
