package com.bilibili.lib.stagger.internal;

import I.E;
import K7.M;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.ui.graphics.e0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mf0.InterfaceC7991f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/a.class */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f64482d = new a(CollectionsKt.emptyList(), new InterfaceC7991f.d(0), "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<b> f64483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7991f.d f64484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f64485c;

    /* JADX INFO: renamed from: com.bilibili.lib.stagger.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/a$a.class */
    public static final class C0359a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f64486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f64488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f64489d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f64490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f64491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f64492g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f64493i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f64494j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f64495k;

        public C0359a(int i7, int i8, long j7, long j8, long j9, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6) {
            this.f64486a = str;
            this.f64487b = i7;
            this.f64488c = str2;
            this.f64489d = str3;
            this.f64490e = str4;
            this.f64491f = str5;
            this.f64492g = j7;
            this.h = i8;
            this.f64493i = j8;
            this.f64494j = j9;
            this.f64495k = str6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0359a)) {
                return false;
            }
            C0359a c0359a = (C0359a) obj;
            return Intrinsics.areEqual(this.f64486a, c0359a.f64486a) && this.f64487b == c0359a.f64487b && Intrinsics.areEqual(this.f64488c, c0359a.f64488c) && Intrinsics.areEqual(this.f64489d, c0359a.f64489d) && Intrinsics.areEqual(this.f64490e, c0359a.f64490e) && Intrinsics.areEqual(this.f64491f, c0359a.f64491f) && this.f64492g == c0359a.f64492g && this.h == c0359a.h && this.f64493i == c0359a.f64493i && this.f64494j == c0359a.f64494j && Intrinsics.areEqual(this.f64495k, c0359a.f64495k);
        }

        public final int hashCode() {
            int iA = C3554n0.a(C3554n0.a(I.a(this.h, C3554n0.a(E.a(E.a(E.a(E.a(I.a(this.f64487b, this.f64486a.hashCode() * 31, 31), 31, this.f64488c), 31, this.f64489d), 31, this.f64490e), 31, this.f64491f), 31, this.f64492g), 31), 31, this.f64493i), 31, this.f64494j);
            String str = this.f64495k;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(id=");
            sb.append(this.f64486a);
            sb.append(", priority=");
            sb.append(this.f64487b);
            sb.append(", fileName=");
            sb.append(this.f64488c);
            sb.append(", type=");
            sb.append(this.f64489d);
            sb.append(", url=");
            sb.append(this.f64490e);
            sb.append(", hash=");
            sb.append(this.f64491f);
            sb.append(", size=");
            sb.append(this.f64492g);
            sb.append(", dw=");
            sb.append(this.h);
            sb.append(", effectTime=");
            sb.append(this.f64493i);
            sb.append(", expireTime=");
            sb.append(this.f64494j);
            sb.append(", extra=");
            return C8770a.a(sb, this.f64495k, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/a$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f64496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<C0359a> f64497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f64498c;

        public b(@NotNull String str, @NotNull List<C0359a> list, @Nullable String str2) {
            this.f64496a = str;
            this.f64497b = list;
            this.f64498c = str2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f64496a, bVar.f64496a) && Intrinsics.areEqual(this.f64497b, bVar.f64497b) && Intrinsics.areEqual(this.f64498c, bVar.f64498c);
        }

        public final int hashCode() {
            int iA = e0.a(this.f64496a.hashCode() * 31, 31, this.f64497b);
            String str = this.f64498c;
            return iA + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            List<C0359a> list = this.f64497b;
            StringBuilder sb = new StringBuilder("Res(type=");
            M6.f.a(this.f64496a, ", list=", ", extra_value=", sb, list);
            return C8770a.a(sb, this.f64498c, ")");
        }
    }

    public a(@NotNull List<b> list, @NotNull InterfaceC7991f.d dVar, @NotNull String str) {
        this.f64483a = list;
        this.f64484b = dVar;
        this.f64485c = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f64483a, aVar.f64483a) && Intrinsics.areEqual(this.f64484b, aVar.f64484b) && Intrinsics.areEqual(this.f64485c, aVar.f64485c);
    }

    public final int hashCode() {
        int iHashCode = this.f64483a.hashCode();
        return this.f64485c.hashCode() + ((this.f64484b.hashCode() + (iHashCode * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("Manifest(resources=", ", dwTime=", this.f64483a);
        sbA.append(this.f64484b);
        sbA.append(", ver=");
        return C8770a.a(sbA, this.f64485c, ")");
    }
}
