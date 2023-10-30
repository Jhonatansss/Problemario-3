public class Pcongelados extends Productos {
    protected double temprecomendada;

    public Pcongelados(int numeroLoote, String paisorigen, double temprecomendada) {
        super(numeroLoote, paisorigen);
        this.temprecomendada = temprecomendada;
    }

    public Pcongelados() {
    }

    public double getTemprecomendada() {
        return temprecomendada;
    }

    public void setTemprecomendada(double temprecomendada) {
        this.temprecomendada = temprecomendada;
    }
}
