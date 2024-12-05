package org.example;

public abstract class TextDecorateur implements Text{
    protected Text text;

    public TextDecorateur(Text text) {
        this.text = text;
    }

    @Override
    public String transform(String input){
        return text.transform(input);
    }

}
