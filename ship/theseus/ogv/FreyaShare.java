package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/FreyaShare.class */
@StabilityInferred(parameters = 1)
@Bson
public final class FreyaShare {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f91227b;

    public FreyaShare(@NotNull String str, @NotNull String str2) {
        this.f91226a = str;
        this.f91227b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreyaShare)) {
            return false;
        }
        FreyaShare freyaShare = (FreyaShare) obj;
        return Intrinsics.areEqual(this.f91226a, freyaShare.f91226a) && Intrinsics.areEqual(this.f91227b, freyaShare.f91227b);
    }

    public final int hashCode() {
        return this.f91227b.hashCode() + (this.f91226a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FreyaShare(link=");
        sb.append(this.f91226a);
        sb.append(", token=");
        return C8770a.a(sb, this.f91227b, ")");
    }
}
