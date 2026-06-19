package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiRecentChanges.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiRecentChanges {
    public static final int $stable = 8;

    @JSONField(name = "info")
    @Nullable
    private List<WikiRecentChangesInfo> infoList;

    @JSONField(name = "more_recent_changes_url")
    @Nullable
    private String moreRecentChangesUrl;

    @Nullable
    public final List<WikiRecentChangesInfo> getInfoList() {
        return this.infoList;
    }

    @Nullable
    public final String getMoreRecentChangesUrl() {
        return this.moreRecentChangesUrl;
    }

    public final void setInfoList(@Nullable List<WikiRecentChangesInfo> list) {
        this.infoList = list;
    }

    public final void setMoreRecentChangesUrl(@Nullable String str) {
        this.moreRecentChangesUrl = str;
    }
}
