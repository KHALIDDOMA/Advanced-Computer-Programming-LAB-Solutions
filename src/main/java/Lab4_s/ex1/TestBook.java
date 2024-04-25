/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab4_s.ex1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author KHALI
 */
public class TestBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Books: ");
        int numBooks = scanner.nextInt();
        Book[] books = new Book[numBooks];
        
        
//        TextBook t1= new TextBook("t1", d1, 100, 157);
//        TextBook t2= new TextBook("t2", d1, 150, 158);        
//        AudioBook a1= new AudioBook("a1", d1, 10, 60);        
//        AudioBook a2= new AudioBook("a2", d1, 35, 70);        

        
        for(int i=0; i < numBooks; i++){
            System.out.print("Enter (0) for Text Book, (1) for Audio Book: ");
            int choice = scanner.nextInt();
            System.out.print("Enter Title: ");
            String title = scanner.next();
            System.out.print("Enter Release Date in format \"yy/mm/dd\": ");
            String releasestring = scanner.next();
            String[] dateList = releasestring.split("/");
            LocalDate releaseDate = LocalDate.of(Integer. parseInt(dateList[0]), Integer.parseInt(dateList[1]), Integer.parseInt(dateList[2]));
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            
            switch (choice) {
                case 0:
                    {
                        System.out.print("Enter Number of pages: ");
                        int pages = scanner.nextInt();
                        books[i] = new TextBook(title,releaseDate,price,pages);
                        break;
                    }
                case 1:
                    {
                        System.out.print("Enter Length in mins: ");
                        int length_in_min = scanner.nextInt();
                        books[i] = new AudioBook(title,releaseDate,price,length_in_min);
                        break;
                    }
                default:
                    System.out.print("Enter (0) for Text Book, (1) for Audio Book!!: ");
                    i--;
                    break;
            }
        }
        
        System.out.println("\nList of Entered Books:");
        for(Book book : books){
            book.print();
        }
        
        scanner.close();
    }   
}
