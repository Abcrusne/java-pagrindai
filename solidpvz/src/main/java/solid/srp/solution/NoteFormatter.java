package solid.srp.solution;

public class NoteFormatter {

    public String formatHtml(Note note) {
        return "html: <html></body>" + note.toString() + "</body></html>";
    }

    public String formatJson(Note note) {
        return "json: {note: content=\"" + note.toString() + "\"}";
    }

}
