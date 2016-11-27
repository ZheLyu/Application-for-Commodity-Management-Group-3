package model;

public class Supplier {
	private Integer idSupplier;
	private String telephone;
	private String address;
	private String name;
	public Integer getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(Integer idSupplier) {
		this.idSupplier = idSupplier;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Supplier [idSupplier=" + idSupplier + ", telephone=" + telephone + ", address=" + address + ", name="
				+ name + "]";
	}
	
	

}
