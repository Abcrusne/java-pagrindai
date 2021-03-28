package solid.dip.solution;

public class CopyMachine {

    public void copy(Reader reader, Writer writer) {
        int aChar;

        while ((aChar = reader.read()) != -1) {
            writer.write(aChar);
        }
    }

}
