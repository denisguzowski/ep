package model.entity.symbol;

public class PunctuationMark extends Symbol{

    public PunctuationMark(Character character) {
        super(character);
    }

    @Override
    public void setCharacter(Character character) {
        super.setCharacter(character);
    }

    public boolean canPresentInTheWord(){
        Character character = super.getCharacter();
        return (character == '\'') ||
                (character == '’') ||
                (character == '-') ||
                (character == '_');
    }

    public boolean canBeFirst(){
        Character character = super.getCharacter();
        return (character == '\'') ||
                (character == '"') ||
                (character == '—');
    }

    public boolean canBeLast(){
        return isFullStop() ||
                isHorizontalEllipsis() ||
                isExclamationMark() ||
                isQuestionMark();
    }

    public boolean isFullStop(){
        return super.getCharacter() == '.';
    }

    public boolean isHorizontalEllipsis(){
        return super.getCharacter() == '…';
    }

    public boolean isExclamationMark(){
        return super.getCharacter() == '!';
    }

    public boolean isQuestionMark(){
        return super.getCharacter() == '?';
    }
}
