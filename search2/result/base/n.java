package com.bilibili.search2.result.base;

import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/n.class */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f87563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f87565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f87566e;

    public /* synthetic */ n(int i7, Object obj) {
        this(i7, false, false, 1, obj);
    }

    public n(int i7, boolean z6, boolean z7, int i8, @Nullable Object obj) {
        this.f87562a = i7;
        this.f87563b = obj;
        this.f87564c = i8;
        this.f87565d = z6;
        this.f87566e = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f87562a == nVar.f87562a && Intrinsics.areEqual(this.f87563b, nVar.f87563b) && this.f87564c == nVar.f87564c && this.f87565d == nVar.f87565d && this.f87566e == nVar.f87566e;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f87562a);
        Object obj = this.f87563b;
        return Boolean.hashCode(this.f87566e) + z.a(I.a(this.f87564c, ((iHashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31, this.f87565d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyChangeParams(position=");
        sb.append(this.f87562a);
        sb.append(", payloads=");
        sb.append(this.f87563b);
        sb.append(", range=");
        sb.append(this.f87564c);
        sb.append(", needAnim=");
        sb.append(this.f87565d);
        sb.append(", removePositionAndInsert=");
        return androidx.appcompat.app.i.a(sb, this.f87566e, ")");
    }
}
