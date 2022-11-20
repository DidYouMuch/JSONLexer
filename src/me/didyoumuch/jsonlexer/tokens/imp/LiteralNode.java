package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class LiteralNode extends AbstractNode {
    public LiteralNode(String value) {
        super("LITERAL", value);
    }

    @Override
    public String toString() {
        return "(" + this.getName() + ", " + this.getValue() + ")";
    }
}
