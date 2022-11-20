package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class NumberNode extends AbstractNode {
    public NumberNode(String value) {
        super("NUMBER", value);
    }
}
