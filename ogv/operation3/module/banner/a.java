package com.bilibili.ogv.operation3.module.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.operation3.module.banner.b;
import it0.C7615a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b.C0442b f71117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7615a f71118b;

    public a(@NotNull b.C0442b c0442b, @NotNull C7615a c7615a) {
        this.f71117a = c0442b;
        this.f71118b = c7615a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f71117a, aVar.f71117a) && Intrinsics.areEqual(this.f71118b, aVar.f71118b);
    }

    public final int hashCode() {
        return this.f71118b.hashCode() + (this.f71117a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BannerModel(content=" + this.f71117a + ", operableModel=" + this.f71118b + ")";
    }
}
