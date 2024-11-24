package software.ulpgc;

import java.util.ArrayList;
import java.util.List;

public class TsvNameDeserializer implements NameDeserializer {
    @Override
    public Name deserialize(String line) {
        String[] values = line.split("\t");
        return new Name(
                getProfessions(values[4])
        );
    }

    private List<Name.profession> getProfessions(String value) {
        List<Name.profession> professions = new ArrayList<>();
        String[] fields = value.split(",");
        for (String profession: fields) {
            try {
                professions.add(Name.profession.valueOf(profession));
            } catch (IllegalArgumentException e) {
                professions.add(Name.profession.valueOf("none"));
            }
        }
        return professions;
    }
}
