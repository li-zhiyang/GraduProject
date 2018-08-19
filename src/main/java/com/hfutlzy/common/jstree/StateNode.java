package com.hfutlzy.common.jstree;
/**
 * @author : lzyli
 * CreateDate : 2018/5/6 22:03
 * Description :
 */

public class StateNode {
    private boolean opened;
    private boolean disabled;
    private boolean selected;

    public StateNode(boolean opened, boolean disabled, boolean selected) {
        this.opened = opened;
        this.disabled = disabled;
        this.selected = selected;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
