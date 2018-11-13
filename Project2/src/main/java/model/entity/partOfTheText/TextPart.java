package model.entity.partOfTheText;

import model.entity.symbolSequence.SymbolSequence;

public abstract class TextPart {
    private SymbolSequence[] symbolSequences;

    public TextPart(SymbolSequence[] symbolSequences) {
        this.symbolSequences = symbolSequences;
    }

    public SymbolSequence[] getSymbolSequences() {
        return symbolSequences;
    }

    public void setSymbolSequences(SymbolSequence[] symbolSequences) {
        this.symbolSequences = symbolSequences;
    }

    public int getLength(){
        return symbolSequences.length;
    }

    private String prepareString(){
        if(getLength() != 0){
            StringBuilder stringBuilder = new StringBuilder();
            for (SymbolSequence s : symbolSequences) {
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        }else{
            return "";
        }
    }

    @Override
    public String toString() {
        return prepareString();
    }
}
