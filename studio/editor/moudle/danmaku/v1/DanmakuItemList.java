package com.bilibili.studio.editor.moudle.danmaku.v1;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/v1/DanmakuItemList.class */
@Keep
public class DanmakuItemList implements Serializable, Cloneable {

    @JSONField(name = "bind_list")
    public List<DanmakuItem> bindList;

    @JSONField(name = "can_create")
    public Boolean canCreate;

    @JSONField(name = "show")
    public Boolean show;

    @JSONField(name = "type")
    public int type;

    public boolean canCreate() {
        return this.canCreate.booleanValue();
    }

    public List<DanmakuItem> getBindList() {
        return this.bindList;
    }

    public int getType() {
        return this.type;
    }

    public void setBindList(List<DanmakuItem> list) {
        this.bindList = list;
    }

    public void setCanCreate(Boolean bool) {
        this.canCreate = bool;
    }

    public void setType(int i7) {
        this.type = i7;
    }
}
