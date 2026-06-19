package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f100577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final b f100578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<c> f100579c;

    public d(@Nullable String str, @Nullable b bVar, @Nullable List<c> list) {
        this.f100577a = str;
        this.f100578b = bVar;
        this.f100579c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f100577a, dVar.f100577a) && Intrinsics.areEqual(this.f100578b, dVar.f100578b) && Intrinsics.areEqual(this.f100579c, dVar.f100579c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f100577a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        b bVar = this.f100578b;
        int iHashCode3 = bVar == null ? 0 : bVar.hashCode();
        List<c> list = this.f100579c;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "MerchandiseData(title=" + this.f100577a + ", button=" + this.f100578b + ", card=" + this.f100579c + ")";
    }
}
