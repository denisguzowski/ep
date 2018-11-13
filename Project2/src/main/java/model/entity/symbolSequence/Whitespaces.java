package model.entity.symbolSequence;

import model.entity.symbol.Symbol;
import model.entity.symbol.Whitespace;
import java.util.ArrayList;
import java.util.List;

public class Whitespaces extends SymbolSequence{

    public Whitespaces(Symbol[] symbols) {
        super(symbols);
    }

    public void replaceTabWithSpace(){
        for (Symbol s : super.getSymbols()) {
            if(s instanceof Whitespace){
                if(((Whitespace) s).isHorizontalTabulation()){
                    s.setCharacter(' ');
                }
            }
        }
    }

    public void replaceSpacesWithOneSpace(){
        List<Symbol> list =  new ArrayList<>();
        boolean whitespaceWasFound = false;

        for (Symbol s : super.getSymbols()) {
            if(s instanceof Whitespace){
                if(((Whitespace) s).isSpace()){
                    if(!whitespaceWasFound){
                        list.add(s);
                        whitespaceWasFound = true;
                    }
                }else {
                    whitespaceWasFound = false;
                    list.add(s);
                }
            }
        }
        super.setSymbols(list.toArray(new Symbol[0]));
    }
}
