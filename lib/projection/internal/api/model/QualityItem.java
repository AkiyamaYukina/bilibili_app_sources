package com.bilibili.lib.projection.internal.api.model;

import Di0.C1602f;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.room.B;
import bilibili.live.app.service.resolver.a;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/QualityItem.class */
@Keep
public final class QualityItem {

    @SerializedName("description")
    @NotNull
    private String description;

    @SerializedName("displayDesc")
    @NotNull
    private String displayDesc;

    @SerializedName(alternate = {"need_login"}, value = "needLogin")
    private boolean needLogin;

    @SerializedName(alternate = {"need_vip"}, value = "needVip")
    private boolean needVip;

    @SerializedName("quality")
    private int quality;

    @SerializedName("superscript")
    @NotNull
    private String superscript;

    public QualityItem() {
        this(0, null, null, null, false, false, 63, null);
    }

    public QualityItem(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, boolean z7) {
        this.quality = i7;
        this.description = str;
        this.displayDesc = str2;
        this.superscript = str3;
        this.needLogin = z6;
        this.needVip = z7;
    }

    public /* synthetic */ QualityItem(int i7, String str, String str2, String str3, boolean z6, boolean z7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? "" : str, (i8 & 4) != 0 ? "" : str2, (i8 & 8) != 0 ? "" : str3, (i8 & 16) != 0 ? false : z6, (i8 & 32) != 0 ? false : z7);
    }

    public static /* synthetic */ QualityItem copy$default(QualityItem qualityItem, int i7, String str, String str2, String str3, boolean z6, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = qualityItem.quality;
        }
        if ((i8 & 2) != 0) {
            str = qualityItem.description;
        }
        if ((i8 & 4) != 0) {
            str2 = qualityItem.displayDesc;
        }
        if ((i8 & 8) != 0) {
            str3 = qualityItem.superscript;
        }
        if ((i8 & 16) != 0) {
            z6 = qualityItem.needLogin;
        }
        if ((i8 & 32) != 0) {
            z7 = qualityItem.needVip;
        }
        return qualityItem.copy(i7, str, str2, str3, z6, z7);
    }

    public final int component1() {
        return this.quality;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final String component3() {
        return this.displayDesc;
    }

    @NotNull
    public final String component4() {
        return this.superscript;
    }

    public final boolean component5() {
        return this.needLogin;
    }

    public final boolean component6() {
        return this.needVip;
    }

    @NotNull
    public final QualityItem copy(int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, boolean z7) {
        return new QualityItem(i7, str, str2, str3, z6, z7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityItem)) {
            return false;
        }
        QualityItem qualityItem = (QualityItem) obj;
        return this.quality == qualityItem.quality && Intrinsics.areEqual(this.description, qualityItem.description) && Intrinsics.areEqual(this.displayDesc, qualityItem.displayDesc) && Intrinsics.areEqual(this.superscript, qualityItem.superscript) && this.needLogin == qualityItem.needLogin && this.needVip == qualityItem.needVip;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDisplayDesc() {
        return this.displayDesc;
    }

    public final boolean getNeedLogin() {
        return this.needLogin;
    }

    public final boolean getNeedVip() {
        return this.needVip;
    }

    public final int getQuality() {
        return this.quality;
    }

    @NotNull
    public final String getSuperscript() {
        return this.superscript;
    }

    public int hashCode() {
        return Boolean.hashCode(this.needVip) + z.a(E.a(E.a(E.a(Integer.hashCode(this.quality) * 31, 31, this.description), 31, this.displayDesc), 31, this.superscript), 31, this.needLogin);
    }

    public final void setDescription(@NotNull String str) {
        this.description = str;
    }

    public final void setDisplayDesc(@NotNull String str) {
        this.displayDesc = str;
    }

    public final void setNeedLogin(boolean z6) {
        this.needLogin = z6;
    }

    public final void setNeedVip(boolean z6) {
        this.needVip = z6;
    }

    public final void setQuality(int i7) {
        this.quality = i7;
    }

    public final void setSuperscript(@NotNull String str) {
        this.superscript = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.quality;
        String str = this.description;
        String str2 = this.displayDesc;
        String str3 = this.superscript;
        boolean z6 = this.needLogin;
        boolean z7 = this.needVip;
        StringBuilder sbB = a.b(i7, "QualityItem(quality=", ", description=", str, ", displayDesc=");
        B.a(str2, ", superscript=", str3, ", needLogin=", sbB);
        return C1602f.a(", needVip=", ")", sbB, z6, z7);
    }
}
