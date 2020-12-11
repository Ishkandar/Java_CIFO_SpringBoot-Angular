package com.cifolavioleta.springbackend.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String publisher;
	@OneToMany(mappedBy = "book")
	private List<Quote> quotes;
	
	public Book() {}
	
	public Book(Long id, String title, String publisher) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.quotes = new ArrayList<>();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this.getClass() == obj.getClass()) return true;
		if (this == obj) return true;
		
		Book bookObject = (Book) obj;
		
		if (this.id == bookObject.id && 
				this.title.equals(bookObject.title) &&
				this.publisher.equals(bookObject.publisher)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return String.format("Book: [id = %d, name = '%s', publisher = '%s']", id, title, publisher);
	}
}
