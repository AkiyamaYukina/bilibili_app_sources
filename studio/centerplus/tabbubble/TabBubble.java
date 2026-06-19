package com.bilibili.studio.centerplus.tabbubble;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/tabbubble/TabBubble.class */
@Keep
public final class TabBubble {

    @JSONField(name = "id")
    @Nullable
    private Long id;

    @JSONField(name = "note")
    @Nullable
    private String note;

    @JSONField(name = "play_id")
    @Nullable
    private Long playId;

    @JSONField(name = "tab")
    @Nullable
    private Integer tab;

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    @Nullable
    public final Long getPlayId() {
        return this.playId;
    }

    @Nullable
    public final Integer getTab() {
        return this.tab;
    }

    public final void setId(@Nullable Long l7) {
        this.id = l7;
    }

    public final void setNote(@Nullable String str) {
        this.note = str;
    }

    public final void setPlayId(@Nullable Long l7) {
        this.playId = l7;
    }

    public final void setTab(@Nullable Integer num) {
        this.tab = num;
    }
}
