package com.bilibili.pegasus.channelv3.movie.head;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public String f75392d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75393e = 2131236716;

    public a(int i7, int i8, boolean z6) {
        this.f75389a = i7;
        this.f75390b = z6;
        this.f75391c = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f75389a == aVar.f75389a && this.f75390b == aVar.f75390b && this.f75391c == aVar.f75391c && Intrinsics.areEqual(this.f75392d, aVar.f75392d) && this.f75393e == aVar.f75393e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f75393e) + E.a(I.a(this.f75391c, z.a(Integer.hashCode(this.f75389a) * 31, 31, this.f75390b), 31), 31, this.f75392d);
    }

    @NotNull
    public final String toString() {
        String str = this.f75392d;
        int i7 = this.f75393e;
        StringBuilder sb = new StringBuilder("ChannelMovieButtonStyle(background=");
        sb.append(this.f75389a);
        sb.append(", isIconVisible=");
        sb.append(this.f75390b);
        sb.append(", textColor=");
        M.a(this.f75391c, ", title=", str, ", icon=", sb);
        return C4277b.a(i7, ")", sb);
    }
}
