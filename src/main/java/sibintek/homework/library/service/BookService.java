package sibintek.homework.library.service;

import java.util.List;

import sibintek.homework.library.entity.Book;

public interface BookService {
	
	public List<Book> findAll();
	
	public Book findByIsbn(long isbn);
	
	public void save(Book book);
	
	public void deleteByIsbn(long isbn);

}
