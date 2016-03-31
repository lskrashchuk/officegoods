package by.grodno.lskrashchuk.officegoods;

public class Pen extends OfficeGoods{

	private String color;
	private static int totalCount;
	public Pen(String name, int price, String color) {
		super(name, price);
		this.color = color;
		totalCount++;
	}

	@Override
	public int goodsCount() {
		// TODO Auto-generated method stub
		return totalCount;
	}

}
