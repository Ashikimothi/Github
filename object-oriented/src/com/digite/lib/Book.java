package com.digite.lib;


public class Book {
	private String title;
	private Member mbr;
	
	
	public Book() {
		this.title=null;
		this.mbr=null;
		
	}
	
	
	public Book(String title) {
		this.title=title;
	}
	
	
   public void issueBook(Member m) {
	   
	   if(mbr!=null)
		   System.out.println(title+" is already issued.");
	   else	   
	     System.out.println(m.getName() + "has issued the "+ title);	   
	   
   }
   
   public Member getMbr() {
	return mbr;
    }

public void returnBook(Member m1) {
	   System.out.println(m1.getName() + " has returned the "+ title);
	   
   }
   
   public String getTitle() {
	   return title;
	   
   }
 
   public void status() {
	   if(mbr==null)
	     System.out.println(title+" is not issued to any memmber");
	   else 
		   System.out.println(title +" is issued to"+ mbr.getName());
   }

}
