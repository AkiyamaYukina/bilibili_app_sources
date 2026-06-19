package com.bilibili.pegasus.keywordblocker;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/n.class */
@StabilityInferred(parameters = 1)
public final class n implements com.bilibili.pegasus.kmm.keywordblocker.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f78240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f78241b;

    public /* synthetic */ n(String str) {
        this(str, Long.valueOf(System.currentTimeMillis()));
    }

    public n(@NotNull String str, @Nullable Long l7) {
        this.f78240a = str;
        this.f78241b = l7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f78240a, nVar.f78240a) && Intrinsics.areEqual(this.f78241b, nVar.f78241b);
    }

    @Override // com.bilibili.pegasus.kmm.keywordblocker.a
    @NotNull
    public final String getWord() {
        return this.f78240a;
    }

    public final int hashCode() {
        int iHashCode = this.f78240a.hashCode();
        Long l7 = this.f78241b;
        return (iHashCode * 31) + (l7 == null ? 0 : l7.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Keyword(word=" + this.f78240a + ", time=" + this.f78241b + ")";
    }
}
