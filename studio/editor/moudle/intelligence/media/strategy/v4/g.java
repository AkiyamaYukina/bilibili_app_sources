package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import X1.C3081k;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f107485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f107486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f107487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> f107488d;

    public g(int i7, long j7, @NotNull String str, @NotNull List list) {
        this.f107485a = str;
        this.f107486b = i7;
        this.f107487c = j7;
        this.f107488d = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f107485a, gVar.f107485a) && this.f107486b == gVar.f107486b && this.f107487c == gVar.f107487c && Intrinsics.areEqual(this.f107488d, gVar.f107488d);
    }

    public final int hashCode() {
        return this.f107488d.hashCode() + C3554n0.a(I.a(this.f107486b, this.f107485a.hashCode() * 31, 31), 31, this.f107487c);
    }

    @NotNull
    public final String toString() {
        List<com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.a> list = this.f107488d;
        StringBuilder sb = new StringBuilder("ResultWrap(traceKey=");
        sb.append(this.f107485a);
        sb.append(", version=");
        sb.append(this.f107486b);
        sb.append(", startTime=");
        C3081k.c(sb, this.f107487c, ", list=", list);
        sb.append(")");
        return sb.toString();
    }
}
