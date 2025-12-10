import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] productos = {
                "pan","vienesa","tomate","palta","mayonesa","ketchup","chucrut","salsa americana"
        };
        int [] precios = {
                2000, 3500, 1200, 2500, 3200, 3300, 1000, 1100
        };

        int subtotal = 0;

        Scanner sc = new Scanner(System.in);
        int m = 0;
        do{

            System.out.println("==================================");
            System.out.println("      LoopCommerce - Consola      ");
            System.out.println("==================================");
            System.out.println("1) Ver productos disponibles");
            System.out.println("2) Agregar productos al carrito");
            System.out.println("3) Ver subtotal actual");
            System.out.println("4) Realizar checkout");
            System.out.println("5) Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    int index = 0;
                    for(String prod : productos){

                        System.out.println(index+1+") "+prod+" $"+precios[index]);
                        index++;
                    }

                    break;

                case 2:
                    int seleccion;
                    do {
                        System.out.println("\nIngrese el numero del producto que desea agregar: ");
                        int inde = 0;
                        for (String prod : productos) {
                            System.out.println(inde+1+") "+prod+" $"+precios[inde]);
                            inde++;
                        }
                        System.out.println("\n0)Salir: ");

                        System.out.println("Su seleccion:");
                        seleccion = sc.nextInt();

                        if (seleccion > 0 && seleccion < productos.length) {
                            subtotal += precios[seleccion];
                            System.out.println(productos[seleccion] + "se agrego al carrito");

                        }
                        else if (seleccion != 0){
                            System.out.println("Seleccion invalida");
                            }


                        } while (seleccion != 0);
                    }


        }while(m==0);

    }
}
