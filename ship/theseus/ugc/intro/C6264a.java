package com.bilibili.ship.theseus.ugc.intro;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/a.class */
@StabilityInferred(parameters = 1)
public final class C6264a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96937c;

    public C6264a() {
        this(-1, -1L, false);
    }

    public C6264a(int i7, long j7, boolean z6) {
        this.f96935a = i7;
        this.f96936b = j7;
        this.f96937c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6264a)) {
            return false;
        }
        C6264a c6264a = (C6264a) obj;
        return this.f96935a == c6264a.f96935a && this.f96936b == c6264a.f96936b && this.f96937c == c6264a.f96937c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f96937c) + C3554n0.a(Integer.hashCode(this.f96935a) * 31, 31, this.f96936b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PartInfoOrderEvent(type=");
        sb.append(this.f96935a);
        sb.append(", id=");
        sb.append(this.f96936b);
        sb.append(", status=");
        return androidx.appcompat.app.i.a(sb, this.f96937c, ")");
    }
}
