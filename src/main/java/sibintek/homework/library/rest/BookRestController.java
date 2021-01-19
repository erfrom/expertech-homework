package sibintek.homework.library.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.tools.rmi.ObjectNotFoundException;
import sibintek.homework.library.entity.Book;
import sibintek.homework.library.entity.BookWrapper;
import sibintek.homework.library.service.BookServiceImpl;

@RestController
@RequestMapping("/api")
public class BookRestController {
	
	private BookServiceImpl bookService;
	
	@Autowired
	public BookRestController(BookServiceImpl bookService) {
		this.bookService = bookService;
	}
	
	@GetMapping("/books")
	public List<Book> findAll() {
		return bookService.findAll();
	}
	
	@GetMapping("/books/{isbn}")
	public Book getBook(@PathVariable long isbn) throws ObjectNotFoundException {
		Book book = bookService.findByIsbn(isbn);
		if (book == null) {
			throw new ObjectNotFoundException("Book with ISBN " + isbn + " not found!");
		}
		return book;
	}
	
	@PostMapping("/books")
	public Book[] addBook(@RequestBody BookWrapper bookWrapper) {
		Book[] books = bookWrapper.getBooks();
		for (Book book : books) bookService.save(book);
		return books;
	}
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		bookService.save(book);
		return book;
	}
	
	@DeleteMapping("/books/{isbn}")
	public String deleteBook(@PathVariable long isbn) {
		Book tempBook = bookService.findByIsbn(isbn);
		 if (tempBook == null) {
			 throw new NullPointerException("Book with ISBN " + isbn + " not found in database");
		 }
		 bookService.deleteByIsbn(isbn);
		 return "Deleted book with ISBN - " + isbn;
	}
	
}
