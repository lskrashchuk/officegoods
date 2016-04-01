package by.grodno.lskrashchuk.officegoods;

import java.math.BigDecimal;
import java.util.Comparator;

public class SortByPrice implements Comparator<OfficeGood>{

	@Override
	public int compare(OfficeGood o1, OfficeGood o2) {
		BigDecimal p1 = o1.getPrice();
		BigDecimal p2 = o2.getPrice();
		int result = p1.compareTo(p2);
		return result;
	}

}
