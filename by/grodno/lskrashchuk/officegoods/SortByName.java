package by.grodno.lskrashchuk.officegoods;

import java.util.Comparator;

public class SortByName implements Comparator<OfficeGoods> {

	@Override
	public int compare(OfficeGoods o1, OfficeGoods o2) {
		String s1 = o1.getName();
		String s2 = o2.getName();
		return s1.compareTo(s2);
	}


}
