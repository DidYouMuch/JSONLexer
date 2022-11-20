package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class BeginArrayNode extends AbstractNode {
    public BeginArrayNode() {
        super("BEGIN_ARRAY", "[");
    }
}
