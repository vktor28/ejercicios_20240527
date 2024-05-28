import java.util.ArrayList;
import java.util.Scanner;

public class App {
/*
Eres el dueño de dos tiendas de diferente tipo y queremos que los
clientes se inscriban para un mismo sorteo.
Tenemos una papelería y una tienda de informática. Crear un interface
sorteoClientes que contenga los métodos inscribirDatos() (nombre y
telefono) y comunicarResultado() para que los clientes puedan apuntarse
al sorteo desde ambas tiendas, y que puedan conocer el resultado en ambos
casos ("ha salido ganador el número tal").

+EXTRA: una vez te funcione el interface, crea un sorteo random, por ejemplo número del 1 al 1000, y comunica ese número en comunicarResultado()


 */
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        
        Papeleria c1 = new Papeleria("Pere",650000000);
        System.out.println(c1);
        c1.inscribirDatos(c1.getNombre(),c1.getTelefono());
        c1.comunicarResultado();

        Papeleria c2 = new Papeleria("Rosa",670000000);
        System.out.println(c2);
        c2.inscribirDatos(c2.getNombre(),c2.getTelefono());
        c2.comunicarResultado();

        Informatica d1 = new Informatica("Sara",610000000);
        System.out.println(d1);
        d1.inscribirDatos(d1.getNombre(),d1.getTelefono());
        c2.comunicarResultado();

        Informatica d2 = new Informatica("Román",640000000);
        System.out.println(d2);
        d2.inscribirDatos(d2.getNombre(),d2.getTelefono());
        c2.comunicarResultado();



        }

}
