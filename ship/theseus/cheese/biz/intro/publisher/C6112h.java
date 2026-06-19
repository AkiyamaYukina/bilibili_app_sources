package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import By0.H0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/h.class */
@StabilityInferred(parameters = 0)
public final class C6112h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final E f89862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f89863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q f89864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final H0 f89865d;

    public C6112h(@NotNull E e7, @NotNull StateFlow stateFlow, @NotNull q qVar, @NotNull H0 h02) {
        this.f89862a = e7;
        this.f89863b = stateFlow;
        this.f89864c = qVar;
        this.f89865d = h02;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6112h)) {
            return false;
        }
        C6112h c6112h = (C6112h) obj;
        return Intrinsics.areEqual(this.f89862a, c6112h.f89862a) && Intrinsics.areEqual(this.f89863b, c6112h.f89863b) && Intrinsics.areEqual(this.f89864c, c6112h.f89864c) && Intrinsics.areEqual(this.f89865d, c6112h.f89865d);
    }

    public final int hashCode() {
        int iA = androidx.core.content.b.a(this.f89863b, this.f89862a.hashCode() * 31, 31);
        return this.f89865d.hashCode() + ((hashCode() + iA) * 31);
    }

    @NotNull
    public final String toString() {
        return "CheesePriceWeakenPublisherState(data=" + this.f89862a + ", horizontalPaddingFlow=" + this.f89863b + ", onClickCourse=" + this.f89864c + ", onExposureCourse=" + this.f89865d + ")";
    }
}
