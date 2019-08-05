import java.util.Scanner;
/**
 * Write a description of class CapacidadCalorica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CapacidadCalorica
{public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
         
        System.out.println("Ingrese la cantidad de agua en Kilogramos:");
        double kilogramos = input.nextDouble();
        System.out.println("Ingrese temperatura inicial:");
        double inicialTemperatura = input.nextDouble();
        System.out.println("Ingresa la temperatura final esperada:"); 
        double finalTemperatura = input.nextDouble();
         
        double energia = kilogramos * (finalTemperatura - inicialTemperatura) * 4184;
         
        System.out.println("\n La energia expresada en julios necesaria es: " + energia);;
    }
} 
   
