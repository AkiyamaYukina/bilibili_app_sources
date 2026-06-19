package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/O.class */
@StabilityInferred(parameters = 1)
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f100449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f100450d;

    public O(@NotNull String str, @NotNull String str2, @NotNull String str3, long j7) {
        this.f100447a = str;
        this.f100448b = str2;
        this.f100449c = str3;
        this.f100450d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o7 = (O) obj;
        return Intrinsics.areEqual(this.f100447a, o7.f100447a) && Intrinsics.areEqual(this.f100448b, o7.f100448b) && Intrinsics.areEqual(this.f100449c, o7.f100449c) && this.f100450d == o7.f100450d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f100450d) + I.E.a(I.E.a(this.f100447a.hashCode() * 31, 31, this.f100448b), 31, this.f100449c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpLikeImg(preImg=");
        sb.append(this.f100447a);
        sb.append(", sucImg=");
        sb.append(this.f100448b);
        sb.append(", content=");
        sb.append(this.f100449c);
        sb.append(", type=");
        return android.support.v4.media.session.a.a(sb, this.f100450d, ")");
    }
}
