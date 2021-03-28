package solid.srp.problem;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Note.saveNote(new Note(1L, new Date(), "Title 1", "Content 1"));
        Note.saveNote(new Note(2L, new Date(), "Title 2", "Content 2"));

        Note firstNote = Note.queryNote(1L);
        System.out.println(firstNote.formatHtml());
        System.out.println(firstNote.formatJson());

        Note secondNote = Note.queryNote(2L);
        System.out.println(secondNote.formatHtml());
        System.out.println(secondNote.formatJson());
    }

}
