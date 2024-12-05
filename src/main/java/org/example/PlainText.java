package org.example;

public class PlainText implements Text{

    @Override
    public String transform(String input){
        return input;
    }
}
