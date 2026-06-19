package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/G.class */
@StabilityInferred(parameters = 1)
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f89843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f89844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89845c;

    public G(@NotNull String str, long j7, boolean z6) {
        this.f89843a = str;
        this.f89844b = j7;
        this.f89845c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return Intrinsics.areEqual(this.f89843a, g7.f89843a) && this.f89844b == g7.f89844b && this.f89845c == g7.f89845c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89845c) + C3554n0.a(this.f89843a.hashCode() * 31, 31, this.f89844b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PugvSeasonPublisherSkuContentItem(title=");
        sb.append(this.f89843a);
        sb.append(", seasonId=");
        sb.append(this.f89844b);
        sb.append(", selected=");
        return androidx.appcompat.app.i.a(sb, this.f89845c, ")");
    }
}
