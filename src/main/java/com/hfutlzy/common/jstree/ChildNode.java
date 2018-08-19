package com.hfutlzy.common.jstree;
/**
 * @author : lzyli
 * CreateDate : 2018/5/6 19:05
 * Description :
 */
public class ChildNode {

    private String id;
    private String text;
    private String type;

    public ChildNode(String id, String text) {
        this.id = id;
        this.text = text;
        this.setType("file");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
