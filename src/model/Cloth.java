package model;

public class Cloth {
	private String cl_name;
	private Integer idCloth;
	private  String type;
	private  String color;
	public String getCl_name() {
		return cl_name;
	}
	public void setCl_name(String cl_name) {
		this.cl_name = cl_name;
	}
	public Integer getIdCloth() {
		return idCloth;
	}
	public void setIdCloth(Integer idCloth) {
		this.idCloth = idCloth;
	}
	public String getType(String type){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getColor(String color){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "Cloth [_name=" + cl_name + ", idCloth=" + idCloth + ", type="+ type + ",color= "+ color + "]";
	}
}
