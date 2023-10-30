abstract class Productos {
    protected int numeroLoote;
    protected String paisorigen;

    public Productos(int numeroLoote, String paisorigen) {
        this.numeroLoote = numeroLoote;
        this.paisorigen = paisorigen;
    }

    public Productos() {
    }

    public int getNumeroLoote() {
        return numeroLoote;
    }

    public void setNumeroLoote(int numeroLoote) {
        this.numeroLoote = numeroLoote;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }
}
