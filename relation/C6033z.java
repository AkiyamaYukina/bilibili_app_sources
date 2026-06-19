package com.bilibili.relation;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.relation.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/z.class */
@StabilityInferred(parameters = 1)
public final class C6033z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f86242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function2<List<String>, List<String>, Unit> f86243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f86244c;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public C6033z() {
        this(new Fe1.d(10), new Object(), new Fe1.f(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6033z(@NotNull Function0<Unit> function0, @NotNull Function2<? super List<String>, ? super List<String>, Unit> function2, @NotNull Function0<Unit> function02) {
        this.f86242a = function0;
        this.f86243b = function2;
        this.f86244c = function02;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6033z)) {
            return false;
        }
        C6033z c6033z = (C6033z) obj;
        return Intrinsics.areEqual(this.f86242a, c6033z.f86242a) && Intrinsics.areEqual(this.f86243b, c6033z.f86243b) && Intrinsics.areEqual(this.f86244c, c6033z.f86244c);
    }

    public final int hashCode() {
        int iHashCode = this.f86242a.hashCode();
        return this.f86244c.hashCode() + ((this.f86243b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowDialogCallbacks(cancelAttentionSuccess=");
        sb.append(this.f86242a);
        sb.append(", setGroupSuccess=");
        sb.append(this.f86243b);
        sb.append(", onDismiss=");
        return Y0.c.a(sb, this.f86244c, ")");
    }
}
