package feature.characters.domain;

public class CharacterModel {
    private String id;
    private String name;
    private String power;
    private String color;
    private String type;

    public CharacterModel(String id, String name, String power, String color, String type) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.color = color;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
