package me.didyoumuch.jsonlexer.tokens;

public class AbstractNode {
    private String name;
    private String value;

    public AbstractNode(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + this.getName() + ", `" + this.getValue() + "`)";
    }
}
