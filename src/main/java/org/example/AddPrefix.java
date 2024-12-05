package org.example;

public class AddPrefix extends TextDecorateur{
    private String prefix;

    public AddPrefix(Text text, String prefix){
        super (text);
        this.prefix = prefix;
    }

    @Override
    public String transform(String input){
        return prefix + super.transform(input);
    }
}
