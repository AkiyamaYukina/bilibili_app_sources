package com.bilibili.upper.module.uppercenter.datacenter;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.o;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/Diagnose.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Diagnose {
    public static final int $stable = 8;

    @JSONField(name = "screen")
    private int screen;

    @JSONField(name = "tip")
    @Nullable
    private String tip;

    @JSONField(name = "tip_url")
    @Nullable
    private String tipUrl;

    @JSONField(name = "type_name")
    @Nullable
    private String typeName;

    public Diagnose() {
        this(null, null, 0, null, 15, null);
    }

    public Diagnose(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3) {
        this.tip = str;
        this.tipUrl = str2;
        this.screen = i7;
        this.typeName = str3;
    }

    public /* synthetic */ Diagnose(String str, String str2, int i7, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? 1 : i7, (i8 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ Diagnose copy$default(Diagnose diagnose, String str, String str2, int i7, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = diagnose.tip;
        }
        if ((i8 & 2) != 0) {
            str2 = diagnose.tipUrl;
        }
        if ((i8 & 4) != 0) {
            i7 = diagnose.screen;
        }
        if ((i8 & 8) != 0) {
            str3 = diagnose.typeName;
        }
        return diagnose.copy(str, str2, i7, str3);
    }

    @Nullable
    public final String component1() {
        return this.tip;
    }

    @Nullable
    public final String component2() {
        return this.tipUrl;
    }

    public final int component3() {
        return this.screen;
    }

    @Nullable
    public final String component4() {
        return this.typeName;
    }

    @NotNull
    public final Diagnose copy(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3) {
        return new Diagnose(str, str2, i7, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Diagnose)) {
            return false;
        }
        Diagnose diagnose = (Diagnose) obj;
        return Intrinsics.areEqual(this.tip, diagnose.tip) && Intrinsics.areEqual(this.tipUrl, diagnose.tipUrl) && this.screen == diagnose.screen && Intrinsics.areEqual(this.typeName, diagnose.typeName);
    }

    public final int getScreen() {
        return this.screen;
    }

    @Nullable
    public final String getTip() {
        return this.tip;
    }

    @Nullable
    public final String getTipUrl() {
        return this.tipUrl;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    public int hashCode() {
        String str = this.tip;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tipUrl;
        int iA = I.a(this.screen, ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.typeName;
        return iA + (str3 == null ? 0 : str3.hashCode());
    }

    public final void setScreen(int i7) {
        this.screen = i7;
    }

    public final void setTip(@Nullable String str) {
        this.tip = str;
    }

    public final void setTipUrl(@Nullable String str) {
        this.tipUrl = str;
    }

    public final void setTypeName(@Nullable String str) {
        this.typeName = str;
    }

    @NotNull
    public String toString() {
        return o.a(this.screen, ", typeName=", this.typeName, ")", b.a("Diagnose(tip=", this.tip, ", tipUrl=", this.tipUrl, ", screen="));
    }
}
