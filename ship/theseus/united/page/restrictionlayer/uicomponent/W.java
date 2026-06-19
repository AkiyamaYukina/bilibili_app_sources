package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6391p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/W.class */
@StabilityInferred(parameters = 0)
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f102831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f102832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6391p f102833g;

    public W(@NotNull String str, int i7, int i8, int i9, int i10, @NotNull ExposureEntry exposureEntry, @NotNull C6391p c6391p) {
        this.f102827a = str;
        this.f102828b = i7;
        this.f102829c = i8;
        this.f102830d = i9;
        this.f102831e = i10;
        this.f102832f = exposureEntry;
        this.f102833g = c6391p;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w7 = (W) obj;
        return Intrinsics.areEqual(this.f102827a, w7.f102827a) && this.f102828b == w7.f102828b && this.f102829c == w7.f102829c && this.f102830d == w7.f102830d && this.f102831e == w7.f102831e && Intrinsics.areEqual(this.f102832f, w7.f102832f) && Intrinsics.areEqual(this.f102833g, w7.f102833g);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.core.I.a(this.f102831e, androidx.compose.animation.core.I.a(this.f102830d, androidx.compose.animation.core.I.a(this.f102829c, androidx.compose.animation.core.I.a(this.f102828b, this.f102827a.hashCode() * 31, 31), 31), 31), 31);
        return hashCode() + ((this.f102832f.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "RestrictionUniversalInterceptButton(text=" + this.f102827a + ", textColor=" + this.f102828b + ", bgColor=" + this.f102829c + ", bgGradientStartColor=" + this.f102830d + ", bgGradientEndColor=" + this.f102831e + ", onExpose=" + this.f102832f + ", onClick=" + this.f102833g + ")";
    }
}
