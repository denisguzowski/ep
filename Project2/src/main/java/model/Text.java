package model;

import model.entity.partOfTheText.TextPart;

public class Text {
    private TextPart[] text;

    public Text(TextPart[] text) {
        this.text = text;
    }

    public TextPart[] getText() {
        return text;
    }

    public void setText(TextPart[] text) {
        this.text = text;
    }

    private String prepareString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (TextPart tp : text) {
            stringBuilder.append(tp);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return prepareString();
    }
}
