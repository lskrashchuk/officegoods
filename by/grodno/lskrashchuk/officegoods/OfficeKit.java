package by.grodno.lskrashchuk.officegoods;

import java.util.ArrayList;
import java.util.List;

public class OfficeKit implements Cloneable{
	private ArrayList<OfficeGood> kit;

	public ArrayList<OfficeGood> getKit() {
		return kit;
	}

	public void setKit(ArrayList<OfficeGood> kit) {
		this.kit = kit;
	}
	
	public OfficeKit clone() throws CloneNotSupportedException{
		OfficeKit clone = (OfficeKit)super.clone();
		List<OfficeGood> newKit = new ArrayList<OfficeGood>(this.kit.size());

		for (OfficeGood good : this.kit){
			newKit.add((OfficeGood)good.clone());
		}
		clone.setKit((ArrayList<OfficeGood>) newKit);
		return clone;
	}
}
