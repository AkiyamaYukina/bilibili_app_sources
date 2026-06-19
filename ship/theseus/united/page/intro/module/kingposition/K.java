package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/K.class */
@StabilityInferred(parameters = 1)
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f100237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f100238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f100239c;

    public K(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f100237a = str;
        this.f100238b = str2;
        this.f100239c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return Intrinsics.areEqual(this.f100237a, k7.f100237a) && Intrinsics.areEqual(this.f100238b, k7.f100238b) && Intrinsics.areEqual(this.f100239c, k7.f100239c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f100237a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f100238b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f100239c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerAnimation(icon1=");
        sb.append(this.f100237a);
        sb.append(", icon2=");
        sb.append(this.f100238b);
        sb.append(", icon3=");
        return C8770a.a(sb, this.f100239c, ")");
    }
}
