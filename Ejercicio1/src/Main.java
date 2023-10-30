import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Compra> listaCompras = new ArrayList<Compra>();

        Compra venta1= new Compra("asd12", 10, "Octubre", 2023, 10, 11);
        Compra venta2 = new Compra("1000", 10 , "octubre", 2023, 18, 43);
        Compra venta3 = new Compra("2dq3s", 10, "octubre", 2023, 11, 11);
        listaCompras.add(venta1);
        listaCompras.add(venta2);
        listaCompras.add(venta3);

        for(int i = 0; i < listaCompras.size(); i++)
        {
            System.out.println("Compra " + (i+1));
            System.out.println(listaCompras.get(i));
            System.out.println(" ");

        }



    }


}
