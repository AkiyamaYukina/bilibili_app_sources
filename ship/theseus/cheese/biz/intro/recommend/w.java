package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.framework.exposure.core.ExposureEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/w.class */
@StabilityInferred(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t f90013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExposureEntry f90014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<s, Unit> f90015c;

    /* JADX WARN: Multi-variable type inference failed */
    public w(@NotNull t tVar, @NotNull ExposureEntry exposureEntry, @NotNull Function1<? super s, Unit> function1) {
        this.f90013a = tVar;
        this.f90014b = exposureEntry;
        this.f90015c = function1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.areEqual(this.f90013a, wVar.f90013a) && Intrinsics.areEqual(this.f90014b, wVar.f90014b) && Intrinsics.areEqual(this.f90015c, wVar.f90015c);
    }

    public final int hashCode() {
        int iHashCode = this.f90013a.hashCode();
        return this.f90015c.hashCode() + ((this.f90014b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ViewState(data=" + this.f90013a + ", entry=" + this.f90014b + ", intent=" + this.f90015c + ")";
    }
}
