package i_introduction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LineCounter {
    public void count(String filePath) {
        final int[] number = {0};
        try {
            Files.lines(Paths.get(filePath)).forEach(line -> {
                number[0]++;
                System.out.println(number[0] + ":" + line);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
