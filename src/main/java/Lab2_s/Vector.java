/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab2_s;

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
    
    public Vector add(Vector v){
        Vector vres = new Vector();
        vres.x = this.x + v.x;
        vres.y = this.y + v.y;
        return vres;
    }
    
    public Vector sub(Vector v){
        Vector vres = new Vector();
        vres.x = this.x - v.x;
        vres.y = this.y - v.y;
        return vres;
    }
}