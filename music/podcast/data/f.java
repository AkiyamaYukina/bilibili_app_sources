package com.bilibili.music.podcast.data;

import X1.C3081k;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.e0;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Long> f66456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final EventTracking f66457d;

    public f(int i7, long j7, @NotNull List<Long> list, @Nullable EventTracking eventTracking) {
        this.f66454a = i7;
        this.f66455b = j7;
        this.f66456c = list;
        this.f66457d = eventTracking;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f66454a == fVar.f66454a && this.f66455b == fVar.f66455b && Intrinsics.areEqual(this.f66456c, fVar.f66456c) && Intrinsics.areEqual(this.f66457d, fVar.f66457d);
    }

    public final int hashCode() {
        int iA = e0.a(C3554n0.a(Integer.hashCode(this.f66454a) * 31, 31, this.f66455b), 31, this.f66456c);
        EventTracking eventTracking = this.f66457d;
        return iA + (eventTracking == null ? 0 : eventTracking.hashCode());
    }

    @NotNull
    public final String toString() {
        List<Long> list = this.f66456c;
        StringBuilder sb = new StringBuilder("FindPlayItem(type=");
        sb.append(this.f66454a);
        sb.append(", oid=");
        C3081k.c(sb, this.f66455b, ", subIds=", list);
        sb.append(", eventTracking=");
        sb.append(this.f66457d);
        sb.append(")");
        return sb.toString();
    }
}
