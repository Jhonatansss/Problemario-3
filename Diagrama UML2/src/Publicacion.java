import java.util.GregorianCalendar;

public class Publicacion {
    protected String editor;
    protected GregorianCalendar fecha;

    public Publicacion(String editor, GregorianCalendar fecha) {
        this.editor = editor;
        this.fecha = fecha;
    }

    public void nombraEditor(String nomE){

    }
    public void ponerFecha(){

    }

    public String getEditor() {
        return editor;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

}
