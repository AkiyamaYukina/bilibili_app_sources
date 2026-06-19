package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.Notice;
import com.bilibili.live.streaming.source.TextSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/PrInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class PrInfo {
    public static final int $stable = 8;

    @JSONField(name = "bg_color")
    @Nullable
    private String bgColor;

    @JSONField(name = "bg_color_night")
    @Nullable
    private String bgColorNight;

    @JSONField(name = TextSource.CFG_CONTENT)
    @Nullable
    private String content;

    @Nullable
    private String icon;

    @JSONField(name = "icon_night")
    @Nullable
    private String iconNight;

    @JSONField(name = "notice_id")
    private long noticeId;

    @JSONField(name = "text_color")
    @Nullable
    private String textColor;

    @JSONField(name = "text_color_night")
    @Nullable
    private String textColorNight;

    @JSONField(name = "url")
    @Nullable
    private String url;

    public PrInfo() {
    }

    public PrInfo(@NotNull Notice notice) {
        this.content = notice.getContent();
        this.noticeId = notice.getNoticeId();
        this.url = notice.getUrl();
        this.icon = notice.getIcon();
        this.iconNight = notice.getIconNight();
        this.textColor = notice.getTextColor();
        this.textColorNight = notice.getTextColorNight();
        this.bgColor = notice.getBgColor();
        this.bgColorNight = notice.getBgColorNight();
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @Nullable
    public final String getBgColorNight() {
        return this.bgColorNight;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconNight() {
        return this.iconNight;
    }

    public final long getNoticeId() {
        return this.noticeId;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getTextColorNight() {
        return this.textColorNight;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setBgColor(@Nullable String str) {
        this.bgColor = str;
    }

    public final void setBgColorNight(@Nullable String str) {
        this.bgColorNight = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIconNight(@Nullable String str) {
        this.iconNight = str;
    }

    public final void setNoticeId(long j7) {
        this.noticeId = j7;
    }

    public final void setTextColor(@Nullable String str) {
        this.textColor = str;
    }

    public final void setTextColorNight(@Nullable String str) {
        this.textColorNight = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
