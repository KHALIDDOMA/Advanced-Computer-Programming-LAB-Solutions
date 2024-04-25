/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3_s.ex1;

/**
 *
 * @author KHALI
 */

public class Vector {
    private double x;
    private double y;

    public Vector() {
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public double magnitude(){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    
    public double angle(){
        return Math.atan2(y, x);
    }
    
    public void print(){
        System.out.println("xi+yj format is: " + x + "i" + "+" + y + "j");
        System.out.println("Magnitude[angle] format is: " + this.magnitude() + "[" + this.angle() + "]");
    }
    
    public static Vector add(Vector v1, Vector v2){
        Vector vres = new Vector();
        vres.x = v1.x + v2.x;
        vres.y = v1.y + v2.y;
        return vres;
    }
    
    public static Vector sub(Vector v1, Vector v2){
        Vector vres = new Vector();
        vres.x = v1.x - v2.x;
        vres.y = v1.y - v2.y;
        return vres;
    }
    
    public void read(double x, double y){
        this.x = x;
        this.y = y;
    }
}