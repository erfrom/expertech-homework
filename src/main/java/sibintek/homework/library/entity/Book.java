package sibintek.homework.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@Column(name="isbn")
	private long isbn;
	
	@Column(name="title")
	private String title;
	
	@Column(name="subtitle")
	private String subtitle;
	
	@Column(name="author")
	private String author;
	
	@Column(name="published")
	private String published;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="pages")
	private int pages;
	
	@Column(name="description")
	private String description;
	
	@Column(name="website")
	private String website;
	
	public Book() {}

	public Book(long isbn, String title, String subtitle, String author, String published, String publisher, int pages,
			String description, String website) {
		this.isbn = isbn;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.published = published;
		this.publisher = publisher;
		this.pages = pages;
		this.description = description;
		this.website = website;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", subtitle=" + subtitle + ", author=" + author
				+ ", published=" + published + ", publisher=" + publisher + ", pages=" + pages + ", description="
				+ description + ", website=" + website + "]";
	}
	

}
