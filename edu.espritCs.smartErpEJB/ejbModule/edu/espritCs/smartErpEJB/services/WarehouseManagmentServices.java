package edu.espritCs.smartErpEJB.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.espritCs.smartErpEJB.entities.Warehouse;

/**
 * Session Bean implementation class WarehouseManagmentServices
 */
@Stateless
public class WarehouseManagmentServices implements
		WarehouseManagmentServicesRemote, WarehouseManagmentServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public WarehouseManagmentServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addWarehouse(Warehouse warehouse) {
		entityManager.persist(warehouse);

	}

}
