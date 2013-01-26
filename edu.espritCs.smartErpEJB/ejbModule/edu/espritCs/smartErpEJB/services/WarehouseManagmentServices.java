package edu.espritCs.smartErpEJB.services;

import javax.ejb.Stateless;

import edu.espritCs.smartErpEJB.Warehouse;

/**
 * Session Bean implementation class WarehouseManagmentServices
 */
@Stateless
public class WarehouseManagmentServices implements WarehouseManagmentServicesRemote, WarehouseManagmentServicesLocal {

    /**
     * Default constructor. 
     */
    public WarehouseManagmentServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addWarehouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		
	}

}
