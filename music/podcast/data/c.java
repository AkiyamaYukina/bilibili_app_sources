package com.bilibili.music.podcast.data;

import androidx.compose.foundation.C3554n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/c.class */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f66452c;

    public c(long j7, long j8, @Nullable String str) {
        this.f66450a = j7;
        this.f66451b = j8;
        this.f66452c = str;
    }

    @Override // com.bilibili.music.podcast.data.e
    public final int a() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66450a == cVar.f66450a && this.f66451b == cVar.f66451b && Intrinsics.areEqual(this.f66452c, cVar.f66452c);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.f66450a) * 31, 31, this.f66451b);
        String str = this.f66452c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Card(pickId=");
        sb.append(this.f66450a);
        sb.append(", cardId=");
        sb.append(this.f66451b);
        sb.append(", title=");
        return C8770a.a(sb, this.f66452c, ")");
    }
}
