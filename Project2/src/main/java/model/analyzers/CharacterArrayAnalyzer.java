package model.analyzers;

import model.entity.symbol.*;

public class CharacterArrayAnalyzer {

    public Symbol[] analyze(Character[] characters){
        Symbol[] symbols = new Symbol[characters.length];

        for (int i = 0; i < characters.length; i++) {
            Character current = characters[i];

            if(Character.isLetter(current)){
                symbols[i] = new Letter(current);
            }else if(Character.isWhitespace(current)){
                symbols[i] = new Whitespace(current);
            }else if(isValid(current)){
                symbols[i] = new PunctuationMark(current);
            }else {
                symbols[i] = new Other(current);
            }
        }
        return symbols;
    }

    private boolean isValid(Character character){
        int type = Character.getType(character);
        return (type == 20) || //DASH_PUNCTUATION
                (type == 21) || //START_PUNCTUATION
                (type == 22) || //END_PUNCTUATION
                (type == 23) || //CONNECTOR_PUNCTUATION
                (type == 24) || //OTHER_PUNCTUATION
                (type == 29) || //INITIAL_QUOTE_PUNCTUATION
                (type == 30);   //FINAL_QUOTE_PUNCTUATION
    }
}
