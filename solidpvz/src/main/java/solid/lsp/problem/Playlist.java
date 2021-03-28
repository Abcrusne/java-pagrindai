package solid.lsp.problem;

public abstract class Playlist {

    private String title;

    public Playlist(String title) {
        this.title = title;
    }

    abstract int size();

    void play() {
        for (int i = 0; i < size(); i++) {
            System.out.println("Playing song: " + getSong(i));
        }
    }

    abstract void addSong(String song);

    abstract String getSong(int index);
}
