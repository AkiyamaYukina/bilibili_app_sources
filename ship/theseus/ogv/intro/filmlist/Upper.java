package com.bilibili.ship.theseus.ogv.intro.filmlist;

import I.E;
import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/filmlist/Upper.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Upper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OfficialVerify f92681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f92682d;

    public Upper(@NotNull String str, @NotNull String str2, @NotNull OfficialVerify officialVerify, long j7) {
        this.f92679a = str;
        this.f92680b = str2;
        this.f92681c = officialVerify;
        this.f92682d = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Upper)) {
            return false;
        }
        Upper upper = (Upper) obj;
        return Intrinsics.areEqual(this.f92679a, upper.f92679a) && Intrinsics.areEqual(this.f92680b, upper.f92680b) && Intrinsics.areEqual(this.f92681c, upper.f92681c) && this.f92682d == upper.f92682d;
    }

    public final int hashCode() {
        int iA = E.a(this.f92679a.hashCode() * 31, 31, this.f92680b);
        return Long.hashCode(this.f92682d) + ((this.f92681c.hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Upper(title=");
        sb.append(this.f92679a);
        sb.append(", face=");
        sb.append(this.f92680b);
        sb.append(", officialVerify=");
        sb.append(this.f92681c);
        sb.append(", mid=");
        return a.a(sb, this.f92682d, ")");
    }
}
