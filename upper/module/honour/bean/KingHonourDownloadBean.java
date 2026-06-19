package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourDownloadBean.class */
@StabilityInferred(parameters = 1)
@Keep
public final class KingHonourDownloadBean {
    public static final int $stable = 0;
    private final int index;
    private final boolean isPreload;

    @NotNull
    private final String url;

    public KingHonourDownloadBean(@NotNull String str, int i7, boolean z6) {
        this.url = str;
        this.index = i7;
        this.isPreload = z6;
    }

    public /* synthetic */ KingHonourDownloadBean(String str, int i7, boolean z6, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7, (i8 & 4) != 0 ? false : z6);
    }

    public static /* synthetic */ KingHonourDownloadBean copy$default(KingHonourDownloadBean kingHonourDownloadBean, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = kingHonourDownloadBean.url;
        }
        if ((i8 & 2) != 0) {
            i7 = kingHonourDownloadBean.index;
        }
        if ((i8 & 4) != 0) {
            z6 = kingHonourDownloadBean.isPreload;
        }
        return kingHonourDownloadBean.copy(str, i7, z6);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.index;
    }

    public final boolean component3() {
        return this.isPreload;
    }

    @NotNull
    public final KingHonourDownloadBean copy(@NotNull String str, int i7, boolean z6) {
        return new KingHonourDownloadBean(str, i7, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KingHonourDownloadBean)) {
            return false;
        }
        KingHonourDownloadBean kingHonourDownloadBean = (KingHonourDownloadBean) obj;
        return Intrinsics.areEqual(this.url, kingHonourDownloadBean.url) && this.index == kingHonourDownloadBean.index && this.isPreload == kingHonourDownloadBean.isPreload;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPreload) + I.a(this.index, this.url.hashCode() * 31, 31);
    }

    public final boolean isPreload() {
        return this.isPreload;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        int i7 = this.index;
        return i.a(e.a(i7, "KingHonourDownloadBean(url=", str, ", index=", ", isPreload="), this.isPreload, ")");
    }
}
