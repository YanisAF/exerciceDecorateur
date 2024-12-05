package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Text text = new TextPlain();

        text = new ConverterText(text);
        System.out.println(text.transform("Hello World !!!! "));

        text = new AddPrefixe(text, "mal");
        System.out.println(text.transform("gré"));

    }
}