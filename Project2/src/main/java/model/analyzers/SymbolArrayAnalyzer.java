package model.analyzers;

import model.entity.symbol.*;
import model.entity.symbolSequence.*;

import java.util.ArrayList;
import java.util.List;

public class SymbolArrayAnalyzer {
    List<SymbolSequence> result = new ArrayList<>();

    public SymbolSequence[] analyze(Symbol[] symbols){

        for (int i = 0, N = symbols.length; i < N;) {
            if(symbols[i] instanceof Letter){
                i = formWord(symbols, i, N);
            }
            if(symbols[i] instanceof Other){
                i = formUnknownSequence(symbols, i, N);
            }
            if(symbols[i] instanceof PunctuationMark){
                i = formComplexPunctuation(symbols, i, N);
            }
            if(symbols[i] instanceof Whitespace){
                i = formWhitespaces(symbols, i, N);
            }
        }

        return result.toArray(new SymbolSequence[0]);
    }

    private int formWhitespaces(Symbol[] symbols, int startIndex, int endIndex){
        List<Symbol> whiteSpaces = new ArrayList<>();

        int i = startIndex;

        for (; i < endIndex; i++) {
            if(symbols[i] instanceof Whitespace){
                whiteSpaces.add(symbols[i]);
            }else {
                break;
            }
        }
        result.add(new Whitespaces(whiteSpaces.toArray(new Symbol[0])));

        return i;
    }

    public int formComplexPunctuation(Symbol[] symbols, int startIndex, int endIndex){
        List<Symbol> complexPunctuation = new ArrayList<>();

        int i = startIndex;

        for (; i < endIndex; i++) {
            if(symbols[i] instanceof PunctuationMark){
                complexPunctuation.add(symbols[i]);
                if(!(((PunctuationMark) symbols[i]).isExclamationMark() || ((PunctuationMark) symbols[i]).isQuestionMark())){
                    i++;
                    break;
                }
            }else {
                break;
            }
        }
        result.add(new ComplexPunctuation(complexPunctuation.toArray(new Symbol[0])));

        return i;
    }

    private int formWord(Symbol[] symbols, int startIndex, int endIndex){
        List<Symbol> word = new ArrayList<>();
        boolean prevIsPunctuation = true;

        int i = startIndex;

        for (; i < endIndex; i++) {
            if(symbols[i] instanceof Letter){
                word.add(symbols[i]);
                prevIsPunctuation = false;

            }else if(symbols[i] instanceof PunctuationMark){
                PunctuationMark pm = (PunctuationMark) symbols[i];
                if(pm.canPresentInTheWord() && !prevIsPunctuation){
                    word.add(symbols[i]);
                    prevIsPunctuation = true;
                }else {
                    break;
                }

            }else{
                break;
            }
        }
        result.add(new Word(word.toArray(new Symbol[0])));

        return i;
    }

    private int formUnknownSequence(Symbol[] symbols, int startIndex, int endIndex){
        List<Symbol> unknownSequence = new ArrayList<>();

        int i = startIndex;

        for (; i < endIndex; i++) {
            if(symbols[i] instanceof Other){
                unknownSequence.add(symbols[i]);
            }else {
                break;
            }
        }
        result.add(new UnknownSequence(unknownSequence.toArray(new Symbol[0])));

        return i;
    }
}
