package com.inventory.printerpartsconsumables.service.impl;

import java.util.List;

import com.inventory.printerpartsconsumables.dao.BookDao;
import com.inventory.printerpartsconsumables.model.Book;
import com.inventory.printerpartsconsumables.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Transactional
	public void saveBook(Book book) {
		bookDao.saveBook(book);
	}

	@Transactional(readOnly = true)
	public List<Book> listBooks() {
		return bookDao.listBooks();
	}

	@Transactional(readOnly = true)
	public Book getBook(Long id) {
		return bookDao.getBook(id);
	}

	@Transactional
	public void deleteBook(Long id) {
		bookDao.deleteBook(id);

	}

}
