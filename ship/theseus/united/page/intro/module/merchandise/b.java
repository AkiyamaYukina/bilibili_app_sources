package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f100569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f100570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f100571c;

    public b(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f100569a = str;
        this.f100570b = str2;
        this.f100571c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f100569a, bVar.f100569a) && Intrinsics.areEqual(this.f100570b, bVar.f100570b) && Intrinsics.areEqual(this.f100571c, bVar.f100571c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f100569a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f100570b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f100571c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchandiseButton(title=");
        sb.append(this.f100569a);
        sb.append(", dayColor=");
        sb.append(this.f100570b);
        sb.append(", nightColor=");
        return C8770a.a(sb, this.f100571c, ")");
    }
}
