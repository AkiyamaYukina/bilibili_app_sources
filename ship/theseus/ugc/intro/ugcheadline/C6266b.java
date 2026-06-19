package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/b.class */
@StabilityInferred(parameters = 0)
public final class C6266b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f97303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final d f97304b;

    public C6266b(@NotNull String str, @Nullable d dVar) {
        this.f97303a = str;
        this.f97304b = dVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6266b)) {
            return false;
        }
        C6266b c6266b = (C6266b) obj;
        return Intrinsics.areEqual(this.f97303a, c6266b.f97303a) && Intrinsics.areEqual(this.f97304b, c6266b.f97304b);
    }

    public final int hashCode() {
        int iHashCode = this.f97303a.hashCode();
        d dVar = this.f97304b;
        return (iHashCode * 31) + (dVar == null ? 0 : dVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "HeadlineData(content=" + this.f97303a + ", label=" + this.f97304b + ")";
    }
}
