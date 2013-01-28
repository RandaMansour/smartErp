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
	private String nameWarehouse;
	private String locality;
	
	private static final long serialVersionUID = 1L;

	public Warehouse() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdWarehouse() {
		return this.idWarehouse;
	}

	public void setIdWarehouse(int idWarehouse) {
		this.idWarehouse = idWarehouse;
	}
	public String getNameWarehouse() {
		return nameWarehouse;
	}
	public void setNameWarehouse(String nameWarehouse) {
		this.nameWarehouse = nameWarehouse;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}

