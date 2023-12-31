package ejercicio2;

public class Libro implements iMostrable,iVendible{
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Título: "+this.titulo+" - Autor: "+this.autor+" - Precio: "+this.precio);
    }

    @Override
    public double obtenerPrecio() {
        return this.precio;
    }

}
