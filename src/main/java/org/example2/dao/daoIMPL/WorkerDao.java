package org.example2.dao.daoIMPL;

import org.example2.entity.Worker;

import java.util.List;

public interface WorkerDao {
     List<Worker> getAllWorkerByPharmacyId(Long pharmacyId);
    List<Worker> getAllSalaryBySort(boolean ascending);
}
