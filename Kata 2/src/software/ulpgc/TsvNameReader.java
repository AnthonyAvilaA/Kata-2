package software.ulpgc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvNameReader implements NameReader {
    private final File file;

    public TsvNameReader(File file) {
        this.file = file;
    }

    @Override
    public List<Name> read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            return readWith(reader);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Name> readWith(BufferedReader reader) throws IOException {
        List<Name> result = new ArrayList<>();
        TsvNameDeserializer deserializer = new TsvNameDeserializer();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            result.add(deserializer.deserialize(line));
        }
        return result;
    }
}
