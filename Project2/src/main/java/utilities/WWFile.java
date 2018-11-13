package utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WWFile {

    public static Character[] readCharacterArrayFromFile(String fileName) throws IOException {
        Charset charset = Charset.defaultCharset();
        Path path = Paths.get(fileName);

        try (BufferedReader bufferedReader = Files.newBufferedReader(path, charset)){
            List<Character> result = new ArrayList<>();

            int c;
            while ((c = bufferedReader.read()) != -1) {
                result.add((char) c);
            }
            return result.toArray(new Character[0]);
        }
    }

    public static void writeTextToFile(String fileName, String text) throws IOException {
        Charset charset = Charset.defaultCharset();
        Path path = Paths.get(fileName);

        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path, charset)){
            bufferedWriter.write(text);
        }
    }
}
