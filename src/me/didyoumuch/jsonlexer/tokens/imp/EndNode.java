package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class EndNode extends AbstractNode {
    public EndNode() {
        super("END_OBJECT", "}");
    }
}
