package feature.characters.data;

import feature.characters.domain.CharacterModel;
import feature.characters.domain.CharacterRepository;

public class CharacterDataRepository implements CharacterRepository {

    private CharacterMemLocalDataSource characterMemLocalDataSource;

    public CharacterDataRepository(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    public void save(CharacterModel characterModel) {
        characterMemLocalDataSource.save(characterModel);
    }
}
