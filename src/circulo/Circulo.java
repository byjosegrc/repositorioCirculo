/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;
import java.util.Scanner;
/**
 *
 * @author BYJOSEGRC
 */
public class Circulo {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
final double PI=3.1416;
// TODO Apéndice de método generado automáticamente
try{
Scanner s=new Scanner(System.in);
System.out.println("Introduce el radio:");
double r=s.nextDouble();
double area=(PI*r*r);
System.out.printf("El valor del área es %f\n", area);
}
catch(Exception ex){
    System.out.println(ex.getMessage());
}
}
}
    

