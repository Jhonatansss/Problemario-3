import java.util.GregorianCalendar;

public class Revista extends Publicacion{
    private int numerosPorAnio;
    private long circulacion;


    public void fijarNumerosAnio(int n){

    }
    public void fijarCirculacion(long n){

    }

    @Override
    public String toString() {
        return "Revista{" +
                "numerosPorAnio=" + numerosPorAnio +
                ", circulacion=" + circulacion +
                ", editor='" + editor + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public Revista(String editor, GregorianCalendar fecha, int numerosPorAnio, long circulacion) {
        super(editor, fecha);
        this.numerosPorAnio = numerosPorAnio;
        this.circulacion = circulacion;
    }
}
