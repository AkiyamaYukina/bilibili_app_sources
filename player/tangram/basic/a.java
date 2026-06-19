package com.bilibili.player.tangram.basic;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/a.class */
@JvmInline
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79320a;

    public static boolean a(int i7, Object obj) {
        return (obj instanceof a) && i7 == ((a) obj).f79320a;
    }

    public static final boolean b(int i7, int i8) {
        return i7 == i8;
    }

    public static final boolean c(int i7) {
        boolean z6 = false;
        if (Intrinsics.compare(i7, 0) > 0) {
            z6 = false;
            if (Intrinsics.compare(i7, Integer.MAX_VALUE) < 0) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        return Intrinsics.compare(this.f79320a, aVar.f79320a);
    }

    public final boolean equals(Object obj) {
        return a(this.f79320a, obj);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f79320a);
    }

    @NotNull
    public final String toString() {
        return String.valueOf(this.f79320a);
    }
}
