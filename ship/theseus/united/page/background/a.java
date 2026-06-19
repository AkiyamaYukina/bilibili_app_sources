package com.bilibili.ship.theseus.united.page.background;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.B;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f99036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f99037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f99038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f99039d;

    public a(int i7, long j7, long j8, String str) {
        str = (i7 & 4) != 0 ? null : str;
        this.f99036a = j7;
        this.f99037b = j8;
        this.f99038c = str;
        this.f99039d = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f99036a == aVar.f99036a && this.f99037b == aVar.f99037b && Intrinsics.areEqual(this.f99038c, aVar.f99038c) && this.f99039d == aVar.f99039d;
    }

    public final int hashCode() {
        int iA = C3554n0.a(Long.hashCode(this.f99036a) * 31, 31, this.f99037b);
        String str = this.f99038c;
        return Boolean.hashCode(this.f99039d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f99039d;
        StringBuilder sb = new StringBuilder("BackgroundAIEpisode(avid=");
        sb.append(this.f99036a);
        sb.append(", cid=");
        sb.append(this.f99037b);
        sb.append(", trackId=");
        return B.c(this.f99038c, ", enableBackgroundPlay=", ")", sb, z6);
    }
}
