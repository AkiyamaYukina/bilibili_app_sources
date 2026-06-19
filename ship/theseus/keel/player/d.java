package com.bilibili.ship.theseus.keel.player;

import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f91096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f91097f;

    public d() {
        this(0, 0, 0, 63);
    }

    public d(int i7, int i8, int i9, int i10) {
        i7 = (i10 & 1) != 0 ? 3 : i7;
        i8 = (i10 & 2) != 0 ? 1 : i8;
        i9 = (i10 & 4) != 0 ? 0 : i9;
        this.f91092a = i7;
        this.f91093b = i8;
        this.f91094c = i9;
        this.f91095d = 0;
        this.f91096e = 0L;
        this.f91097f = 0L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f91092a == dVar.f91092a && this.f91093b == dVar.f91093b && this.f91094c == dVar.f91094c && this.f91095d == dVar.f91095d && this.f91096e == dVar.f91096e && this.f91097f == dVar.f91097f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91097f) + C3554n0.a(I.a(this.f91095d, I.a(this.f91094c, I.a(this.f91093b, Integer.hashCode(this.f91092a) * 31, 31), 31), 31), 31, this.f91096e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PieceReport(type=");
        sb.append(this.f91092a);
        sb.append(", playType=");
        sb.append(this.f91093b);
        sb.append(", subType=");
        sb.append(this.f91094c);
        sb.append(", epStatus=");
        sb.append(this.f91095d);
        sb.append(", seasonId=");
        sb.append(this.f91096e);
        sb.append(", epId=");
        return android.support.v4.media.session.a.a(sb, this.f91097f, ")");
    }
}
