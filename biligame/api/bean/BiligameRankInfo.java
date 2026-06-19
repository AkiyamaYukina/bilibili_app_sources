package com.bilibili.biligame.api.bean;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/BiligameRankInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameRankInfo {
    public static final int $stable = 8;

    @JSONField(name = "bkg_day_color")
    @Nullable
    private String bkgDayColor;

    @JSONField(name = "bkg_night_color")
    @Nullable
    private String bkgNightColor;

    @JSONField(name = "day_icon_url")
    @Nullable
    private String dayIconUrl;

    @JSONField(name = "font_day_color")
    @Nullable
    private String fontDayColor;

    @JSONField(name = "font_night_color")
    @Nullable
    private String fontNightColor;

    @JSONField(name = "game_base_id")
    private int gameBaseId;

    @JSONField(name = "game_rank")
    private int gameRank;

    @ColorInt
    private int mBkgColor;

    @ColorInt
    private int mFontColor;

    @JSONField(name = "night_icon_url")
    @Nullable
    private String nightIconUrl;

    @JSONField(name = "rank_content")
    @Nullable
    private String rankContent;

    @JSONField(name = "rank_link")
    @Nullable
    private String rankLink;

    @JSONField(name = "rank_type")
    private int rankType;

    @ColorInt
    public final int getBkgColor(@NotNull Context context) {
        int color;
        int i7 = this.mBkgColor;
        if (i7 != 0) {
            return i7;
        }
        try {
            color = Color.parseColor(MultipleThemeUtils.isNightTheme(context) ? this.bkgNightColor : this.bkgDayColor);
        } catch (Exception e7) {
            color = Color.parseColor("#FFF1ED");
        }
        this.mBkgColor = color;
        return color;
    }

    @Nullable
    public final String getBkgDayColor() {
        return this.bkgDayColor;
    }

    @Nullable
    public final String getBkgNightColor() {
        return this.bkgNightColor;
    }

    @Nullable
    public final String getDayIconUrl() {
        return this.dayIconUrl;
    }

    @ColorInt
    public final int getFontColor(@NotNull Context context) {
        int color;
        int i7 = this.mFontColor;
        if (i7 != 0) {
            return i7;
        }
        try {
            color = Color.parseColor(MultipleThemeUtils.isNightTheme(context) ? this.fontNightColor : this.fontDayColor);
        } catch (Exception e7) {
            color = ContextCompat.getColor(context, R$color.Br6);
        }
        this.mFontColor = color;
        return color;
    }

    @Nullable
    public final String getFontDayColor() {
        return this.fontDayColor;
    }

    @Nullable
    public final String getFontNightColor() {
        return this.fontNightColor;
    }

    public final int getGameBaseId() {
        return this.gameBaseId;
    }

    public final int getGameRank() {
        return this.gameRank;
    }

    @Nullable
    public final String getIconUrl(@NotNull Context context) {
        return MultipleThemeUtils.isNightTheme(context) ? this.nightIconUrl : this.dayIconUrl;
    }

    @Nullable
    public final String getNightIconUrl() {
        return this.nightIconUrl;
    }

    @Nullable
    public final String getRankContent() {
        return this.rankContent;
    }

    @Nullable
    public final String getRankLink() {
        return this.rankLink;
    }

    public final int getRankType() {
        return this.rankType;
    }

    public final boolean isValid() {
        String str = this.rankContent;
        return !(str == null || StringsKt.isBlank(str));
    }

    public final void setBkgDayColor(@Nullable String str) {
        this.bkgDayColor = str;
    }

    public final void setBkgNightColor(@Nullable String str) {
        this.bkgNightColor = str;
    }

    public final void setDayIconUrl(@Nullable String str) {
        this.dayIconUrl = str;
    }

    public final void setFontDayColor(@Nullable String str) {
        this.fontDayColor = str;
    }

    public final void setFontNightColor(@Nullable String str) {
        this.fontNightColor = str;
    }

    public final void setGameBaseId(int i7) {
        this.gameBaseId = i7;
    }

    public final void setGameRank(int i7) {
        this.gameRank = i7;
    }

    public final void setNightIconUrl(@Nullable String str) {
        this.nightIconUrl = str;
    }

    public final void setRankContent(@Nullable String str) {
        this.rankContent = str;
    }

    public final void setRankLink(@Nullable String str) {
        this.rankLink = str;
    }

    public final void setRankType(int i7) {
        this.rankType = i7;
    }
}
