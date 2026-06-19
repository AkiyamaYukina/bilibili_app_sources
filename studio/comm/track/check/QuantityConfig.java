package com.bilibili.studio.comm.track.check;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/track/check/QuantityConfig.class */
@Keep
public final class QuantityConfig {

    @NotNull
    private String pv;

    @NotNull
    private String show;
    private boolean show_once;

    public QuantityConfig() {
        this(null, null, false, 7, null);
    }

    public QuantityConfig(@NotNull String str, @NotNull String str2, boolean z6) {
        this.pv = str;
        this.show = str2;
        this.show_once = z6;
    }

    public /* synthetic */ QuantityConfig(String str, String str2, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? false : z6);
    }

    public static /* synthetic */ QuantityConfig copy$default(QuantityConfig quantityConfig, String str, String str2, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = quantityConfig.pv;
        }
        if ((i7 & 2) != 0) {
            str2 = quantityConfig.show;
        }
        if ((i7 & 4) != 0) {
            z6 = quantityConfig.show_once;
        }
        return quantityConfig.copy(str, str2, z6);
    }

    @NotNull
    public final String component1() {
        return this.pv;
    }

    @NotNull
    public final String component2() {
        return this.show;
    }

    public final boolean component3() {
        return this.show_once;
    }

    @NotNull
    public final QuantityConfig copy(@NotNull String str, @NotNull String str2, boolean z6) {
        return new QuantityConfig(str, str2, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuantityConfig)) {
            return false;
        }
        QuantityConfig quantityConfig = (QuantityConfig) obj;
        return Intrinsics.areEqual(this.pv, quantityConfig.pv) && Intrinsics.areEqual(this.show, quantityConfig.show) && this.show_once == quantityConfig.show_once;
    }

    @NotNull
    public final String getPv() {
        return this.pv;
    }

    @NotNull
    public final String getShow() {
        return this.show;
    }

    public final boolean getShow_once() {
        return this.show_once;
    }

    public int hashCode() {
        return Boolean.hashCode(this.show_once) + E.a(this.pv.hashCode() * 31, 31, this.show);
    }

    public final void setPv(@NotNull String str) {
        this.pv = str;
    }

    public final void setShow(@NotNull String str) {
        this.show = str;
    }

    public final void setShow_once(boolean z6) {
        this.show_once = z6;
    }

    @NotNull
    public String toString() {
        String str = this.pv;
        String str2 = this.show;
        return i.a(b.a("QuantityConfig(pv=", str, ", show=", str2, ", show_once="), this.show_once, ")");
    }
}
