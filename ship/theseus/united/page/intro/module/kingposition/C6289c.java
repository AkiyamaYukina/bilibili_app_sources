package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.kingposition.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/c.class */
@StabilityInferred(parameters = 1)
public final class C6289c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KingPositionType f100458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f100459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f100460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f100461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f100462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final H f100463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C6287a f100464g;

    public C6289c(KingPositionType kingPositionType, boolean z6, String str, String str2, String str3, H h, C6287a c6287a, int i7) {
        str2 = (i7 & 8) != 0 ? null : str2;
        str3 = (i7 & 16) != 0 ? null : str3;
        h = (i7 & 32) != 0 ? null : h;
        c6287a = (i7 & 64) != 0 ? null : c6287a;
        this.f100458a = kingPositionType;
        this.f100459b = z6;
        this.f100460c = str;
        this.f100461d = str2;
        this.f100462e = str3;
        this.f100463f = h;
        this.f100464g = c6287a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6289c)) {
            return false;
        }
        C6289c c6289c = (C6289c) obj;
        return this.f100458a == c6289c.f100458a && this.f100459b == c6289c.f100459b && Intrinsics.areEqual(this.f100460c, c6289c.f100460c) && Intrinsics.areEqual(this.f100461d, c6289c.f100461d) && Intrinsics.areEqual(this.f100462e, c6289c.f100462e) && Intrinsics.areEqual(this.f100463f, c6289c.f100463f) && Intrinsics.areEqual(this.f100464g, c6289c.f100464g) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a(this.f100458a.hashCode() * 31, 31, this.f100459b);
        int iHashCode = 0;
        String str = this.f100460c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f100461d;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f100462e;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        H h = this.f100463f;
        int iHashCode5 = h == null ? 0 : h.hashCode();
        C6287a c6287a = this.f100464g;
        if (c6287a != null) {
            iHashCode = c6287a.hashCode();
        }
        return (((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31;
    }

    @NotNull
    public final String toString() {
        return "KingPosition(type=" + this.f100458a + ", disable=" + this.f100459b + ", disableToast=" + this.f100460c + ", icon=" + this.f100461d + ", checkedToast=" + this.f100462e + ", likeExtend=" + this.f100463f + ", coinExtend=" + this.f100464g + ", cacheExtend=null)";
    }
}
