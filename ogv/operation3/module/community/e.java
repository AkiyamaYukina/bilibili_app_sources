package com.bilibili.ogv.operation3.module.community;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f71175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71176b;

    public e(boolean z6, long j7) {
        this.f71175a = z6;
        this.f71176b = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f71175a == eVar.f71175a && this.f71176b == eVar.f71176b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71176b) + (Boolean.hashCode(this.f71175a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FavorRequest(hasFavored=");
        sb.append(this.f71175a);
        sb.append(", avid=");
        return android.support.v4.media.session.a.a(sb, this.f71176b, ")");
    }
}
