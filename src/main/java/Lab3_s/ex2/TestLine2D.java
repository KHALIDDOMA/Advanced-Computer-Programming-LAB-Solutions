/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3_s.ex2;

import Lab3_s.ex1.Vector;
import javafx.geometry.Point2D;

/**
 *
 * @author KHALI
 */
public class TestLine2D {
    public static void main(String[] args) {
        Point2D point = new Point2D(2,3);
        Vector vector = new Vector(3,4);
        
        Line2D line = new Line2D(point, vector);
        
        line.print();
    }
    
}