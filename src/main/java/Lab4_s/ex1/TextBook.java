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
public class TextBook extends Book{
    
    private final int number_of_pages;
    

    public TextBook(String title,LocalDate releaseDate,double price,int number_of_pages){
        super(title, releaseDate, price);
        this.number_of_pages = number_of_pages;
    }
    
    public int getnumber_of_pages(){return number_of_pages;}
    
    @Override
    public void print(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Number of pages: " + number_of_pages;
    }
}
