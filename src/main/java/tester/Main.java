package tester;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {

        URL url = Main.class.getResource("/point.txt"); // Ищется в resources target
        File file =  new File(url.toURI());

        //File file = new File("src/main/resources/point.txt");
        // Достраивается относительно Working directory (Run->Edit run/debug configurations); user.dir

        //System.out.println(Files.readAllLines(file.toPath()));
        System.out.println(System.getProperty("user.dir"));

    }
}
