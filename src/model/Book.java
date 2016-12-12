package model;

public class Book {
	private String b_name;
	private int idBook;
	private  int isbn;
	private  String genre;
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}
	public int getIsbn(){
		return isbn;
	}
	public void setIsbn(int Isbn){
		this.isbn=Isbn;
	}
	public String getGenre(){
		return genre;
	}
	public void setGenre(String genre){
		this.genre=genre;
	}
	
	@Override
	public String toString() {
		return "Book [_name=" + b_name + ", idCloth=" + idBook + ", isbn="+ isbn + ",genre= "+ genre + "]";
	}
}


