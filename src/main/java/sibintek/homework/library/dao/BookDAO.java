package sibintek.homework.library.dao;

import java.util.List;

import sibintek.homework.library.entity.Book;

public interface BookDAO {
	
	public List<Book> findAll();
	
	public Book findByIsbn(long isbn);
	
	public void save(Book book);
	
	public void deleteByIsbn(long isbn);

}
