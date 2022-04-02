/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrival_time_calculation;
import java.util.Scanner;
/**
 *
 * @author Busra
 */
public class Arrival_Time_Calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        int km;
        double hour;
        
        System.out.println("enter the km");
        km=s.nextInt();
        System.out.println("enter the hour");
        hour=s.nextDouble();
        
        double a = km/hour;
        System.out.println("average speed "+ a);
        
    }
    
}
