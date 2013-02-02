package edu.espritCs.smartErpEJB.services;

import java.util.List;

import javax.ejb.Local;

import edu.espritCs.smartErpEJB.entities.Warehouse;

@Local
public interface WarehouseManagmentServicesLocal {
	void addWarehouse(Warehouse warehouse);
	List<Warehouse> listAllWarehouses();
	void deleteWarehouseById(int idWarehouse);
	void updateWarehouse(Warehouse warehouse);
}
