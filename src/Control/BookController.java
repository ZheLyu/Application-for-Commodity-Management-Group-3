package Control;

import java.sql.SQLException;

import model.Book;
import model.BookModify;
import model.ClothModify;
import model.MerchandiseModify;
import model.Merchansidse;

public class BookController {
	Book book;
	Merchansidse m;
	
	public BookController(){
		this.book = new Book();
		this.m = new Merchansidse();
	}
	
	public Boolean process_delNumber(String name, int number) throws SQLException{
		int id = new BookModify(book).delBookNumber(name);
		new MerchandiseModify(m).delMerchandiseNumber(id, number);
		
		return true;
	}
	
	public Boolean process_add(String name, String genre, int isbn, int price, int number, int id,int supplierId) throws Exception{
		book.setB_name(name);
		book.setGenre(genre);
		book.setIdBook(id);
		book.setIsbn(isbn);
		m.setMerchansidse(id);
		m.setIdFactpry(supplierId);
		m.setPrice(price);
		m.setNumber(number);
		new MerchandiseModify(m).addMerchandise();;
		new BookModify(book).addBook();		
		return true;
	}

}
