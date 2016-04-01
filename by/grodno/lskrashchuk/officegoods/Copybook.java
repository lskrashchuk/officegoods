package by.grodno.lskrashchuk.officegoods;

import java.math.BigDecimal;

public class Copybook extends OfficeGood{
	private int pagesCount;

	public Copybook(String name, BigDecimal price, int count, int pagesCount) {
		super(name, price, count);
		this.pagesCount = pagesCount;
	}

}
