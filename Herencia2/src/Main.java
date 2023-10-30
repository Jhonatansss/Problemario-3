import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Productos> listProductos= new ArrayList<Productos>();
        Pfrescos obf= new Pfrescos(12,"africa",27);
        Pfrescos obf2= new Pfrescos(1,"España2",2003);
        Prefrigerados obr=new Prefrigerados(4,"España",123012);
        Prefrigerados obr2= new Prefrigerados(5,"Australia",1000);
        Prefrigerados obr3= new Prefrigerados(5,"Australia",1001);
        Pcagua obc=new Pcagua(32,"México",38.5,15);
        Pcagua obc2=new Pcagua(15,"Chile",25.6,5);
        Pcnitrogeno obc3=new Pcnitrogeno(32,"Salvador",5.2,"Encapsulado");


        listProductos.add(obf);
        listProductos.add(obf2);
        listProductos.add(obr);
        listProductos.add(obr2);
        listProductos.add(obr3);
        listProductos.add(obc);
        listProductos.add(obc2);
        listProductos.add(obc3);


        for(int i= 0; i < listProductos.size(); i++){
            System.out.println(listProductos.get(i));

        }



    }
}
