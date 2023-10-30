public class Triangulo extends Figura{
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }


    public void pide_Datos() {
        System.out.println("Ingrese la base del triangulo: ");
        System.out.println("Ingrese la altura del triangulo: ");
    }

    public void imprime_Area() {


    }
}
