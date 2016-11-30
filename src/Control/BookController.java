package Control;

import java.sql.SQLException;

import model.Book;
import model.BookModify;
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

}
