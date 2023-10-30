import java.util.Scanner;
public class Triangulo extends Figura{
    private float base;
    private  float altura;
    Scanner sc = new Scanner(System.in);

    public Triangulo(String nombreFigura) {
        super(nombreFigura);
    }


    @Override
    public void pideDatos(){
        System.out.println("ingrese la base del Triangulo:");
        base = sc.nextFloat();
        System.out.println("Ingrese la altura del Triangulo");
        altura= sc.nextFloat();
    }

    @Override
    public void imprimeDatos(){
        float area = base*altura/2;
        System.out.println("El area del Triangulo es:"+area);
    }
}
