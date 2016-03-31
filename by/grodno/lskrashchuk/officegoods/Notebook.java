package by.grodno.lskrashchuk.officegoods;

public class Notebook extends OfficeGoods{
	private int pagesCount;
	private static int totalCount;

	public Notebook( String name, int price, int pagesCount) {
		super(name, price);
		this.pagesCount = pagesCount;
		totalCount++;
	}

	@Override
	public int goodsCount() {
		// TODO Auto-generated method stub
		return goodsCount();
	}
	
	

}
