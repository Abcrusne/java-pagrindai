package solid.lsp.problem;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPlaylist extends Playlist {

    private final Set<String> songs = new LinkedHashSet<>();

    public SetPlaylist(String title) {
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
        Iterator<String> iterator = songs.iterator();

        for (int i = 0; i < index; i++) {
            iterator.next();
        }

        return iterator.next();
    }
}
