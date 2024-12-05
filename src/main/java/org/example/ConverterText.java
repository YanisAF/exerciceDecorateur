package org.example;

public class ConverterText extends TextDecorateur{
    public ConverterText(Text text) {
        super(text);
    }

    @Override
    public String transform(String input){
        return super.transform(input).toUpperCase();
    }


}
