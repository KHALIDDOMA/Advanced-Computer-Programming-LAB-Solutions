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
public class AudioBook extends Book{
    private final double length_in_min;
    
    public AudioBook(String title,LocalDate releaseDate,double price,double length_in_min){
        super(title, releaseDate, price);
        this.length_in_min = length_in_min;
    }
    
    public double getlength_in_min(){return length_in_min;}
    
    @Override
    public void print(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
        return super.toString() + ", Length in mins: " + length_in_min;
    }
}
