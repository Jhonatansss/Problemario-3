package Unidad3;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int b=1;
    while(b == 1){
        Scanner sc=new Scanner(System.in);
    
        try {
            int numerador;
            int denominador ;
            System.out.println("Escribe el numerador");
            numerador =sc.nextInt();
            System.out.println("Escribe el denominador");
            denominador=sc.nextInt();
            int resultado = numerador/denominador;
            System.out.println("El resultado es"+resultado+"\n");
            System.out.println("Desea salir del programa presione 0");
            b =sc.nextInt();
        } catch (ArithmeticException e) {
            System.out.println("Error"+ e.getMessage());
        }
    }
    
    }   

}