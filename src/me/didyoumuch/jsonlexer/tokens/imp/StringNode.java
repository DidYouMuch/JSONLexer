package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class StringNode extends AbstractNode {
    public StringNode(String value) {
        super("STRING", value);
    }
}
