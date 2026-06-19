package com.bilibili.ship.theseus.united.page.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/i.class */
@StabilityInferred(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f98965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98966b;

    public i() {
        this(0);
    }

    public /* synthetic */ i(int i7) {
        this(0L, 0L);
    }

    public i(long j7, long j8) {
        this.f98965a = j7;
        this.f98966b = j8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f98965a == iVar.f98965a && this.f98966b == iVar.f98966b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f98966b) + (Long.hashCode(this.f98965a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PageAdUpMid(upMid=");
        sb.append(this.f98965a);
        sb.append(", avid=");
        return android.support.v4.media.session.a.a(sb, this.f98966b, ")");
    }
}
