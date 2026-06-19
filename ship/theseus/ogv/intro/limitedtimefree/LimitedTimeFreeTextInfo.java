package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/LimitedTimeFreeTextInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class LimitedTimeFreeTextInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93230b;

    public LimitedTimeFreeTextInfo(@NotNull String str, @NotNull String str2) {
        this.f93229a = str;
        this.f93230b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitedTimeFreeTextInfo)) {
            return false;
        }
        LimitedTimeFreeTextInfo limitedTimeFreeTextInfo = (LimitedTimeFreeTextInfo) obj;
        return Intrinsics.areEqual(this.f93229a, limitedTimeFreeTextInfo.f93229a) && Intrinsics.areEqual(this.f93230b, limitedTimeFreeTextInfo.f93230b);
    }

    public final int hashCode() {
        return this.f93230b.hashCode() + (this.f93229a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitedTimeFreeTextInfo(code=");
        sb.append(this.f93229a);
        sb.append(", text=");
        return C8770a.a(sb, this.f93230b, ")");
    }
}
