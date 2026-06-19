package com.bilibili.playerbizcommonv2.guideBubble;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/guideBubble/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliGuideBubble f81772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81774c;

    public h(@NotNull BiliGuideBubble biliGuideBubble, int i7, int i8) {
        this.f81772a = biliGuideBubble;
        this.f81773b = i7;
        this.f81774c = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f81772a, hVar.f81772a) && this.f81773b == hVar.f81773b && this.f81774c == hVar.f81774c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f81774c) + I.a(this.f81773b, this.f81772a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BiliGuideBubbleShowInfo(bubble=");
        sb.append(this.f81772a);
        sb.append(", xOff=");
        sb.append(this.f81773b);
        sb.append(", yOff=");
        return C4277b.a(this.f81774c, ")", sb);
    }
}
