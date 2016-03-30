package by.grodno.lskrashchuk.officegoods;

public class OfficeGoods implements Comparable {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public OfficeGoods(int price) {
		super();
		this.price = price;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		OfficeGoods entry = (OfficeGoods) o;
		int result = price - entry.price;
		if (result !=0){
			return (int) result / Math.abs( result );
		}
		return 0;
	}
	
	

}
