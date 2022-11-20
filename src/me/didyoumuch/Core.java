package me.didyoumuch;

import me.didyoumuch.jsonlexer.JSONLexer;

public class Core {
    public static void main(String[] args) {
        String expression = "{\n" +
                "\"name\": \"Ivan\",\n" +
                "\"age\": 37,\n" +
                "\"children\": [\n" +
                "\"Masha\",\n" +
                "\"Igor\"\n" +
                "],\n" +
                "\"married\": true\n" +
                "}";

        System.out.println("Tokenlist:");

        JSONLexer instance = new JSONLexer(expression);
        instance.get();
    }
}
