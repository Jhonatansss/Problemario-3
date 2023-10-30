public class Pcnitrogeno extends Pcongelados{

    private String imetodo;

    public Pcnitrogeno(int numeroLoote, String paisorigen, double temprecomendada, String imetodo) {
        super(numeroLoote, paisorigen, temprecomendada);
        this.imetodo = imetodo;
    }

    public Pcnitrogeno() {
    }

    public String getImetodo() {
        return imetodo;
    }

    public void setImetodo(String imetodo) {
        this.imetodo = imetodo;
    }

    @Override
    public String toString() {
        return "Pcnitrogeno{" +
                "imetodo='" + imetodo + '\'' +
                ", temprecomendada=" + temprecomendada +
                ", numeroLoote=" + numeroLoote +
                ", paisorigen='" + paisorigen + '\'' +
                '}';
    }
}
