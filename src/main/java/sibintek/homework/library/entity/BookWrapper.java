package sibintek.homework.library.entity;

public class BookWrapper {
	
	private Book[] books;
	
	public BookWrapper() {}

	public BookWrapper(Book[] books) {
		super();
		this.books = books;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}
	
	

}
