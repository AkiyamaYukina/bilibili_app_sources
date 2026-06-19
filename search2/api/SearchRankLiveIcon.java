package com.bilibili.search2.api;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchRankLiveIcon.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchRankLiveIcon {
    public static final int $stable = 8;

    @JSONField(name = "sun_url")
    @Nullable
    private String dayUrl;
    private int height;

    @JSONField(name = "night_url")
    @Nullable
    private String nightUrl;
    private int width;

    @Nullable
    public final String getDayUrl() {
        return this.dayUrl;
    }

    @Nullable
    public final String getDisplayUrl(@NotNull Context context) {
        String str;
        return (!MultipleThemeUtils.isNightTheme(context) || (str = this.nightUrl) == null || StringsKt.isBlank(str)) ? this.dayUrl : this.nightUrl;
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final String getNightUrl() {
        return this.nightUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setDayUrl(@Nullable String str) {
        this.dayUrl = str;
    }

    public final void setHeight(int i7) {
        this.height = i7;
    }

    public final void setNightUrl(@Nullable String str) {
        this.nightUrl = str;
    }

    public final void setWidth(int i7) {
        this.width = i7;
    }
}
