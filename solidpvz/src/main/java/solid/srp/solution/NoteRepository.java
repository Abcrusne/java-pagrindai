package solid.srp.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteRepository {

    private static final Map<Long, Note> notesMap;

    static {
        notesMap = new HashMap<>();
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
}
