package org.example;

public class ConvertTextMaj extends TextDecorateur{
    public ConvertTextMaj(Text text) {
        super(text);
    }

    @Override
    public String transform(String input){
        return super.transform(input).toUpperCase();
    }
}
