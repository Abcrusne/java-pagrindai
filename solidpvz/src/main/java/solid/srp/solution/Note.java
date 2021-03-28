package solid.srp.solution;

import java.util.Date;

public class Note {

    private final long id;

    private final Date creationDate;

    private final String title;

    private final String text;

    public Note(long id, Date creationDate, String title, String text) {
        this.id = id;
        this.creationDate = creationDate;
        this.title = title;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

}
