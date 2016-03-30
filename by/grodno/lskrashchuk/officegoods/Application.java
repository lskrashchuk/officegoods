package by.grodno.lskrashchuk.officegoods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OfficeGoods> goods1 = new ArrayList<OfficeGoods>();
		goods1.add((OfficeGoods)new Pen(1000));
		goods1.add((OfficeGoods)new Pen(3000));
		goods1.add((OfficeGoods)new Pen(100));
		goods1.add((OfficeGoods)new Notebook(500, 12));
		
		Collections.sort(goods1);
		
		
		Employee emp = new Employee("Вася", "Начальник", (ArrayList<OfficeGoods>) goods1);
        System.out.println(emp);
        printGoods(emp.getOfficeGoods());
	}
	
	public static void printGoods(ArrayList<OfficeGoods> g){
		for (OfficeGoods goods : g){
			System.out.println(goods.getPrice());
		}
	}

}
