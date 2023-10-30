public class Fecha {
    private int dia;
    private String mes;
    private int anio;

    public Fecha(){

    };

    public Fecha(int dia, String mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAno(int anio) {
        this.anio = anio;
    }

    public void imprimirFecha(){
        System.out.println(dia + "/" + mes + "/" + anio);
    }

    @Override
    public String toString() {
        return "Fecha: " + dia + " de " + mes + " del " + anio;
    }
}
