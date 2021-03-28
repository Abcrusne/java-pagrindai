package solid.lsp.problem;

public class Application {

    public static void main(String[] args) {
        // Playlist klasė leidžia pridėti kiek nori dainų ir jas groti
        Playlist playlist = new ListPlaylist("Demo playlist");
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 1"); // ta pati daina
        playlist.addSong("Song 3");
        // Grojamas dainų sąrašas.
        playlist.play();

        // Ši realizacija priverčia programą veikti nekorektiškai (ji neleidžia pasikartojančių dainų)
        playlist = new SetPlaylist("Demo playlist");
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 1"); // ta pati daina
        playlist.addSong("Song 3");
        // Grojamas ne pilnas dainų sąrašas - klaida!
        playlist.play();
    }

}
