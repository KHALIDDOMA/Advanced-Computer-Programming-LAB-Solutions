/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Lab3_s.ex2;

import Lab3_s.ex1.Vector;
import javafx.geometry.Point2D;

/**
 *
 * @author KHALI
 */
public class Line2D {
    private Point2D pos;
    private Vector dir;
    
    public Line2D(Point2D pos, Vector dir){
        this.pos = pos;
        this.dir = dir;
    }
    
    public Line2D(double x_point, double y_point, double x_vector, double y_vector){
        this.pos = new Point2D(x_point, y_point);
        this.dir = new Vector(x_vector, y_vector);
    }
    
    public void print(){
        System.out.println("position: ("+pos.getX()+","+pos.getY()+")");
        System.out.println("direction: "+Math.atan2(dir.getY()-pos.getY(),dir.getX()-pos.getX()));
    }
}
