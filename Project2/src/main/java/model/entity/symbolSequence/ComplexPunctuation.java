package model.entity.symbolSequence;

import model.entity.symbol.PunctuationMark;
import model.entity.symbol.Symbol;

public class ComplexPunctuation extends SymbolSequence{

    public ComplexPunctuation(Symbol[] symbols) {
        super(symbols);
    }

    public boolean canBeLast(){
        Symbol[] symbols = super.getSymbols();
        if(symbols.length > 1){
            return isExclamationQuestionMarks(symbols) || isThreeFullStops(symbols);
        }else if(symbols.length == 1){
            return ((PunctuationMark) symbols[0]).canBeLast();
        }else {
            return false;
        }
    }

    private boolean isExclamationQuestionMarks(Symbol[] symbols){
        for (Symbol s : symbols) {
            PunctuationMark pm = (PunctuationMark) s;
            if(!(pm.isExclamationMark() || pm.isQuestionMark())){
                return false;
            }
        }
        return true;
    }

    private boolean isThreeFullStops(Symbol[] symbols){
        int N = symbols.length;

        if(N == 3){
            for (Symbol s : symbols) {
                PunctuationMark pm = (PunctuationMark) s;
                if(!pm.isFullStop()){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
