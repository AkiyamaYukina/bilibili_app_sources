package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/A0.class */
@StabilityInferred(parameters = 1)
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f100809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f100812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C6315g0 f100813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final C6304b f100814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C6304b f100815g;

    @NotNull
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final L0 f100816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final C6302a f100817j;

    public A0(long j7, @NotNull String str, float f7, @NotNull String str2, @Nullable C6315g0 c6315g0, @Nullable C6304b c6304b, @Nullable C6304b c6304b2, @NotNull String str3, @Nullable L0 l02, @Nullable C6302a c6302a) {
        this.f100809a = j7;
        this.f100810b = str;
        this.f100811c = f7;
        this.f100812d = str2;
        this.f100813e = c6315g0;
        this.f100814f = c6304b;
        this.f100815g = c6304b2;
        this.h = str3;
        this.f100816i = l02;
        this.f100817j = c6302a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return this.f100809a == a02.f100809a && Intrinsics.areEqual(this.f100810b, a02.f100810b) && Float.compare(this.f100811c, a02.f100811c) == 0 && Intrinsics.areEqual(this.f100812d, a02.f100812d) && Intrinsics.areEqual(this.f100813e, a02.f100813e) && Intrinsics.areEqual(this.f100814f, a02.f100814f) && Intrinsics.areEqual(this.f100815g, a02.f100815g) && Intrinsics.areEqual(this.h, a02.h) && Intrinsics.areEqual(this.f100816i, a02.f100816i) && Intrinsics.areEqual(this.f100817j, a02.f100817j);
    }

    public final int hashCode() {
        int iA = I.E.a(androidx.compose.animation.n.a(this.f100811c, I.E.a(Long.hashCode(this.f100809a) * 31, 31, this.f100810b), 31), 31, this.f100812d);
        C6315g0 c6315g0 = this.f100813e;
        int iHashCode = c6315g0 == null ? 0 : c6315g0.hashCode();
        C6304b c6304b = this.f100814f;
        int iHashCode2 = c6304b == null ? 0 : c6304b.hashCode();
        C6304b c6304b2 = this.f100815g;
        int iA2 = I.E.a((((((iA + iHashCode) * 31) + iHashCode2) * 31) + (c6304b2 == null ? 0 : c6304b2.hashCode())) * 31, 31, this.h);
        L0 l02 = this.f100816i;
        int iHashCode3 = l02 == null ? 0 : l02.hashCode();
        C6302a c6302a = this.f100817j;
        return ((iA2 + iHashCode3) * 31) + (c6302a == null ? 0 : c6302a.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RelateGameCard(reserveStatus=" + this.f100809a + ", reserve=" + this.f100810b + ", rating=" + this.f100811c + ", tagName=" + this.f100812d + ", rankInfo=" + this.f100813e + ", packInfo=" + this.f100814f + ", notice=" + this.f100815g + ", recommendReason=" + this.h + ", wikiInfo=" + this.f100816i + ", badgeInfo=" + this.f100817j + ")";
    }
}
