import java.io.*;
import java.util.*;

class FileHandler {
    public static List<String> readFile(String path) throws Exception {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        br.close();
        return lines;
    }
}