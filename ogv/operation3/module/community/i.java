package com.bilibili.ogv.operation3.module.community;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/community/i.class */
@StabilityInferred(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f71186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f71187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f71188c = null;

    public i(boolean z6, long j7) {
        this.f71186a = z6;
        this.f71187b = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f71186a == iVar.f71186a && this.f71187b == iVar.f71187b && Intrinsics.areEqual(this.f71188c, iVar.f71188c);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Boolean.hashCode(this.f71186a) * 31, 31, this.f71187b);
        Long l7 = this.f71188c;
        return iA + (l7 == null ? 0 : l7.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowSeasonRequest(hasFollowed=");
        sb.append(this.f71186a);
        sb.append(", seasonId=");
        sb.append(this.f71187b);
        sb.append(", liveId=");
        return com.bilibili.adcommon.utils.c.a(sb, this.f71188c, ")");
    }
}
