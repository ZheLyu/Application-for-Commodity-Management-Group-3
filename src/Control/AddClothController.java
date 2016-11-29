package Control;

import java.util.List;

import View.addclothView;
import model.Cloth;
import model.ClothModify;
import model.MerchandiseModify;
import model.Merchansidse;

public class AddClothController {
	Cloth cloth;
	Merchansidse m;
	addclothView view;
	
	public AddClothController(addclothView v){
		this.cloth = new Cloth();
		this.m = new Merchansidse();
		this.view = v;
	}
	
	public Boolean process(String color, String type, String size, int IdCloth) throws Exception{
		cloth.setColor(color);
		cloth.setType(type);
		cloth.setSize(size);
		cloth.setIdCloth(IdCloth);
		new ClothModify(cloth).addCloth();
		new MerchandiseModify(m).addMerchandise();;
		//view.showResult();
		

		return true;
	}
	

}
