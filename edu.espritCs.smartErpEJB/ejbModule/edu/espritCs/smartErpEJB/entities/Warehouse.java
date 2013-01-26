package edu.espritCs.smartErpEJB.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Warehouse
 *
 */
@Entity

public class Warehouse implements Serializable {

	
	private int idWarehouse;
	private static final long serialVersionUID = 1L;

	public Warehouse() {
		super();
	}   
	@Id    
	public int getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(int idWarehouse) {
		this.idWarehouse = idWarehouse;
	}
   
}
