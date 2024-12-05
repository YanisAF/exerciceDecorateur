package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Text text = new PlainText();
        text = new ConvertTextMaj(text);

        System.out.println(text.transform("Hello world !!! "));

        Text text1 = new PlainText();
        text1 = new AddPrefix(text, "pru");

        System.out.println(text1.transform("dent"));

    }
}