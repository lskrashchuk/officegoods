package by.grodno.lskrashchuk.officegoods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OfficeGoods> goods1 = new ArrayList<OfficeGoods>();
		goods1.add((OfficeGoods)new Pen("Ручка шариковая",1000, "синий"));
		goods1.add((OfficeGoods)new Pen("Ручка перьевая", 3000, "черный"));
		goods1.add((OfficeGoods)new Pen("Ручка Паркер", 100, "синий"));
		goods1.add((OfficeGoods)new Notebook("Тетрадь на спирали в мягком переплете",500, 12));
		
		//Collections.sort(goods1);
		//Collections.sort(goods1, new SortByName());
		Collections.sort(goods1, new SortByPriceName());
		
		
		
		Employee emp = new Employee("Вася", "Начальник", (ArrayList<OfficeGoods>) goods1);
        System.out.println(emp);
        printGoods(emp.getOfficeGoods());
	}
	
	public static void printGoods(ArrayList<OfficeGoods> g){
		for (OfficeGoods goods : g){
			System.out.println(goods);
		}
	}

}
