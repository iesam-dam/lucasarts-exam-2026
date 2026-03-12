package feature.characters.presentation;

import feature.characters.data.CharacterDataRepository;
import feature.characters.data.CharacterMemLocalDataSource;
import feature.characters.domain.CharacterModel;
import feature.characters.domain.SaveCharacterUseCase;

public class CharacterView {


    public static void saveCharacter() {
        CharacterModel characterModel = new CharacterModel("1", "name", "power", "color", "type");

        SaveCharacterUseCase saveCharacterUseCase = new SaveCharacterUseCase(new CharacterDataRepository(new CharacterMemLocalDataSource()));
        saveCharacterUseCase.execute(characterModel);

    }

}
