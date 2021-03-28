package solid.srp.solution;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        NoteRepository.saveNote(new Note(1L, new Date(), "Title 1", "Content 1"));
        NoteRepository.saveNote(new Note(2L, new Date(), "Title 2", "Content 2"));

        NoteFormatter noteFormatter = new NoteFormatter();

        Note firstNote = NoteRepository.queryNote(1L);
        System.out.println(noteFormatter.formatHtml(firstNote));
        System.out.println(noteFormatter.formatJson(firstNote));

        Note secondNote = NoteRepository.queryNote(2L);
        System.out.println(noteFormatter.formatHtml(secondNote));
        System.out.println(noteFormatter.formatJson(secondNote));
    }

}
