/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changing_number_values;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class Changing_number_values {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int a,b;
        System.out.println("enter the first number value");
        a=s.nextInt();
        System.out.println("enter the second number value");
        b=s.nextInt();
        
        int c=0;
        c=a;
        a=b;
        b=c;
        
        System.out.println("first" + a);
        System.out.println("second" + b);
                
        
    }
    
}
