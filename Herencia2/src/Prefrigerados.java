public class  Prefrigerados extends Productos {

    private int codigo;

    public Prefrigerados(int numeroLoote, String paisorigen, int codigo) {
        super(numeroLoote, paisorigen);
        this.codigo = codigo;
    }

    public Prefrigerados() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Prefrigerados{" +
                "codigo=" + codigo +
                ", numeroLoote=" + numeroLoote +
                ", paisorigen='" + paisorigen + '\'' +
                '}';
    }
}
