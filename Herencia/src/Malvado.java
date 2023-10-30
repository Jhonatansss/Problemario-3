public class Malvado extends Villano {
    private boolean extraterrestre;

    public Malvado(int e, String n, boolean extraterrestre) {
        super(e, n);
        this.extraterrestre = extraterrestre;
    }

    public Malvado(int e, String n) {
        super(e, n);
    }

    public Malvado() {
    }

    @Override
    public String toString() {
        return "Malvado{" +
                "extraterrestre=" + extraterrestre +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
