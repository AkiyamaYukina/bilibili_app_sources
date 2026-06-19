package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/FollowButtonV2.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FollowButtonV2 {
    public static final int $stable = 8;

    @JSONField(name = "icon")
    @Nullable
    private String icon;

    @JSONField(name = "status_report")
    @Nullable
    private String statusReport;

    @JSONField(name = "texts")
    @Nullable
    private FollowButtonTexts texts;

    public FollowButtonV2() {
    }

    public FollowButtonV2(@NotNull com.bapis.bilibili.polymer.app.search.v1.FollowButtonV2 followButtonV2) {
        this.icon = followButtonV2.getIcon();
        this.statusReport = followButtonV2.getStatusReport();
        this.texts = new FollowButtonTexts(followButtonV2.getTextsMap());
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getStatusReport() {
        return this.statusReport;
    }

    @Nullable
    public final FollowButtonTexts getTexts() {
        return this.texts;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setStatusReport(@Nullable String str) {
        this.statusReport = str;
    }

    public final void setTexts(@Nullable FollowButtonTexts followButtonTexts) {
        this.texts = followButtonTexts;
    }
}
