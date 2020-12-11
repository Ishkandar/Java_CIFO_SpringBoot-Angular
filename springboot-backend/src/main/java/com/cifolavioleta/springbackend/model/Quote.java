package com.cifolavioleta.springbackend.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "quote")
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String content;
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
	private String subject;
	
	public Quote() {}
	
	public Quote(Long id, String subject, String content) {
		super();
		this.subject = subject;
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this.getClass() == obj.getClass()) return true;
		if (this == obj) return true;
		
		Quote quoteObject = (Quote) obj;
		
		if (this.id == quoteObject.id && 
				this.subject.equals(quoteObject.subject) &&
				this.content.equals(quoteObject.content)) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return String.format("Quote: [id = %d, '\n' subject = '%s' '\n' quote = '%s']", id, subject, content);
	}
}
