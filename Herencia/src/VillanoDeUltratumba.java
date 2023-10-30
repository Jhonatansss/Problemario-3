public class VillanoDeUltratumba extends Villano implements SerDeUltratumba{
    private String legion;

    public VillanoDeUltratumba(int e, String n, String legion) {
        super(e, n);
        this.legion = legion;
    }


    @Override
    public void asustar() {
        System.out.println("buuuuu!!!!");
    }
    @Override
    public void gritar() {
        System.out.println("uaaaaay!!");

    }
}
