package NIo;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;

public class INtro {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("d.txt");

        Path p2 = Paths.get("f.txt");
        Path p3 = Paths.get("e.txt");

        Files.deleteIfExists(p2);
        Files.deleteIfExists(p3);

        Files.copy(p,p2);


    }
}
