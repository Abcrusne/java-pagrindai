package solid.dip.problem;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

public class CopyMachine {

    public void copy() {
        Reader reader = new InputStreamReader(System.in);
        PrintStream writer = System.out;

        int aChar;

        try {
            while ((aChar = reader.read()) != -1) {
                writer.write(aChar);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to read from console", e);
        }
    }

}
