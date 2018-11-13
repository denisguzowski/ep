package controller;

import model.analyzers.CharacterArrayAnalyzer;
import model.analyzers.SymbolArrayAnalyzer;
import model.analyzers.SymbolSequenceArrayAnalyzer;
import model.entity.Text;
import model.entity.partOfTheText.Sentence;
import model.entity.partOfTheText.TextPart;
import model.entity.symbol.Symbol;
import model.entity.symbolSequence.SymbolSequence;
import model.entity.symbolSequence.Whitespaces;
import utilities.WWFile;

import java.io.IOException;


public class Controller {
    public void run(){

        /*
        Only for testing of work
        Needs to be refactor
        */

        Character[] characters = null;
        try {
            characters = WWFile.readCharacterArrayFromFile("D:\\IdeaProjects\\EpamTraining\\EpamTraining\\Project2\\src\\main\\resources\\test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        CharacterArrayAnalyzer characterArrayAnalyzer = new CharacterArrayAnalyzer();
        Symbol[] symbols = characterArrayAnalyzer.analyze(characters);

        SymbolArrayAnalyzer symbolArrayAnalyzer = new SymbolArrayAnalyzer();
        SymbolSequence[] symbolSequences = symbolArrayAnalyzer.analyze(symbols);
        for (SymbolSequence s : symbolSequences) {
            if(s instanceof Whitespaces){
                ((Whitespaces) s).replaceTabWithSpace();
                ((Whitespaces) s).replaceSpacesWithOneSpace();
            }
        }

        SymbolSequenceArrayAnalyzer symbolSequenceArrayAnalyzer = new SymbolSequenceArrayAnalyzer();
        TextPart[] textParts = symbolSequenceArrayAnalyzer.analyze(symbolSequences);
        for (TextPart tp : textParts) {
            if(tp instanceof Sentence){
                ((Sentence)tp).swapFirstAndLastWords();
            }
        }

        Text text = new Text(textParts);

        try {
            WWFile.writeTextToFile("D:\\IdeaProjects\\EpamTraining\\EpamTraining\\Project2\\src\\main\\resources\\testResult.txt", text.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

