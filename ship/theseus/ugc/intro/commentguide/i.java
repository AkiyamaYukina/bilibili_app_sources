package com.bilibili.ship.theseus.ugc.intro.commentguide;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/i.class */
@StabilityInferred(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97007b;

    public i(@NotNull String str, @NotNull String str2) {
        this.f97006a = str;
        this.f97007b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f97006a, iVar.f97006a) && Intrinsics.areEqual(this.f97007b, iVar.f97007b);
    }

    public final int hashCode() {
        return this.f97007b.hashCode() + (this.f97006a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LikeComment(reply=");
        sb.append(this.f97006a);
        sb.append(", title=");
        return C8770a.a(sb, this.f97007b, ")");
    }
}
