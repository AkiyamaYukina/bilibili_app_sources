package com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/bean/IgvResources.class */
@Keep
public final class IgvResources {

    @JSONField(name = "resource_list")
    @Nullable
    private List<IgvResource> data;

    @JSONField(name = "fans")
    private long fans;

    @Nullable
    public final List<IgvResource> getData() {
        return this.data;
    }

    public final long getFans() {
        return this.fans;
    }

    public final void setData(@Nullable List<IgvResource> list) {
        this.data = list;
    }

    public final void setFans(long j7) {
        this.fans = j7;
    }
}
