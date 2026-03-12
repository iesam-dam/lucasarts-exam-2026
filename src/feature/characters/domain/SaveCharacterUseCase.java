package feature.characters.domain;

public class SaveCharacterUseCase {

    private CharacterRepository characterRepository;

    public SaveCharacterUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void execute(CharacterModel characterModel){
        characterRepository.save(characterModel);
    }
}
