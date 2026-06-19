package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiStrategyInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiStrategyInfo {
    public static final int $stable = 8;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "title_img")
    @Nullable
    private String titleImg;

    @JSONField(name = "title_link")
    @Nullable
    private String titleLink;

    @JSONField(name = "user_img")
    @Nullable
    private String userImg;

    @JSONField(name = "user_name")
    @Nullable
    private String userName;

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleImg() {
        return this.titleImg;
    }

    @Nullable
    public final String getTitleLink() {
        return this.titleLink;
    }

    @Nullable
    public final String getUserImg() {
        return this.userImg;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTitleImg(@Nullable String str) {
        this.titleImg = str;
    }

    public final void setTitleLink(@Nullable String str) {
        this.titleLink = str;
    }

    public final void setUserImg(@Nullable String str) {
        this.userImg = str;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }
}
