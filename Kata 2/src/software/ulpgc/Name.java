package software.ulpgc;

import java.util.List;

public class Name {
    List<profession> professions;

    public Name(List<profession> professions) {
        this.professions = professions;
    }

    public List<profession> getProfessions() {
        return professions;
    }

    public enum profession {
        special_effects,
        casting_director,
        production_department,
        miscellaneous,
        accountant,
        choreographer,
        animation_department,
        assistant_director,
        cinematographer,
        archive_sound,
        music_department,
        podcaster,
        executive,
        set_decorator,
        costume_designer,
        art_director,
        legal,
        camera_department,
        music_artist,
        electrical_department,
        actress,
        soundtrack,
        editor,
        art_department,
        script_department,
        manager,
        director,
        composer,
        sound_department,
        transportation_department,
        assistant,
        talent_agent,
        casting_department,
        editorial_department,
        stunts,
        actor,
        make_up_department,
        archive_footage,
        production_designer,
        location_management,
        producer,
        writer,
        visual_effects,
        production_manager,
        costume_department,
        publicist,
        none
    }
}
