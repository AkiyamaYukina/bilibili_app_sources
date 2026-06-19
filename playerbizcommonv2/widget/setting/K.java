package com.bilibili.playerbizcommonv2.widget.setting;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/K.class */
@Stable
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableState f83097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f83098c;

    public K(long j7, @NotNull MutableState mutableState, @NotNull Function0 function0) {
        this.f83096a = j7;
        this.f83097b = mutableState;
        this.f83098c = function0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k7 = (K) obj;
        return this.f83096a == k7.f83096a && Intrinsics.areEqual(this.f83097b, k7.f83097b) && Intrinsics.areEqual(this.f83098c, k7.f83098c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f83096a);
        return this.f83098c.hashCode() + ((this.f83097b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerSettingSelectItem(id=");
        sb.append(this.f83096a);
        sb.append(", text=");
        sb.append(this.f83097b);
        sb.append(", onClick=");
        return Y0.c.a(sb, this.f83098c, ")");
    }
}
