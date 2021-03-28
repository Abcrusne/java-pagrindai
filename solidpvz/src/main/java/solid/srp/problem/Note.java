package solid.srp.problem;

import java.io.Serializable;
import java.util.*;

/**
 * Demonstruojama klasė, kuri pažeidžia SRP principą.
 *
 * Klasė yra labai supaprastinta tam, kad iliustruoti SRP principą atsiejant nuo nereikalingų detalių.
 *
 * Šioje klasėje yra tokios grupės atsakomybių:
 *
 * - Metodai, grąžintantys užrašo duomenis (id, creationDate, title, text)
 * - Metodai, išsaugantys ir grąžinantys užrašą (queryNote, saveNote)
 * - Metodai, atsakingi už užrašo formatavimą
 */
public class Note implements Serializable {

    private final long id;

    private final Date creationDate;

    private final String title;

    private final String text;

    private static final Map<Long, Note> notesMap;

    static {
        notesMap = new LinkedHashMap<>();
    }

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

    public static Note queryNote(long id) {
        System.out.println("Querying note by id: " + id);
        return notesMap.get(id);
    }

    public static List<Note> queryAllNotes() {
        System.out.println("Querying all notes");
        return new ArrayList<>(notesMap.values());
    }

    public static void saveNote(Note note) {
        System.out.println("Saving note");
        notesMap.put(note.getId(), note);
    }

    public String formatHtml() {
        return "html: <html></body>" + toString() + "</body></html>";
    }

    public String formatJson() {
        return "json: {note: content=\"" + toString() + "\"}";
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
