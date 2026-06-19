package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f74036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Throwable f74037b;

    public a() {
        this(false, 3);
    }

    public a(@Nullable Throwable th, boolean z6) {
        this.f74036a = z6;
        this.f74037b = th;
    }

    public /* synthetic */ a(boolean z6, int i7) {
        this((Throwable) null, (i7 & 1) != 0 ? false : z6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f74036a == aVar.f74036a && Intrinsics.areEqual(this.f74037b, aVar.f74037b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f74036a);
        Throwable th = this.f74037b;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ChapterIsConsumeState(isConsume=" + this.f74036a + ", throwable=" + this.f74037b + ")";
    }
}
