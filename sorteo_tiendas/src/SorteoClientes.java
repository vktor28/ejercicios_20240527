import java.util.Random;

interface SorteoClientes {
    Random rnd = new Random();
    int resultadoSorteo = rnd.nextInt((1000-1)+1);
    public void inscribirDatos(String nombre, int telefono);
    public void comunicarResultado();
    
}
