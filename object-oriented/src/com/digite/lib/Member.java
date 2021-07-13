package com.digite.lib;


public class Member {
	private String name;
	private Book book;
	
	public Member() {
		this.name=null;
		this.book=null;
		
	}
	
	public Member(String name) {
		this.name=name;
		
	}
	
	public void status() {
		if(book==null) {
			System.out.println(name +" has not issued any books.");
		}
		else
			System.out.println(name +" has issued book.");
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
