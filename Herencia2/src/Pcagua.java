public class Pcagua extends Pcongelados {
    private double isalinidad;

    public Pcagua(int numeroLoote, String paisorigen, double temprecomendada, double isalinidad) {
        super(numeroLoote, paisorigen, temprecomendada);
        this.isalinidad = isalinidad;
    }

    public Pcagua() {
    }

    public double getIsalinidad() {
        return isalinidad;
    }

    public void setIsalinidad(double isalinidad) {
        this.isalinidad = isalinidad;
    }

    @Override
    public String toString() {
        return "Pcagua{" +
                "isalinidad=" + isalinidad +
                ", temprecomendada=" + temprecomendada +
                ", numeroLoote=" + numeroLoote +
                ", paisorigen='" + paisorigen + '\'' +
                '}';
    }
}
