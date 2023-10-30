public class Villano {
    protected int edad;
    protected String nombre;


    public Villano (int e,String n){
    edad= e;
    nombre = n;
    }
    public Villano(){

    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Villano{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
