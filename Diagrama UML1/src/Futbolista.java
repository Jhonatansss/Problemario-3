public class Futbolista extends SeleccionDeFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void jugarPartido(){

    }
    public void entrenar(){

    }


}
