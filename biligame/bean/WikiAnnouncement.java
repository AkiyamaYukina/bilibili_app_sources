package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiAnnouncement.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiAnnouncement {
    public static final int $stable = 8;

    @JSONField(name = "info")
    @Nullable
    private List<WikiAnnouncementInfo> infoList;

    @JSONField(name = "more_announcement_url")
    @Nullable
    private String moreAnnouncementUrl;

    @Nullable
    public final List<WikiAnnouncementInfo> getInfoList() {
        return this.infoList;
    }

    @Nullable
    public final String getMoreAnnouncementUrl() {
        return this.moreAnnouncementUrl;
    }

    public final void setInfoList(@Nullable List<WikiAnnouncementInfo> list) {
        this.infoList = list;
    }

    public final void setMoreAnnouncementUrl(@Nullable String str) {
        this.moreAnnouncementUrl = str;
    }
}
