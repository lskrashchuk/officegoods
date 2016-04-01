package by.grodno.lskrashchuk.officegoods;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Employee {
	private String name;
	private String position;
	private ArrayList<OfficeGood> officeGoods;
	
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

	public ArrayList<OfficeGood> getOfficeGoods() {
		return officeGoods;
	}

	public void setOfficeGoods(ArrayList<OfficeGood> officeGoods) {
		this.officeGoods = officeGoods;
	}

	public Employee(String name, String position, ArrayList<OfficeGood> officeGoods) {
		super();
		this.name = name;
		this.position = position;
		this.officeGoods = officeGoods;
	}
	
	public BigDecimal totalSummGoogs(){
		BigDecimal result = new BigDecimal("0");
		for (OfficeGood good : this.getOfficeGoods()){
			result = result.add(good.getPrice().multiply(new BigDecimal(good.getCount())));
		}
		return result;
	}
	public String toString(){
		return String.format("%s %s", this.position, this.name);
	}
	
	
	
	

}
