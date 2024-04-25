/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3_s.ex4;

/**
 *
 * @author KHALI
 */
public class TestMyString {

    public static void main(String[] args) {
        
        MyString str = new MyString("Hello Java");
        str.print();
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        str=str.erase(6,4);
        str.print();
        str=str.insert(6, "World");
        str.print();
    }
    
    
}