package feature.characters.domain;

public class DeleteCharacterUseCase {

    private CharacterRepository characterRepository;

    public DeleteCharacterUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }


    public void execute(String characterId){
        characterRepository.delete(characterId);
    }
}
