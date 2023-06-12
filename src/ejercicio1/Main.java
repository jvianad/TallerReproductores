package ejercicio1;

public class Main {
    public static void main(String[] args) {
        RepSpotify spoty = new RepSpotify();
        spoty.reproducirMusica();
        spoty.pausarMusica();
        spoty.detenerMusica();
        spoty.reproducirSinInternet();
        spoty.reproducirSoloRitmo();
        spoty.reproducirSoloVoz();

        System.out.println();

        RepJmusic deezer = new RepJmusic();
        deezer.reproducirMusica();
        deezer.pausarMusica();
        deezer.detenerMusica();
        deezer.reproducirSinInternet();


    }
}
