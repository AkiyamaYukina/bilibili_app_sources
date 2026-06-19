package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiAnnouncementInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiAnnouncementInfo {
    public static final int $stable = 8;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
