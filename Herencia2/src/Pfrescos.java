public class Pfrescos extends Productos {
    private int fechaenvasado;

    public Pfrescos(int numeroLoote, String paisorigen, int fechaenvasado) {
        super(numeroLoote, paisorigen);
        this.fechaenvasado = fechaenvasado;
    }

    public Pfrescos() {
    }

    public int getFechaenvasado() {
        return fechaenvasado;
    }

    public void setFechaenvasado(int fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    @Override
    public String toString() {
        return "Pfrescos{" +
                "fechaenvasado=" + fechaenvasado +
                ", numeroLoote=" + numeroLoote +
                ", paisorigen='" + paisorigen + '\'' +
                '}';
    }
}
