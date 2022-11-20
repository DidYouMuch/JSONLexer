package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class EndArrayNode extends AbstractNode {
    public EndArrayNode() {
        super("END_ARRAY", "]");
    }
}
