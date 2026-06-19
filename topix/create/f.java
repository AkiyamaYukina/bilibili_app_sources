package com.bilibili.topix.create;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f112596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f112597b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f112598c;

    public f(String str, String str2) {
        this.f112596a = str;
        this.f112598c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f112596a, fVar.f112596a) && Intrinsics.areEqual(this.f112597b, fVar.f112597b) && Intrinsics.areEqual(this.f112598c, fVar.f112598c);
    }

    public final int hashCode() {
        return this.f112598c.hashCode() + E.a(this.f112596a.hashCode() * 31, 31, this.f112597b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateTopicInput(name=");
        sb.append(this.f112596a);
        sb.append(", desc=");
        sb.append(this.f112597b);
        sb.append(", scene=");
        return C8770a.a(sb, this.f112598c, ")");
    }
}
