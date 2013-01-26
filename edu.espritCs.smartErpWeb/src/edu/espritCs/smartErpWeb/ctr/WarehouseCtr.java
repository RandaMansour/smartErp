package edu.espritCs.smartErpWeb.ctr;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.espritCs.smartErpEJB.entities.Warehouse;

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

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	/**
	 * Injection of the proxy
	 * 
	 * @return
	 */

}
