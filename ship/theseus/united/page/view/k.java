package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/k.class */
@StabilityInferred(parameters = 1)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104097b;

    public k(@NotNull String str, @NotNull String str2) {
        this.f104096a = str;
        this.f104097b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f104096a, kVar.f104096a) && Intrinsics.areEqual(this.f104097b, kVar.f104097b);
    }

    public final int hashCode() {
        return this.f104097b.hashCode() + (this.f104096a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IconData(metaJson=");
        sb.append(this.f104096a);
        sb.append(", spritsImg=");
        return C8770a.a(sb, this.f104097b, ")");
    }
}
