package sibintek.homework.library.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sibintek.homework.library.dao.BookDAO;
import sibintek.homework.library.entity.Book;

@Service
public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO;
	
	public BookServiceImpl (BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Override
	@Transactional
	public List<Book> findAll() {
		return bookDAO.findAll();
	}

	@Override
	@Transactional
	public Book findByIsbn(long isbn) {
		return bookDAO.findByIsbn(isbn);
	}

	@Override
	@Transactional
	public void save(Book book) {
		bookDAO.save(book);
	}

	@Override
	@Transactional
	public void deleteByIsbn(long isbn) {
		bookDAO.deleteByIsbn(isbn);
	}

}
