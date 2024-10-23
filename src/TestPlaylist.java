public class TestPlaylist {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        System.out.println("Numero di canzoni presenti nella playlist: " + playlist.numeroCanzoni());
        playlist.aggiungiCanzone(new Canzone("Brano 1", "Artista 1", 200));
        playlist.aggiungiCanzone("Brano 2", "Artista 2", 180);
        playlist.aggiungiCanzone("Brano 3", "Artista 3", 210);
        System.out.println("Numero di canzoni presenti nella playlist dopo l'aggiunta: " + playlist.numeroCanzoni());
        playlist.cancellaCanzone(new Canzone("Brano 2", "Artista 2", 180));
        System.out.println("Numero di canzoni presenti nella playlist dopo la cancellazione: " + playlist.numeroCanzoni());
        Canzone[] canzoniArtista1 = playlist.ricercaCanzoni("Artista 1");
        System.out.println("Canzoni di Artista 1:");
        for (int i = 0; i < canzoniArtista1.length; i++) {
            Canzone canzone = canzoniArtista1[i];
            System.out.println(canzone.getNomeCanzone() + " - " + canzone.getNomeCantante());
        }
        String artistaCanzone = playlist.ricercaCantante("Brano 3");
        System.out.println("Il cantante della canzone 'Brano 3' è: " + artistaCanzone);
    }
}