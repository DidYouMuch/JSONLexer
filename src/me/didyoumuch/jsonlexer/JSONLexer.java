package me.didyoumuch.jsonlexer;

import me.didyoumuch.jsonlexer.tokens.AbstractNode;
import me.didyoumuch.jsonlexer.tokens.imp.*;

import java.util.ArrayList;

public class JSONLexer {
    private String json;

    public JSONLexer(String json) {
        this.json = json;
    }

    private boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    private boolean isLiteral(String s) {
        try {
            Boolean.parseBoolean(s);
            return true;
        } catch (Exception exception) {
        }
        return false;
    }

    private ArrayList<AbstractNode> toNodes(String s) {
        s = s.replace(" ", "");
        ArrayList<AbstractNode> ret = new ArrayList<>();

        if (s.equals("{")) {
            ret.add(new BeginNode());
        }
        if (s.equals("}")) {
            ret.add(new EndNode());
        }
        if (s.contains("\"")) {
            if (s.split(":").length > 1) {
                String key = s.split(":")[0];
                String value = s.split(":")[1];
                boolean flag = false;
                ret.add(new StringNode(key.replace("\"", "")));
                ret.add(new ColonNode());
                if (isNumber(value.replace(",", ""))) {
                    flag = true;
                }
                if (value.contains(",")) {
                    if (flag) {
                        ret.add(new NumberNode(value.replace("\"", "").replace(",", "")));
                    } else {
                        ret.add(new StringNode(value.replace("\"", "").replace(",", "")));
                    }
                    ret.add(new CommaNode());
                } else {
                    if (flag) {
                        ret.add(new NumberNode(value.replace("\"", "").replace(",", "")));
                    } else {
                        if (value.contains("[")) {
                            ret.add(new BeginArrayNode());
                        } else {
                            if (isLiteral(value.replace("\"", ""))) {
                                ret.add(new LiteralNode(value));
                            } else {
                                ret.add(new StringNode(value.replace("\"", "")));
                            }
                        }
                    }
                }
            } else {
                ret.add(new StringNode(s.replace("\"", "").replace(",", "")));
            }
        } else {
            if (s.contains("]")) {
                ret.add(new EndArrayNode());
                if (s.contains(",")) {
                    ret.add(new CommaNode());
                }
            }
        }

        return ret;
    }

    public void get() {
        for (String line : this.json.split("\n")) {
            for (AbstractNode node : toNodes(line)) {
                System.out.println(node.toString());
            }
        }
    }
}
