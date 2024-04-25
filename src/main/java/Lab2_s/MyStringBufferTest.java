/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Lab2_s;

/**
 *
 * @author KHALI
 */

public class MyStringBufferTest{
    
    static double vectorAverage(Vector[] vArray){
    double sum=0;
    for(Vector v: vArray)
        sum += v.magnitude();
    return sum/vArray.length;
}
    
    public static void main(String[] args){
        double xcor = 3;
        double ycor = 3;
        Vector v1 = new Vector();
        Vector v2 = new Vector(xcor, ycor);

        System.out.println("(" + v1.getX() + "," + v1.getY() + ")");
        System.out.println("(" + v2.getX() + "," + v2.getY() + ")");

        System.out.println("mag1 = " + v1.magnitude() + "\tmag2 = " + v2.magnitude());
        
        System.out.println("angle1 = " + v1.angle() + "\tangle2 = " + v2.angle());
        
        v1.print();
        v2.print();
        
        System.out.println("v1+v2= (" + v1.add(v2).getX() + "," + v1.add(v2).getY() +")");
        System.out.println("v1-v2= (" + v1.sub(v2).getX() + "," + v1.sub(v2).getY() +")");
        
        Vector[] vArray = new Vector[4];
        
        for (int i=0; i < vArray.length; i++) {
            vArray[i] = new Vector(Math.random()*5,Math.random()*5);
            vArray[i].print();
        }
        
        System.out.println("avg = " + vectorAverage(vArray));
    }
}