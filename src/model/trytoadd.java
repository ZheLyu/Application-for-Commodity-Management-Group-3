package model;

import Control.ClothController;
import View.addclothView;

public class trytoadd {

	public static void main(String[] args) throws Exception {
		addclothView v = new addclothView();
		Merchansidse m = new Merchansidse();
		Cloth cloth = new Cloth();
		/**m.setMerchansidse(1790);
		m.setIdFactpry(1001);
		m.setNumber(12);
		m.setPrice(1234);
		Cloth cloth = new Cloth();
		cloth.setIdCloth(1790);
		cloth.setColor("red");
		cloth.setType("coolCloth");
		cloth.setSize("s");*/

		//System.out.println(cloth.getColor());
		new ClothController().process_add("red", "coolcloth", "medium", 1999, 1001, 12, 12);
		

	}

}
