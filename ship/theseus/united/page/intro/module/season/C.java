package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/C.class */
@StabilityInferred(parameters = 1)
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f101449e;

    public C(long j7, long j8, long j9, @NotNull String str, @NotNull String str2) {
        this.f101445a = j7;
        this.f101446b = str;
        this.f101447c = j8;
        this.f101448d = str2;
        this.f101449e = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return this.f101445a == c7.f101445a && Intrinsics.areEqual(this.f101446b, c7.f101446b) && this.f101447c == c7.f101447c && Intrinsics.areEqual(this.f101448d, c7.f101448d) && this.f101449e == c7.f101449e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101449e) + I.E.a(C3554n0.a(I.E.a(Long.hashCode(this.f101445a) * 31, 31, this.f101446b), 31, this.f101447c), 31, this.f101448d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UnitedSeasonPanelData(avid=");
        sb.append(this.f101445a);
        sb.append(", bvid=");
        sb.append(this.f101446b);
        sb.append(", cid=");
        sb.append(this.f101447c);
        sb.append(", authorName=");
        sb.append(this.f101448d);
        sb.append(", authorMid=");
        return android.support.v4.media.session.a.a(sb, this.f101449e, ")");
    }
}
