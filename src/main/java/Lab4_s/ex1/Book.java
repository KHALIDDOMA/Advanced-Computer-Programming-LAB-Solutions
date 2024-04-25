/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4_s.ex1;

import java.time.LocalDate;

/**
 *
 * @author KHALI
 */
public class Book {
    private static int count;
    private final int ID;
    private final String title;
    private final LocalDate releaseDate;
    private final double price;
    
    public Book(String title, LocalDate releaseDate, double price){
        count++;
        this.ID = count;
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
    }
    
    public int getID(){return ID;}
    public String gettitle(){return title;}
    public LocalDate getreleaseDate(){return releaseDate;}
    public double getprice(){return price;}
    
    @Override
    public String toString(){
        return "ID: " + ID + ", Title: " + title + ", Release Date: " + releaseDate + ", Price: $" + price; 
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof Book)) return false;
        Book book = (Book)obj;
        return ID == book.ID && title.equals(book.title) && releaseDate.equals(book.releaseDate);
    }
    
    public void print(){
        System.out.println("ID: " + getID());
        System.out.println("Title: " + gettitle());
        System.out.println("Release: " + getreleaseDate());
        System.out.println("Price: " + getprice());
    }
}
