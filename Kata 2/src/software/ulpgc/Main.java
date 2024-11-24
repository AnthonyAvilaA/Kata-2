package software.ulpgc;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/antho/Downloads/name.basics.tsv");
        List<Name> names = new TsvNameReader(file).read();
        HashMap<Name.profession, Integer> histogram = new HashMap<>();

        for (Name name : names) {
            for (Name.profession profession : name.getProfessions()) {
                histogram.put(profession, histogram.getOrDefault(profession, 0) + 1);
            }
        }

        for (Name.profession profession: histogram.keySet()) {
            System.out.println(profession + ": " + histogram.get(profession));
        }
    }
}
