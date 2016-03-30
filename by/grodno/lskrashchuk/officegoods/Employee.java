package by.grodno.lskrashchuk.officegoods;

import java.util.ArrayList;

public class Employee {
	private String name;
	private String position;
	private ArrayList<OfficeGoods> officeGoods;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public ArrayList<OfficeGoods> getOfficeGoods() {
		return officeGoods;
	}

	public void setOfficeGoods(ArrayList<OfficeGoods> officeGoods) {
		this.officeGoods = officeGoods;
	}

	public Employee(String name, String position, ArrayList<OfficeGoods> officeGoods) {
		super();
		this.name = name;
		this.position = position;
		this.officeGoods = officeGoods;
	}
	
	public String toString(){
		return String.format("%s %s", this.position, this.name);
	}
	
	
	
	

}
