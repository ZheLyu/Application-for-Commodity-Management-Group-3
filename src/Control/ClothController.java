package Control;

import View.addclothView;
import model.Cloth;
import model.ClothModify;
import model.MerchandiseModify;
import model.Merchansidse;

public class ClothController {
	Cloth cloth;
	Merchansidse m;
	addclothView view;
	
	public ClothController(addclothView v){
		this.cloth = new Cloth();
		this.m = new Merchansidse();
		this.view = v;
	}
	
	public Boolean process_add(String color, String type, String size, int IdCloth, int supplierId, int price, int number) throws Exception{
		cloth.setColor(color);
		cloth.setType(type);
		cloth.setSize(size);
		cloth.setIdCloth(IdCloth);
		m.setMerchansidse(IdCloth);
		m.setIdFactpry(supplierId);
		m.setPrice(price);
		m.setNumber(number);
		new ClothModify(cloth).addCloth();
		new MerchandiseModify(m).addMerchandise();;
		//view.showResult();		
		return true;
	}
	
	public Boolean process_update(){
		return true;
	}
	
	public Boolean  process_del(){
		return true;
	}

}
