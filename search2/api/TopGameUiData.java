package com.bilibili.search2.api;

import I.E;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.OgvCardUI;
import com.bapis.bilibili.polymer.app.search.v1.TopGameUI;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/TopGameUiData.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TopGameUiData {
    public static final int $stable = 8;

    @JSONField(name = "background_image")
    @NotNull
    private String blurCoverUrl;

    @JSONField(name = "cover_default_color")
    @Nullable
    private String coverDefaultColor;

    @JSONField(name = "gaussian_blur_value")
    @Nullable
    private String gaussianBlurValue;

    @JSONField(name = "mask_color_value")
    @Nullable
    private String maskColorValue;

    @JSONField(name = "mask_opacity")
    @Nullable
    private String maskOpacity;

    @JSONField(name = "module_color")
    @NotNull
    private String moduleColor;

    public TopGameUiData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public TopGameUiData(@NotNull OgvCardUI ogvCardUI) {
        this(null, null, null, null, null, null, 63, null);
        this.blurCoverUrl = ogvCardUI.getBackgroundImage();
        this.moduleColor = ogvCardUI.getModuleColor();
        this.gaussianBlurValue = ogvCardUI.getGaussianBlurValue();
    }

    public TopGameUiData(@NotNull TopGameUI topGameUI) {
        this(topGameUI.getBackgroundImage(), topGameUI.getCoverDefaultColor(), topGameUI.getMaskColorValue(), topGameUI.getMaskOpacity(), topGameUI.getModuleColor(), topGameUI.getGaussianBlurValue());
    }

    public TopGameUiData(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6) {
        this.blurCoverUrl = str;
        this.coverDefaultColor = str2;
        this.maskColorValue = str3;
        this.maskOpacity = str4;
        this.moduleColor = str5;
        this.gaussianBlurValue = str6;
    }

    public /* synthetic */ TopGameUiData(String str, String str2, String str3, String str4, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "0.5" : str6);
    }

    public static /* synthetic */ TopGameUiData copy$default(TopGameUiData topGameUiData, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = topGameUiData.blurCoverUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = topGameUiData.coverDefaultColor;
        }
        if ((i7 & 4) != 0) {
            str3 = topGameUiData.maskColorValue;
        }
        if ((i7 & 8) != 0) {
            str4 = topGameUiData.maskOpacity;
        }
        if ((i7 & 16) != 0) {
            str5 = topGameUiData.moduleColor;
        }
        if ((i7 & 32) != 0) {
            str6 = topGameUiData.gaussianBlurValue;
        }
        return topGameUiData.copy(str, str2, str3, str4, str5, str6);
    }

    @NotNull
    public final String component1() {
        return this.blurCoverUrl;
    }

    @Nullable
    public final String component2() {
        return this.coverDefaultColor;
    }

    @Nullable
    public final String component3() {
        return this.maskColorValue;
    }

    @Nullable
    public final String component4() {
        return this.maskOpacity;
    }

    @NotNull
    public final String component5() {
        return this.moduleColor;
    }

    @Nullable
    public final String component6() {
        return this.gaussianBlurValue;
    }

    @NotNull
    public final TopGameUiData copy(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable String str6) {
        return new TopGameUiData(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopGameUiData)) {
            return false;
        }
        TopGameUiData topGameUiData = (TopGameUiData) obj;
        return Intrinsics.areEqual(this.blurCoverUrl, topGameUiData.blurCoverUrl) && Intrinsics.areEqual(this.coverDefaultColor, topGameUiData.coverDefaultColor) && Intrinsics.areEqual(this.maskColorValue, topGameUiData.maskColorValue) && Intrinsics.areEqual(this.maskOpacity, topGameUiData.maskOpacity) && Intrinsics.areEqual(this.moduleColor, topGameUiData.moduleColor) && Intrinsics.areEqual(this.gaussianBlurValue, topGameUiData.gaussianBlurValue);
    }

    @NotNull
    public final String getBlurCoverUrl() {
        return this.blurCoverUrl;
    }

    @Nullable
    public final String getCoverDefaultColor() {
        return this.coverDefaultColor;
    }

    @Nullable
    public final String getGaussianBlurValue() {
        return this.gaussianBlurValue;
    }

    @Nullable
    public final String getMaskColorValue() {
        return this.maskColorValue;
    }

    @Nullable
    public final String getMaskOpacity() {
        return this.maskOpacity;
    }

    @NotNull
    public final String getModuleColor() {
        return this.moduleColor;
    }

    public int hashCode() {
        int iHashCode = this.blurCoverUrl.hashCode();
        String str = this.coverDefaultColor;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.maskColorValue;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maskOpacity;
        int iA = E.a(((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.moduleColor);
        String str4 = this.gaussianBlurValue;
        return iA + (str4 == null ? 0 : str4.hashCode());
    }

    public final void setBlurCoverUrl(@NotNull String str) {
        this.blurCoverUrl = str;
    }

    public final void setCoverDefaultColor(@Nullable String str) {
        this.coverDefaultColor = str;
    }

    public final void setGaussianBlurValue(@Nullable String str) {
        this.gaussianBlurValue = str;
    }

    public final void setMaskColorValue(@Nullable String str) {
        this.maskColorValue = str;
    }

    public final void setMaskOpacity(@Nullable String str) {
        this.maskOpacity = str;
    }

    public final void setModuleColor(@NotNull String str) {
        this.moduleColor = str;
    }

    @NotNull
    public String toString() {
        String str = this.blurCoverUrl;
        String str2 = this.coverDefaultColor;
        String str3 = this.maskColorValue;
        String str4 = this.maskOpacity;
        String str5 = this.moduleColor;
        String str6 = this.gaussianBlurValue;
        StringBuilder sbA = G0.b.a("TopGameUiData(blurCoverUrl=", str, ", coverDefaultColor=", str2, ", maskColorValue=");
        B.a(str3, ", maskOpacity=", str4, ", moduleColor=", sbA);
        return A.a(str5, ", gaussianBlurValue=", str6, ")", sbA);
    }
}
