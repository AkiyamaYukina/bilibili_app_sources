package com.bilibili.music.podcast.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f66449b;

    public b(long j7, @Nullable String str) {
        this.f66448a = j7;
        this.f66449b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f66448a == bVar.f66448a && Intrinsics.areEqual(this.f66449b, bVar.f66449b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f66448a);
        String str = this.f66449b;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ArchiveAuthor(mid=");
        sb.append(this.f66448a);
        sb.append(", name=");
        return C8770a.a(sb, this.f66449b, ")");
    }
}
