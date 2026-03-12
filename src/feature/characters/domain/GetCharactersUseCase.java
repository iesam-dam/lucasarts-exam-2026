package feature.characters.domain;

import java.util.ArrayList;

public class GetCharactersUseCase {

    private CharacterRepository characterRepository;

    public GetCharactersUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }


    public ArrayList<CharacterModel> execute(){
        return characterRepository.getCharacters();
    }

}
