package model;
public class Merchansidse {
	private int idMerchansidse;
	private int idFactory;
	private float price;
	private int number;

	public Integer getIdMerchansidse() {
		return idMerchansidse;
	}
	public void setMerchansidse(int idMerchansidse) {
		this.idMerchansidse = idMerchansidse;
		if(idMerchansidse/1000==1){
			Cloth cloth= new Cloth();
			cloth.setIdCloth(idMerchansidse);
		}
		if(idMerchansidse/1000==2){
			Book book= new Book();
			book.setIdBook(idMerchansidse);
		}
		if(idMerchansidse/1000==3){
			Stationery stationery= new Stationery();
			stationery.setIdStationery(idMerchansidse);
		}
		
	}
	public int getIdFactory(int IdFactory){
		return IdFactory;
	}
	public void setIdFactpry(int IdFactory){
		this.idFactory=IdFactory;
	}
	public float getPrice(float price ){
		return price;
	}
	public void setPrice(float price){
		 this.price=price;
	}
	public int getNumber(int number ){
		return number;
	}
	public void setNumber(int number){
		 this.number=number;
	}


}
