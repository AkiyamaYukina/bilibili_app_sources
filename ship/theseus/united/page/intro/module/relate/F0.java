package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/F0.class */
@StabilityInferred(parameters = 1)
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C6302a f100997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C6302a f100998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Boolean f100999c;

    public F0(@Nullable C6302a c6302a, @Nullable C6302a c6302a2, @Nullable Boolean bool) {
        this.f100997a = c6302a;
        this.f100998b = c6302a2;
        this.f100999c = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return Intrinsics.areEqual(this.f100997a, f02.f100997a) && Intrinsics.areEqual(this.f100998b, f02.f100998b) && Intrinsics.areEqual(this.f100999c, f02.f100999c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        C6302a c6302a = this.f100997a;
        int iHashCode2 = c6302a == null ? 0 : c6302a.hashCode();
        C6302a c6302a2 = this.f100998b;
        int iHashCode3 = c6302a2 == null ? 0 : c6302a2.hashCode();
        Boolean bool = this.f100999c;
        if (bool != null) {
            iHashCode = bool.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelateSpecial(badgeInfo=");
        sb.append(this.f100997a);
        sb.append(", recmdReason=");
        sb.append(this.f100998b);
        sb.append(", showRcmdStyle=");
        return Fa.T.a(sb, this.f100999c, ")");
    }
}
