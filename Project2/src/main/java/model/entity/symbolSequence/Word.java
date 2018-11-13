package model.entity.symbolSequence;

import model.entity.symbol.Letter;
import model.entity.symbol.Symbol;

public class Word extends SymbolSequence{

    public Word(Symbol[] symbols) {
        super(symbols);
    }

    public void changeFirstLetterCase(){
        if(super.getLength() != 0){
            if(super.getSymbols()[0] instanceof Letter){
                Letter letter = (Letter) super.getSymbols()[0];
                letter.changeCase();
            }
        }
    }

    public boolean canStartSentence(){
        Symbol[] symbols = super.getSymbols();
        if(symbols.length != 0){
            if(symbols[0] instanceof Letter){
                return ((Letter)symbols[0]).isUpperCase();
            }
        }
        return false;
    }
}
