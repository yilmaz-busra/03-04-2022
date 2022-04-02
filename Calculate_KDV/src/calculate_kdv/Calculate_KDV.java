/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate_kdv;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class Calculate_KDV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int a,b;
        System.out.println(" Starting Price");
        a=s.nextInt();
        
        b=(a*18/100) +a;
        
        System.out.println("final price "+ b);
        
    }
    
}
