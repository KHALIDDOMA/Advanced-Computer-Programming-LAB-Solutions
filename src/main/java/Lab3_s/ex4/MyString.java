/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_s.ex4;

/**
 *
 * @author KHALI
 */
public class MyString {
    private final char[] string;
    
    public MyString(String string){
        this.string = string.toCharArray();
    }
    
    public void print(){
        System.out.println(new String(string));
    }
    
    public int indexOf(char c){
        for(int i=0; i < string.length; i++)
            if(string[i] == c)
                return i;
        return -1;
    }
    
    public int length(){
        return string.length;
    }
    
    public MyString erase(int index, int length){
        if(index < 0 || index+length > string.length || length > string.length ){
            System.out.println("Invalid index or length for erase operation.");
            return this;
        }
        char[] newstring = new char[string.length - length];
        System.arraycopy(string, 0, newstring, 0, index);
        System.arraycopy(string, index + length, newstring, index, string.length - index -length);
        return new MyString(new String(newstring));
    }
    
    public MyString insert(int index, String str){
        if(index < 0 || index > string.length){
            System.out.println("Invalid index or length for erase operation.");
            return this;
        }
        char[] newstring = new char[string.length+str.length()];
        System.arraycopy(string, 0, newstring, 0, index);
        System.arraycopy(str.toCharArray(), 0, newstring, index, str.length());
        System.arraycopy(string, index, newstring, index+str.length(), string.length-index);
        return new MyString(new String(newstring));
    }
    
    
    
}