/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate.the.circle;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class CalculateTheCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
        int a=0, b;
        
        System.out.println("enter the radius");
        b=s.nextInt();
        
        a= 2*3*b;
        
        System.out.println("conclusion "+ a);
        
    }
    
}
