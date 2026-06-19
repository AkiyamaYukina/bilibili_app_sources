package com.bilibili.relation.api;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/AllGroup.class */
@Keep
public class AllGroup {

    @Nullable
    @JSONField(name = "all")
    public List<AttentionGroup> allGroup;

    @Nullable
    @JSONField(name = "list")
    public List<AttentionGroup> customGroup;

    @Nullable
    @JSONField(name = "default")
    public List<AttentionGroup> defaultGroup;
    private boolean empty;

    @Nullable
    @JSONField(name = "special")
    public List<AttentionGroup> specialGroup;

    public int getCount() {
        List<AttentionGroup> list = this.defaultGroup;
        int size = list != null ? list.size() : 0;
        List<AttentionGroup> list2 = this.customGroup;
        int size2 = size;
        if (list2 != null) {
            size2 = size + list2.size();
        }
        List<AttentionGroup> list3 = this.specialGroup;
        int size3 = size2;
        if (list3 != null) {
            size3 = size2 + list3.size();
        }
        List<AttentionGroup> list4 = this.allGroup;
        int size4 = size3;
        if (list4 != null) {
            size4 = size3 + list4.size();
        }
        return size4;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }
}
