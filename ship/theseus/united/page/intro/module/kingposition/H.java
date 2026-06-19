package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/H.class */
@StabilityInferred(parameters = 1)
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final O f100222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f100223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final K f100224c;

    public H(@NotNull O o7, @NotNull String str, @NotNull K k7) {
        this.f100222a = o7;
        this.f100223b = str;
        this.f100224c = k7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        return Intrinsics.areEqual(this.f100222a, h.f100222a) && Intrinsics.areEqual(this.f100223b, h.f100223b) && Intrinsics.areEqual(this.f100224c, h.f100224c);
    }

    public final int hashCode() {
        return this.f100224c.hashCode() + I.E.a(this.f100222a.hashCode() * 31, 31, this.f100223b);
    }

    @NotNull
    public final String toString() {
        return "LikeExtend(tripleLike=" + this.f100222a + ", likeAnimation=" + this.f100223b + ", playerAnimation=" + this.f100224c + ")";
    }
}
