import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Villano> listVilla= new ArrayList<Villano>();
        Malvado ob1=new Malvado(18,"Andres",true);
        Malvado ob2=new Malvado(19,"Jhony",true);
        Villano ob3=new Villano(20,"Jhon");

        listVilla.add(ob1);
        listVilla.add(ob2);
        listVilla.add(ob3);

        for(int i= 0; i < listVilla.size(); i++){
            System.out.println(listVilla.get(i));

        }

        /*for (Villano villan : listVilla) {
            System.out.println(villan);
        }*/
        VillanoDeUltratumba villa = new VillanoDeUltratumba(18,"elias","mal");
        villa.asustar();
        villa.gritar();
    }




}
