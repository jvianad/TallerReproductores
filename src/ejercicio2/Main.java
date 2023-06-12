package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez",15000);
        Libro libro2 = new Libro("Cronica de una muerte anunciada","Gabriel Garcia Marquez",35000);
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        Libro[] libros = new Libro[2];
        libros[0] = libro1;
        libros[1] = libro2;

        for (int i = 0; i < libros.length; i++){
            System.out.println("Libro "+(i+1)+": ");
            System.out.println("Precio: "+libros[i].obtenerPrecio());
        }
    }
}
