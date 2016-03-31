package by.grodno.lskrashchuk.officegoods;

import java.util.Comparator;

public class SortByPriceName implements Comparator<OfficeGoods>{

	@Override
	public int compare(OfficeGoods o1, OfficeGoods o2) {
		int p1 = o1.getPrice();
		int p2 = o2.getPrice();
		int result = p1 - p2;
		if (result != 0) {
			return result / Math.abs(result); 
		}
		
		String s1 = o1.getName();
		String s2 = o2.getName();
		result = s1.compareTo(s2);
		if (result != 0) {
			return result;
		}
		return 0;
	}

}
