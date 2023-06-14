package ejercicio1;

public class RepSpotify extends ReproductorMusica implements iPremium,iFree{

    public RepSpotify() {
        nombre = "Spotify";
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

    @Override
    public void guardarCanciones() {
        System.out.println("Guardando la cancion en "+nombre);
    }

    @Override
    public void reproducirSoloVoz() {
        System.out.println("Reproduciendo solo voz de cancion en "+nombre);
    }

    @Override
    public void reproducirSoloRitmo() {
        System.out.println("Se esta reproduciendo solo la instrumental en "+nombre);
    }
}
