package com.bilibili.studio.videoeditor;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/t.class */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Set<s> f109901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Set<s> f109902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Set<s> f109903c;

    public t() {
        this(0);
    }

    public /* synthetic */ t(int i7) {
        this(SetsKt.emptySet(), SetsKt.emptySet(), SetsKt.emptySet());
    }

    public t(@NotNull Set<s> set, @NotNull Set<s> set2, @NotNull Set<s> set3) {
        this.f109901a = set;
        this.f109902b = set2;
        this.f109903c = set3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f109901a, tVar.f109901a) && Intrinsics.areEqual(this.f109902b, tVar.f109902b) && Intrinsics.areEqual(this.f109903c, tVar.f109903c);
    }

    public final int hashCode() {
        return this.f109903c.hashCode() + Pj.n.a(this.f109902b, this.f109901a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "ModLoadState(loading=" + this.f109901a + ", success=" + this.f109902b + ", failed=" + this.f109903c + ")";
    }
}
