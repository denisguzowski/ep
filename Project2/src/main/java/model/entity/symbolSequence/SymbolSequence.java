package model.entity.symbolSequence;

import model.entity.symbol.Symbol;

public abstract class SymbolSequence {
    private Symbol[] symbols;

    public SymbolSequence(Symbol[] symbols) {
        this.symbols = symbols;
    }

    public Symbol[] getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbol[] symbols) {
        this.symbols = symbols;
    }

    public int getLength(){
        return symbols.length;
    }

    private String prepareString(){
       if(getLength() != 0){
           StringBuilder stringBuilder = new StringBuilder();
           for (Symbol s : symbols) {
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
