/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate_rectangle;
import java.util.Scanner;

/**
 *
 * @author Busra
 */
public class Calculate_rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,d=0, b,c;
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter the long side");
        b=s.nextInt();
        System.out.println("enter the short side");
        c=s.nextInt();
        
        a=b+b+c+c;
        d= b*c;
        
        System.out.println("result of field account"+ d);
        System.out.println("result of environmental calculation"+ a);
        
        
    }
    
}
