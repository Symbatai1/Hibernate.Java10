package org.example2.dao;

import org.example2.entity.Medicines;

import java.util.List;

public interface MedicinesDao {
   List<Medicines> getAllPriceBySort(boolean ascending);

}
