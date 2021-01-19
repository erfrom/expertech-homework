package sibintek.homework.library.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sibintek.homework.library.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public BookDAOImpl (EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Book> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Book> theQuery = currentSession.createQuery("from Book", Book.class);
		List<Book> books = theQuery.getResultList();
		
		return books;
	}

	@Override
	public Book findByIsbn(long isbn) {

		Session currentSession = entityManager.unwrap(Session.class);
		
		Book book = currentSession.get(Book.class, isbn);
		
		return book;
	}

	@Override
	public void save(Book book) {

		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(book);
		
	}

	@Override
	public void deleteByIsbn(long isbn) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query query = currentSession.createQuery("delete from Book where isbn=:bookIsbn");
		query.setParameter("bookIsbn", isbn);
		query.executeUpdate();
	}

}
