import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuttleMissionsTest {
    @Test
    public void testShuttleMissions() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ShuttleMissions.main(null);

        String expectedOutput = "Унікальні місії шатлів:\r\nDiscovery\r\nAtlantis\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
