package by.grodno.lskrashchuk.officegoods;

public abstract class OfficeGoods implements Comparable {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract int goodsCount();
	
	public OfficeGoods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub\
		OfficeGoods entry = (OfficeGoods) o;
		int result = price - entry.price;
		if (result !=0){
			return (int) result / Math.abs( result );
		}
		return 0;
	}
	
	

}
