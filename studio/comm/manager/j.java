package com.bilibili.studio.comm.manager;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/j.class */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f105404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f105405b;

    public j(@NotNull String str, @NotNull String str2) {
        this.f105404a = str;
        this.f105405b = str2;
    }

    public final boolean a() {
        return this.f105404a.length() > 0 && this.f105405b.length() > 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f105404a, jVar.f105404a) && Intrinsics.areEqual(this.f105405b, jVar.f105405b);
    }

    public final int hashCode() {
        return this.f105405b.hashCode() + (this.f105404a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageRecModDir(soDir=");
        sb.append(this.f105404a);
        sb.append(", modelDir=");
        return C8770a.a(sb, this.f105405b, ")");
    }
}
