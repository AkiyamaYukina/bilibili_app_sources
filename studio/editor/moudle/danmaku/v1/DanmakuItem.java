package com.bilibili.studio.editor.moudle.danmaku.v1;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuItem.class */
@Keep
public class DanmakuItem implements Serializable, Cloneable {

    @JSONField(name = "desc")
    public String desc;

    @JSONField(name = "plan_start_time")
    public long planStartTime;
    private boolean selected = false;

    @JSONField(name = "sid")
    public long sid;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = "total")
    public String total;

    @JSONField(name = "type")
    public int type;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DanmakuItem m9898clone() {
        DanmakuItem danmakuItem;
        try {
            danmakuItem = (DanmakuItem) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            danmakuItem = null;
        }
        return danmakuItem;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof DanmakuItem) && this.sid == ((DanmakuItem) obj).sid;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z6) {
        this.selected = z6;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "title: " + this.title + ", type:" + this.type;
    }
}
