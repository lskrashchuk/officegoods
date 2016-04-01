package by.grodno.lskrashchuk.officegoods;

import java.math.BigDecimal;

public abstract class OfficeGood implements Cloneable{
	private String name;
	private BigDecimal price;
	private int count;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public OfficeGood(String name, BigDecimal price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String toString() {
		return String.format("Наименование: %s, цена: %s, количество: %s", this.getName(), this.getPrice(), this.getCount());
	}
	
	public OfficeGood clone() throws CloneNotSupportedException{
		OfficeGood clone = (OfficeGood)super.clone();
		return clone;
		
	}

}
