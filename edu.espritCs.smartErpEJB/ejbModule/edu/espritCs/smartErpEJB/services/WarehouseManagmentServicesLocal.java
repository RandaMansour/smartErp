package edu.espritCs.smartErpEJB.services;

import javax.ejb.Local;

import edu.espritCs.smartErpEJB.entities.Warehouse;

@Local
public interface WarehouseManagmentServicesLocal {
	void addWarehouse(Warehouse warehouse);
}
