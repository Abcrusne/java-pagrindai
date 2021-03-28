package solid.dip.solution;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Application {

    public static void main(String[] args) {
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();

        CopyMachine copyMachine = new CopyMachine();
        copyMachine.copy(reader, writer);
    }

    private static final class ConsoleReader implements Reader {

        private final java.io.Reader reader;

        public ConsoleReader() {
            this.reader = new InputStreamReader(System.in);
        }

        @Override
        public int read() {
            try {
                return reader.read();
            } catch (IOException e) {
                throw new RuntimeException("Failed to read from console", e);
            }
        }

    }

    private static final class ConsoleWriter implements Writer {

        private final PrintStream writer;

        public ConsoleWriter() {
            this.writer = System.out;
        }

        @Override
        public void write(int aChar) {
            writer.write(aChar);
        }
    }

}
