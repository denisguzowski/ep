package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Translator {
    private Map<String, String> vocabulary = new HashMap<>();

    public boolean addWord(String eng, String ukr){
        if(!isPresent(eng, ukr)){
            vocabulary.put(eng, ukr);
            return true;
        }else{
            return false;
        }
    }

    private boolean isPresent(String eng, String ukr){
        return vocabulary.containsKey(eng) | vocabulary.containsValue(ukr);
    }

    public String translate(String sentence){
        String[] words = sentence.split("[.,:;!?'\" ]+");
        StringBuilder result = new StringBuilder();

        if(!vocabulary.isEmpty()){
            for (String s : words) {
                String val = vocabulary.get(s);
                if(val != null){
                    result.append(val).append(" ");
                }else {
                    result.append("\"").append(s).append("\" ");
                }
            }
        }

        return result.toString();
    }

    public String showVocabulary(){
        Set<Map.Entry<String, String>> set = vocabulary.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        StringBuilder representation = new StringBuilder();

        while (iterator.hasNext()){
            Map.Entry<String, String> me = iterator.next();
            representation.append(me.getKey()).append(" = ");
            representation.append(me.getValue()).append('\n');
        }

        return representation.toString();
    }

}
