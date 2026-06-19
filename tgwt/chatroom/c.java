package com.bilibili.tgwt.chatroom;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f110972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f110974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f110975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f110976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f110977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f110978g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f110979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f110980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f110981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f110982l;

    public /* synthetic */ c(long j7, int i7, long j8, int i8, String str, int i9, String str2, String str3, String str4, int i10) {
        this(j7, i7, j8, "", false, i8, (i10 & 64) != 0 ? "" : str, (i10 & 128) != 0 ? 0 : i9, (i10 & 256) != 0 ? "" : str2, (i10 & 512) != 0 ? "" : str3, (i10 & 1024) != 0 ? "" : str4, 0);
    }

    public c(long j7, int i7, long j8, @NotNull String str, boolean z6, int i8, @NotNull String str2, int i9, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i10) {
        this.f110972a = j7;
        this.f110973b = i7;
        this.f110974c = j8;
        this.f110975d = str;
        this.f110976e = z6;
        this.f110977f = i8;
        this.f110978g = str2;
        this.h = i9;
        this.f110979i = str3;
        this.f110980j = str4;
        this.f110981k = str5;
        this.f110982l = i10;
    }

    public static c a(c cVar, long j7, int i7, long j8, String str, boolean z6, String str2, int i8, String str3, String str4, String str5, int i9, int i10) {
        if ((i10 & 1) != 0) {
            j7 = cVar.f110972a;
        }
        if ((i10 & 2) != 0) {
            i7 = cVar.f110973b;
        }
        if ((i10 & 4) != 0) {
            j8 = cVar.f110974c;
        }
        if ((i10 & 8) != 0) {
            str = cVar.f110975d;
        }
        if ((i10 & 16) != 0) {
            z6 = cVar.f110976e;
        }
        int i11 = cVar.f110977f;
        if ((i10 & 64) != 0) {
            str2 = cVar.f110978g;
        }
        if ((i10 & 128) != 0) {
            i8 = cVar.h;
        }
        if ((i10 & 256) != 0) {
            str3 = cVar.f110979i;
        }
        if ((i10 & 512) != 0) {
            str4 = cVar.f110980j;
        }
        if ((i10 & 1024) != 0) {
            str5 = cVar.f110981k;
        }
        if ((i10 & 2048) != 0) {
            i9 = cVar.f110982l;
        }
        cVar.getClass();
        return new c(j7, i7, j8, str, z6, i11, str2, i8, str3, str4, str5, i9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f110972a == cVar.f110972a && this.f110973b == cVar.f110973b && this.f110974c == cVar.f110974c && Intrinsics.areEqual(this.f110975d, cVar.f110975d) && this.f110976e == cVar.f110976e && this.f110977f == cVar.f110977f && Intrinsics.areEqual(this.f110978g, cVar.f110978g) && this.h == cVar.h && Intrinsics.areEqual(this.f110979i, cVar.f110979i) && Intrinsics.areEqual(this.f110980j, cVar.f110980j) && Intrinsics.areEqual(this.f110981k, cVar.f110981k) && this.f110982l == cVar.f110982l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110982l) + E.a(E.a(E.a(I.a(this.h, E.a(I.a(this.f110977f, z.a(E.a(C3554n0.a(I.a(this.f110973b, Long.hashCode(this.f110972a) * 31, 31), 31, this.f110974c), 31, this.f110975d), 31, this.f110976e), 31), 31, this.f110978g), 31), 31, this.f110979i), 31, this.f110980j), 31, this.f110981k);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatRoomSetting(id=");
        sb.append(this.f110972a);
        sb.append(", isOpen=");
        sb.append(this.f110973b);
        sb.append(", ownerId=");
        sb.append(this.f110974c);
        sb.append(", operationMsg=");
        sb.append(this.f110975d);
        sb.append(", isRoomFinish=");
        sb.append(this.f110976e);
        sb.append(", limitCount=");
        sb.append(this.f110977f);
        sb.append(", title=");
        sb.append(this.f110978g);
        sb.append(", memberCount=");
        sb.append(this.h);
        sb.append(", memberCountDesc=");
        sb.append(this.f110979i);
        sb.append(", fullMcDesc=");
        sb.append(this.f110980j);
        sb.append(", halfMcDesc=");
        sb.append(this.f110981k);
        sb.append(", reason=");
        return C4277b.a(this.f110982l, ")", sb);
    }
}
