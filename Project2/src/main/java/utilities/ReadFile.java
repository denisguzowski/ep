package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static Character[] readCharacterArrayFromFile(String fileName) throws IOException {
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)){

            List<Character> result = new ArrayList<>();

            int c;
            while ((c = bufferedReader.read()) != -1) {
                result.add((char) c);
            }
            return result.toArray(new Character[0]);
        }
    }
}
