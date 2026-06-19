package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/SiftTag.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SiftTag {
    public static final int $stable = 8;

    @JSONField(name = "tag_id")
    private long tagId;

    @JSONField(name = "tag_name")
    @Nullable
    private String tagName;

    public final long getTagId() {
        return this.tagId;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    public final void setTagId(long j7) {
        this.tagId = j7;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }
}
