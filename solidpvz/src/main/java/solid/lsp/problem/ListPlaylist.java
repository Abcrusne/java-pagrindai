package solid.lsp.problem;

import java.util.ArrayList;
import java.util.List;

public class ListPlaylist extends Playlist {

    private final List<String> songs = new ArrayList<>();

    public ListPlaylist(String title) {
        super(title);
    }

    @Override
    int size() {
        return songs.size();
    }

    @Override
    void addSong(String song) {
        songs.add(song);
    }

    @Override
    String getSong(int index) {
        return songs.get(index);
    }
}
