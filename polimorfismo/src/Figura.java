public abstract class Figura {
    public abstract void pide_Datos();
    public abstract void imprime_Area();

    protected Cuadrado cuadrado;
    protected Triangulo triangulo;

    public Figura() {
        cuadrado = new Cuadrado();
        triangulo = new Triangulo();
    }


}
