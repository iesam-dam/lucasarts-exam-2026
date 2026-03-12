package feature.characters.presentation;

import feature.characters.data.CharacterDataRepository;
import feature.characters.data.CharacterMemLocalDataSource;
import feature.characters.domain.CharacterModel;
import feature.characters.domain.GetCharactersUseCase;
import feature.characters.domain.SaveCharacterUseCase;

import java.util.ArrayList;

public class CharacterView {

    public static void function1(){
        printCharacters();
        saveCharacter();
        printCharacters();
    }

    public static void function2(){
        printCharacters();
    }

    public static void saveCharacter() {
        CharacterModel characterModel = new CharacterModel("1", "name", "power", "color", "type");
        SaveCharacterUseCase saveCharacterUseCase = new SaveCharacterUseCase(new CharacterDataRepository(CharacterMemLocalDataSource.newInstance()));
        saveCharacterUseCase.execute(characterModel);
    }

    public static void printCharacters(){
        GetCharactersUseCase getCharactersUseCase = new GetCharactersUseCase(new CharacterDataRepository(CharacterMemLocalDataSource.newInstance()));
        ArrayList<CharacterModel> characteres = getCharactersUseCase.execute();
        System.out.println(characteres);
    }

}
