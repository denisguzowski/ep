package model.entity.partOfTheText;

import model.entity.symbolSequence.SymbolSequence;
import model.entity.symbolSequence.Word;

public class Sentence extends TextPart{

    public Sentence(SymbolSequence[] symbolSequences) {
        super(symbolSequences);
    }

    public void swapFirstAndLastWords(){
        SymbolSequence[] ss = super.getSymbolSequences();
        Word first = null, last = null;

        if(super.getLength() > 1){
            for (SymbolSequence s : ss) {
                if (s instanceof Word) {
                    first = (Word) s;
                    break;
                }
            }

            for (int i = super.getLength() - 1; i >= 0; i--) {
                if(ss[i] instanceof Word){
                    last = (Word) ss[i];
                    break;
                }
            }

            if((first != last) && (first != null) && (last != null)){
                swap(first, last);

                if(!first.canStartSentence()){
                    first.changeFirstLetterCase();
                }

                last.changeFirstLetterCase();
            }
        }
    }

    private void swap(Word word1, Word word2){
        Word temp = new Word(word1.getSymbols());
        word1.setSymbols(word2.getSymbols());
        word2.setSymbols(temp.getSymbols());
    }
}
