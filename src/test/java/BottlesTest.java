import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottlesTest {
    @Test
    void characterizationTest() throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(stream);
        Bottles.extracted(printStream);

        String actual = stream.toString();
        String expected = new String(Files.readAllBytes(Paths.get("src/main/resources/bottles.txt")));

        assertEquals(expected, actual);
    }
}
