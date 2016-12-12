package Control;

import java.sql.SQLException;

import model.BookModify;
import model.Cloth;
import model.ClothModify;
import model.MerchandiseModify;
import model.Merchansidse;

public class ClothController {
	Cloth cloth;
	Merchansidse m;

	
	public ClothController(){
		this.cloth = new Cloth();
		this.m = new Merchansidse();
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
		new MerchandiseModify(m).addMerchandise();
		
		new ClothModify(cloth).addCloth();		
		return true;
	}
	
	public Boolean process_update(){
		return true;
	}
	
	public Boolean process_delNumber(String name, int number) throws SQLException{
		int id = new ClothModify(cloth).delClothNumber(name);
		new MerchandiseModify(m).delMerchandiseNumber(id, number);
		
		return true;
	}

}
