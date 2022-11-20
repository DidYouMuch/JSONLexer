package me.didyoumuch.jsonlexer.tokens.imp;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;

public class BeginNode extends AbstractNode {
    public BeginNode() {
        super("BEGIN_OBJECT", "{");
    }
}
