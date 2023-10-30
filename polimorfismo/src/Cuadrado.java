import java.util.Scanner;

public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public void pide_Datos() {
        System.out.println("ingrese el lado del cuadrado");
    }

    public void imprime_Area(){
        double result=lado*lado;
        System.out.println("El resultado es :"+result);

    }

}
