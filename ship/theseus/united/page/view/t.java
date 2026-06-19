package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/t.class */
@StabilityInferred(parameters = 1)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f104125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f104126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Translation f104127c;

    public t(@NotNull o oVar, @NotNull h hVar, @Nullable Translation translation) {
        this.f104125a = oVar;
        this.f104126b = hVar;
        this.f104127c = translation;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f104125a, tVar.f104125a) && Intrinsics.areEqual(this.f104126b, tVar.f104126b) && Intrinsics.areEqual(this.f104127c, tVar.f104127c);
    }

    public final int hashCode() {
        int iHashCode = this.f104125a.hashCode();
        int iHashCode2 = this.f104126b.hashCode();
        Translation translation = this.f104127c;
        return ((iHashCode2 + (iHashCode * 31)) * 31) + (translation == null ? 0 : translation.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ViewBase(pageControl=" + this.f104125a + ", config=" + this.f104126b + ", translation=" + this.f104127c + ")";
    }
}
