package com.bilibili.pegasus.data.card;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/RecommendReasonStyle.class */
@Keep
public final class RecommendReasonStyle {

    @SerializedName("text")
    @Nullable
    private final String text;

    @SerializedName("text_color")
    @Nullable
    private final String textColor;

    @SerializedName("text_color_night")
    @Nullable
    private final String textColorNight;

    public RecommendReasonStyle() {
        this(null, null, null, 7, null);
    }

    public RecommendReasonStyle(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.text = str;
        this.textColor = str2;
        this.textColorNight = str3;
    }

    public /* synthetic */ RecommendReasonStyle(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final String getTextColorNight() {
        return this.textColorNight;
    }
}
