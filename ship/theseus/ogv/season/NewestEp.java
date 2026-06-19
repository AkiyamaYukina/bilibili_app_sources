package com.bilibili.ship.theseus.ogv.season;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/NewestEp.class */
@StabilityInferred(parameters = 1)
@Bson
public final class NewestEp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f94443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f94444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f94445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f94446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f94447e;

    public NewestEp(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.f94443a = j7;
        this.f94444b = str;
        this.f94445c = str2;
        this.f94446d = str3;
        this.f94447e = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewestEp)) {
            return false;
        }
        NewestEp newestEp = (NewestEp) obj;
        return this.f94443a == newestEp.f94443a && Intrinsics.areEqual(this.f94444b, newestEp.f94444b) && Intrinsics.areEqual(this.f94445c, newestEp.f94445c) && Intrinsics.areEqual(this.f94446d, newestEp.f94446d) && Intrinsics.areEqual(this.f94447e, newestEp.f94447e);
    }

    public final int hashCode() {
        return this.f94447e.hashCode() + E.a(E.a(E.a(Long.hashCode(this.f94443a) * 31, 31, this.f94444b), 31, this.f94445c), 31, this.f94446d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NewestEp(id=");
        sb.append(this.f94443a);
        sb.append(", title=");
        sb.append(this.f94444b);
        sb.append(", desc=");
        sb.append(this.f94445c);
        sb.append(", more=");
        sb.append(this.f94446d);
        sb.append(", cover=");
        return C8770a.a(sb, this.f94447e, ")");
    }
}
