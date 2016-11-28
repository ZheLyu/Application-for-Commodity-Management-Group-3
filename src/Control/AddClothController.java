package Control;

import java.util.List;

import View.addclothView;
import model.Cloth;
import model.ClothModify;

public class AddClothController {
	Cloth cloth;
	addclothView view;
	
	public AddClothController(Cloth c, addclothView v){
		this.cloth = c;
		this.view = v;
	}
	
	public Boolean process(String color, String type, String size, int IdCloth) throws Exception{
		cloth.setColor(color);
		cloth.setType(type);
		cloth.setSize(size);
		cloth.setIdCloth(IdCloth);
		new ClothModify(cloth).addCloth();
		view.showResult();
		

		return true;
	}
	

}
