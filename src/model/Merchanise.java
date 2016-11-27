package model;

public class Merchanise {
	private Integer id;
	private Integer supplier_id;
	private Integer price;
	private Integer number;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(Integer supplier_id) {
		this.supplier_id = supplier_id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Merchanise [id=" + id + ", supplier_id=" + supplier_id + ", price=" + price + ", number=" + number
				+ "]";
	}
	
	

}
