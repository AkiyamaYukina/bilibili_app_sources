package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.compose.animation.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/f.class */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f74063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Throwable f74064c;

    public f() {
        this(false, (Throwable) null, 7);
    }

    public f(int i7, boolean z6, @Nullable Throwable th) {
        this.f74062a = i7;
        this.f74063b = z6;
        this.f74064c = th;
    }

    public /* synthetic */ f(boolean z6, Throwable th, int i7) {
        this(-2, (i7 & 2) != 0 ? false : z6, (i7 & 4) != 0 ? null : th);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f74062a == fVar.f74062a && this.f74063b == fVar.f74063b && Intrinsics.areEqual(this.f74064c, fVar.f74064c);
    }

    public final int hashCode() {
        int iA = z.a(Integer.hashCode(this.f74062a) * 31, 31, this.f74063b);
        Throwable th = this.f74064c;
        return iA + (th == null ? 0 : th.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RotationTrainingState(consumeCode=" + this.f74062a + ", isRotationSuccess=" + this.f74063b + ", error=" + this.f74064c + ")";
    }
}
