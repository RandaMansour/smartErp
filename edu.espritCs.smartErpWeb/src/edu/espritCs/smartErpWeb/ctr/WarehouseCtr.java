package edu.espritCs.smartErpWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.espritCs.smartErpEJB.entities.Warehouse;
import edu.espritCs.smartErpEJB.services.WarehouseManagmentServicesLocal;

@ManagedBean
@SessionScoped
public class WarehouseCtr {

	// Models
	private Warehouse warehouse = new Warehouse();
	// Injection of the proxy
	@EJB
	private WarehouseManagmentServicesLocal warehouseManagmentServicesLocal;
	// The Method
	public String doAddWarehouse(){
		warehouseManagmentServicesLocal.addWarehouse(warehouse);
		return "";
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	

}
