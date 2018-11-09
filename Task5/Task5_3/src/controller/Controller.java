package controller;

import model.Translator;

public class Controller {
    Translator model = new Translator();

    public void run(){
        model.addWord("apple", "яблуко");
        model.addWord("house", "будинок");
        model.addWord("school", "школа");
        model.addWord("car", "машина");
        model.addWord("tree", "дерево");

        System.out.println(model.addWord("apple", "яasd"));
        System.out.println(model.addWord("ale", "яблуко"));
        System.out.println(model.addWord("sun", "сонце"));

        System.out.println(model.showVocabulary());

        System.out.println(model.translate("sun, flower-house - car apple: tree school. "));
    }
}
