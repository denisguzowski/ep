package model.entity.symbol;

public class Whitespace extends Symbol{

    public Whitespace(Character character) {
        super(character);
    }

    @Override
    public void setCharacter(Character character) {
        super.setCharacter(character);
    }

    public boolean isHorizontalTabulation(){
        return super.getCharacter() == '\t';
    }

    public boolean isSpace(){
        return super.getCharacter() == ' ';
    }
}
