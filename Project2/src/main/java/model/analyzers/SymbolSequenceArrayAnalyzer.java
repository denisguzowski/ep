package model.analyzers;

import model.entity.partOfTheText.Sentence;
import model.entity.partOfTheText.TextPart;
import model.entity.partOfTheText.UnknownTextPart;
import model.entity.symbolSequence.*;
import java.util.ArrayList;
import java.util.List;

public class SymbolSequenceArrayAnalyzer {
    List<TextPart> result = new ArrayList<>();

    public TextPart[] analyze(SymbolSequence[] symbolSequences){

        for (int i = 0, N = symbolSequences.length; i < N;) {
            if(symbolSequences[i] instanceof Word){
                i = formSentence(symbolSequences, i, N);
            }
            i = formUnknownTextPart(symbolSequences, i, N);
        }

        return result.toArray(new TextPart[0]);
    }


    private int formSentence(SymbolSequence[] symbolSequences, int startIndex, int endIndex){
        List<SymbolSequence> sentence = new ArrayList<>();
        boolean correctFirstWord = false; //first word must starts with the uppercase letter


        for (int i = startIndex; i < endIndex; i++) {

            if(symbolSequences[i] instanceof Word){
                sentence.add(symbolSequences[i]);
                Word word = (Word) symbolSequences[i];
                if(word.canStartSentence()){
                    if(!correctFirstWord){
                        correctFirstWord = true;
                    }
                }else {
                    if(!correctFirstWord){
                        return i;
                    }
                }
            }

            if(symbolSequences[i] instanceof Whitespaces){
                sentence.add(symbolSequences[i]);
            }

            if(symbolSequences[i] instanceof ComplexPunctuation){
                ComplexPunctuation complexPunctuation = (ComplexPunctuation) symbolSequences[i];
                sentence.add(symbolSequences[i]);
                if(complexPunctuation.canBeLast()) {
                    result.add(new Sentence(sentence.toArray(new SymbolSequence[0])));
                    return ++i;
                }
            }

            if(symbolSequences[i] instanceof UnknownSequence){
                sentence.add(symbolSequences[i]);
            }
        }

        return startIndex;
    }

    private int formUnknownTextPart(SymbolSequence[] symbolSequences, int startIndex, int endIndex){
        List<SymbolSequence> unknown = new ArrayList<>();

        int i = startIndex;

        for (; i < endIndex; i++) {

            if(symbolSequences[i] instanceof Word){
                Word word = (Word) symbolSequences[i];
                if(word.canStartSentence()){
                   break;
                }else {
                   unknown.add(symbolSequences[i]);
                }
            }else {
                unknown.add(symbolSequences[i]);
            }
        }
        result.add(new UnknownTextPart(unknown.toArray(new SymbolSequence[0])));

        return i;
    }
}
