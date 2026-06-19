package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/e.class */
@StabilityInferred(parameters = 1)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SearchContainerType f86807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final f f86808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f86809c;

    public e() {
        this(0);
    }

    public /* synthetic */ e(int i7) {
        this(SearchContainerType.FULLSCREEN_ACTIVITY, null, new d(0, false));
    }

    public e(@NotNull SearchContainerType searchContainerType, @Nullable f fVar, @NotNull d dVar) {
        this.f86807a = searchContainerType;
        this.f86808b = fVar;
        this.f86809c = dVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f86807a == eVar.f86807a && Intrinsics.areEqual(this.f86808b, eVar.f86808b) && Intrinsics.areEqual(this.f86809c, eVar.f86809c);
    }

    public final int hashCode() {
        int iHashCode = this.f86807a.hashCode();
        f fVar = this.f86808b;
        return this.f86809c.hashCode() + (((iHashCode * 31) + (fVar == null ? 0 : fVar.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "SearchContainerRuntimeState(type=" + this.f86807a + ", floatingViewport=" + this.f86808b + ", appearance=" + this.f86809c + ")";
    }
}
