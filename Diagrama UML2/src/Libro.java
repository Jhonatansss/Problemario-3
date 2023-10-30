import java.util.GregorianCalendar;

public class Libro extends Publicacion{
    private String isbn;
    private String autor;

    public void ponerISBN(String nota){

    }
    public void ponerAutor(String nombre){

    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", editor='" + editor + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public Libro(String editor, GregorianCalendar fecha, String isbn, String autor) {
        super(editor, fecha);
        this.isbn = isbn;
        this.autor = autor;
    }
}
