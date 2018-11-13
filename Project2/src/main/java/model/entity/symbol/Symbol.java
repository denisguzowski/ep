package model.entity.symbol;

public abstract class Symbol {
    private Character character;

    public Symbol(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return character.toString();
    }
}
