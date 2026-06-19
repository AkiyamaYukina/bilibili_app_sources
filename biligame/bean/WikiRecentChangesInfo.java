package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiRecentChangesInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiRecentChangesInfo {
    public static final int $stable = 8;

    @JSONField(name = "last_update_time")
    @Nullable
    private String lastUpdateTime;

    @JSONField(name = "link")
    @Nullable
    private String link;

    @JSONField(name = "read_number")
    @Nullable
    private String readNumber;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "user_name")
    @Nullable
    private String userName;

    @Nullable
    public final String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getReadNumber() {
        return this.readNumber;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public final void setLastUpdateTime(@Nullable String str) {
        this.lastUpdateTime = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setReadNumber(@Nullable String str) {
        this.readNumber = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }
}
