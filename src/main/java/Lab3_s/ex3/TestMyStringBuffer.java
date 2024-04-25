/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3_s.ex3;

/**
 *
 * @author KHALI
 */
public class TestMyStringBuffer {

    public static void main(String[] args) {
        
        MyStringBuffer str = new MyStringBuffer("Hello Java");
        str.print();
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        str.erase(6,4);
        str.print();
        str.insert(6, "World");
        str.print();
    }   
}