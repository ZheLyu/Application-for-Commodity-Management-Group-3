package model;

public class Cloth {
	private String type;
	private Integer idCloth;
	private  String size;
	private  String color;
	public String getType() {
		return type;
	}
	public void setType(String cl_name) {
		this.type = cl_name;
	}
	public Integer getIdCloth() {
		return idCloth;
	}
	public void setIdCloth(Integer idCloth) {
		this.idCloth = idCloth;
	}
	public String getSize(){
		return size;
	}
	public void setSize(String type){
		this.size=type;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "Cloth [_name=" + type + ", idCloth=" + idCloth + ", size="+ size + ",color= "+ color + "]";
	}
}
