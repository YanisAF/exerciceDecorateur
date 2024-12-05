package org.example;

public class AddPrefixe extends TextDecorateur{
    private String prefix;

    public AddPrefixe(Text text, String prefix) {
        super(text);
        this.prefix = prefix;
    }

    public String transform(String input){
        return prefix + super.transform(input);
    }
}
