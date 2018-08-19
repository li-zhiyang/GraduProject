package com.hfutlzy.common.jstree;

/**
 * @author : lzyli
 * CreateDate : 2018/5/6 19:05
 * Description :
 */
public class TreeNode {

    private String id;
    private String text;
    private boolean children;
    private String type;

    public TreeNode(String id, String text) {
        this.id = id;
        this.text = text;
        this.setChildren(true);
        this.setType("root");

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

    private void setChildren(boolean children) {
        this.children = children;
    }

    public boolean isChildren() {
        return children;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
