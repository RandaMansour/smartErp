package edu.espritCs.smartErpWeb.ctr;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.espritCs.smartErpEJB.Warehouse;

/**
 * 
 * @author YASMIN
 * 
 */
@ManagedBean
@SessionScoped
public class WarehouseCtr {
	/**
	 * Models
	 */
	private Warehouse warehouse = new Warehouse();
	/**
	 * Injection of the proxy
	 * @return
	 */
	private 

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

}
