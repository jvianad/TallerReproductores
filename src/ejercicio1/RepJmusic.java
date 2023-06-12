package ejercicio1;

public class RepJmusic extends ReproductorMusica implements iFree{

    public RepJmusic() {
        nombre = "Deezer";
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Reproduciendo musica en "+nombre);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Se ha pausado la cancion");
    }

    @Override
    public void detenerMusica() {
        System.out.println("Se ha detenido la reproduccion");
    }

    @Override
    public void reproducirSinInternet() {
        System.out.println("Reproduciendo las canciones sin internet");
    }
}
