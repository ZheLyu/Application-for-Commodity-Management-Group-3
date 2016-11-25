package model;

public class Stationery {
	
	private String st_name;
	private Integer idStationery;
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public Integer getIdStationery() {
		return idStationery;
	}
	public void setIdStationery(Integer idStationery) {
		this.idStationery = idStationery;
	}
	@Override
	public String toString() {
		return "Stationery [st_name=" + st_name + ", idStationery=" + idStationery + "]";
	}

	
}
