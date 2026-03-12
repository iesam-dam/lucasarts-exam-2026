package feature.characters.domain;

import java.util.ArrayList;

public interface CharacterRepository {

    void save(CharacterModel characterModel);
    ArrayList<CharacterModel> getCharacters();
    void delete(String characterId);
}
