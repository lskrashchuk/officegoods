package by.grodno.lskrashchuk.officegoods;

import java.math.BigDecimal;

public class Pen extends OfficeGood{
	private String color;

	public Pen(String name, BigDecimal price, int count, String color) {
		super(name, price, count);
		this.color = color;
	}


}
