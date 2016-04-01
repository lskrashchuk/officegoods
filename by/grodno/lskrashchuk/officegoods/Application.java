package by.grodno.lskrashchuk.officegoods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Junior Kit
		OfficeKit JuniorKit = new OfficeKit();
		List<OfficeGood> goods = new ArrayList<OfficeGood>();
		goods.add(new Pen("Gel pen", new BigDecimal("5000"), 1, "black"));
		goods.add(new Pen("Ballpen", new BigDecimal("5000"), 1, "black"));
		goods.add(new Pen("Fountain pen", new BigDecimal("1000"), 1, "blue"));
		goods.add(new Copybook("Thin copybook", new BigDecimal("3500"), 5, 12));
		JuniorKit.setKit((ArrayList<OfficeGood>) goods);

		System.out.println("Sort by price");
		Collections.sort(JuniorKit.getKit(), new SortByPrice());
		printGoods(JuniorKit.getKit());

		System.out.println("Sort by name");
		Collections.sort(JuniorKit.getKit(), new SortByName());
		printGoods(JuniorKit.getKit());

		System.out.println("Sort by price by name");
		Collections.sort(JuniorKit.getKit(), new SortByPriceName());
		printGoods(JuniorKit.getKit());

		// Create new employee
		OfficeKit clone = JuniorKit.clone();

		Employee emp = new Employee("Ivanov I.I.", "Boss", clone.getKit());
		// Increase count of pens for this employee
		emp.getOfficeGoods().get(0).setCount(3);
		System.out.println(emp);
		printGoods(emp.getOfficeGoods());
		System.out.println("Total summ:" + emp.totalSummGoogs());

		// Check set of Junior Kit
		printGoods(JuniorKit.getKit());

	}

	public static void printGoods(List<OfficeGood> g) {
		for (OfficeGood goods : g) {
			System.out.println(goods);
		}
	}

}
