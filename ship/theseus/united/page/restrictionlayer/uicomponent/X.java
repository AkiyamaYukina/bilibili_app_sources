package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.ship.theseus.united.page.restrictionlayer.MediaRestrictionLayerService$showUniversalIntercept$$inlined$map$1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/X.class */
@StabilityInferred(parameters = 0)
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<W> f102836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MediaRestrictionLayerService$showUniversalIntercept$$inlined$map$1 f102837d;

    public X(@NotNull String str, int i7, @NotNull List list, @NotNull MediaRestrictionLayerService$showUniversalIntercept$$inlined$map$1 mediaRestrictionLayerService$showUniversalIntercept$$inlined$map$1) {
        this.f102834a = str;
        this.f102835b = i7;
        this.f102836c = list;
        this.f102837d = mediaRestrictionLayerService$showUniversalIntercept$$inlined$map$1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x6 = (X) obj;
        return Intrinsics.areEqual(this.f102834a, x6.f102834a) && this.f102835b == x6.f102835b && Intrinsics.areEqual(this.f102836c, x6.f102836c) && Intrinsics.areEqual(this.f102837d, x6.f102837d);
    }

    public final int hashCode() {
        return hashCode() + e0.a(androidx.compose.animation.core.I.a(this.f102835b, this.f102834a.hashCode() * 31, 31), 31, this.f102836c);
    }

    @NotNull
    public final String toString() {
        List<W> list = this.f102836c;
        StringBuilder sb = new StringBuilder("RestrictionUniversalInterceptUI(text=");
        sb.append(this.f102834a);
        sb.append(", textColor=");
        c6.O.b(sb, this.f102835b, ", buttons=", list, ", fullscreenFlow=");
        sb.append(this.f102837d);
        sb.append(")");
        return sb.toString();
    }
}
