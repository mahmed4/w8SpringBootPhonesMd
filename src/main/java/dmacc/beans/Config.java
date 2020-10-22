package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Config {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String make;
	private String model;
	private int year;
	private String cpu;
	
	public Config() {
		super();
	}

	public Config(String make, String model, int year, String cpu) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.cpu = cpu;
	}
	
	public Config(long id, String make, String model, int year, String cpu) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.cpu = cpu;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Config [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", cpu=" + cpu + "]";
	}
	

	
	
}
