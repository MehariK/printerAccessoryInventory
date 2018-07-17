//package com.inventoy.bookstore.dao;
package com.inventory.printerpartsconsumables.dao;

import java.util.List;
//import com.inventory.bookstore.model.Book;
import com.inventory.printerpartsconsumables.model.Book;

public interface BookDao {

	/*
	 * CREATE and UPDATE
	 */
	public void saveBook(Book book); // create and update

	/*
	 * READ
	 */
	public List<Book> listBooks();
	public Book getBook(Long id);

	/*
	 * DELETE
	 */
	public void deleteBook(Long id);
}
