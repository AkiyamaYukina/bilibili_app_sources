package com.bilibili.playset.api;

import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/TranslateInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TranslateInfo {
    public static final int $stable = 8;

    @SerializedName("origin_text")
    @Nullable
    private final String originText;

    @SerializedName("translate_state")
    private int translateState;

    @SerializedName("translate_text")
    @Nullable
    private final String translateText;

    @SerializedName("translate_title")
    @Nullable
    private String translateTitle;

    public TranslateInfo() {
        this(null, null, 0, null, 15, null);
    }

    public TranslateInfo(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3) {
        this.translateText = str;
        this.originText = str2;
        this.translateState = i7;
        this.translateTitle = str3;
    }

    public /* synthetic */ TranslateInfo(String str, String str2, int i7, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ TranslateInfo copy$default(TranslateInfo translateInfo, String str, String str2, int i7, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = translateInfo.translateText;
        }
        if ((i8 & 2) != 0) {
            str2 = translateInfo.originText;
        }
        if ((i8 & 4) != 0) {
            i7 = translateInfo.translateState;
        }
        if ((i8 & 8) != 0) {
            str3 = translateInfo.translateTitle;
        }
        return translateInfo.copy(str, str2, i7, str3);
    }

    @Nullable
    public final String component1() {
        return this.translateText;
    }

    @Nullable
    public final String component2() {
        return this.originText;
    }

    public final int component3() {
        return this.translateState;
    }

    @Nullable
    public final String component4() {
        return this.translateTitle;
    }

    @NotNull
    public final TranslateInfo copy(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3) {
        return new TranslateInfo(str, str2, i7, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateInfo)) {
            return false;
        }
        TranslateInfo translateInfo = (TranslateInfo) obj;
        return Intrinsics.areEqual(this.translateText, translateInfo.translateText) && Intrinsics.areEqual(this.originText, translateInfo.originText) && this.translateState == translateInfo.translateState && Intrinsics.areEqual(this.translateTitle, translateInfo.translateTitle);
    }

    @Nullable
    public final String getOriginText() {
        return this.originText;
    }

    public final int getTranslateState() {
        return this.translateState;
    }

    @Nullable
    public final String getTranslateText() {
        return this.translateText;
    }

    @Nullable
    public final String getTranslateTitle() {
        return this.translateTitle;
    }

    public int hashCode() {
        String str = this.translateText;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.originText;
        int iA = I.a(this.translateState, ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.translateTitle;
        return iA + (str3 == null ? 0 : str3.hashCode());
    }

    public final void setTranslateState(int i7) {
        this.translateState = i7;
    }

    public final void setTranslateTitle(@Nullable String str) {
        this.translateTitle = str;
    }

    @NotNull
    public String toString() {
        return cf.o.a(this.translateState, ", translateTitle=", this.translateTitle, ")", G0.b.a("TranslateInfo(translateText=", this.translateText, ", originText=", this.originText, ", translateState="));
    }
}
