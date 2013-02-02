package edu.espritCs.smartErpWeb.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import edu.espritCs.smartErpEJB.entities.Warehouse;
import edu.espritCs.smartErpEJB.services.WarehouseManagmentServicesLocal;

@ManagedBean
@SessionScoped
public class WarehouseCtr {

	// Models
	private Warehouse warehouse = new Warehouse();
	private List<Warehouse> warehouses = new ArrayList<Warehouse>();
	private DataModel<Warehouse> modelWarehouse = new ListDataModel<Warehouse>();
	private Warehouse selectedWarehouse=new Warehouse();
	// Injection of the proxy
	@EJB
	private WarehouseManagmentServicesLocal warehouseManagmentServicesLocal;

	// The Method
	public String selectWarehouse(){
		selectedWarehouse = modelWarehouse.getRowData();
		return "updateWarehouse";
	}
	public String doUpdateWarehouse(){
		warehouseManagmentServicesLocal.updateWarehouse(selectedWarehouse);
		return "";
	}
	public String doDeleteWarehouse() {
		Warehouse warehouseTMP = modelWarehouse.getRowData();
		warehouseManagmentServicesLocal.deleteWarehouseById(warehouseTMP.getIdWarehouse());
		return "";
		
	}

	public String doAddWarehouse() {
		warehouseManagmentServicesLocal.addWarehouse(warehouse);
		return "";
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public List<Warehouse> getWarehouses() {
		warehouses = warehouseManagmentServicesLocal.listAllWarehouses();
		return warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}

	public DataModel<Warehouse> getModelWarehouse() {
		modelWarehouse.setWrappedData(warehouseManagmentServicesLocal
				.listAllWarehouses());
		return modelWarehouse;
	}

	public void setModelWarehouse(DataModel<Warehouse> modelWarehouse) {
		this.modelWarehouse = modelWarehouse;
	}

	public Warehouse getSelectedWarehouse() {
		return selectedWarehouse;
	}

	public void setSelectedWarehouse(Warehouse selectedWarehouse) {
		this.selectedWarehouse = selectedWarehouse;
	}

}
