package com.bilibili.lib.stagger.internal;

import I.E;
import I3.C2230i0;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import com.bilibili.lib.stagger.CDNType;
import com.bilibili.lib.stagger.KeyType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/g.class */
public interface g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f64528a = a.f64529a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/g$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64529a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Lazy<g> f64530b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new C2230i0(6));
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/g$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f64531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final CDNType f64534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f64535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f64536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f64537g;

        @NotNull
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f64538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f64539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f64540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f64541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f64542m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final String f64543n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f64544o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Nullable
        public final String f64545p;

        public b(boolean z6, int i7, long j7, @NotNull CDNType cDNType, @NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, long j8, long j9, long j10, int i8, @Nullable String str6, int i9, @Nullable String str7) {
            this.f64531a = z6;
            this.f64532b = i7;
            this.f64533c = j7;
            this.f64534d = cDNType;
            this.f64535e = str;
            this.f64536f = str2;
            this.f64537g = str3;
            this.h = str4;
            this.f64538i = str5;
            this.f64539j = j8;
            this.f64540k = j9;
            this.f64541l = j10;
            this.f64542m = i8;
            this.f64543n = str6;
            this.f64544o = i9;
            this.f64545p = str7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f64531a == bVar.f64531a && this.f64532b == bVar.f64532b && this.f64533c == bVar.f64533c && this.f64534d == bVar.f64534d && Intrinsics.areEqual(this.f64535e, bVar.f64535e) && Intrinsics.areEqual(this.f64536f, bVar.f64536f) && Intrinsics.areEqual(this.f64537g, bVar.f64537g) && Intrinsics.areEqual(this.h, bVar.h) && Intrinsics.areEqual(this.f64538i, bVar.f64538i) && this.f64539j == bVar.f64539j && this.f64540k == bVar.f64540k && this.f64541l == bVar.f64541l && this.f64542m == bVar.f64542m && Intrinsics.areEqual(this.f64543n, bVar.f64543n) && this.f64544o == bVar.f64544o && Intrinsics.areEqual(this.f64545p, bVar.f64545p);
        }

        public final int hashCode() {
            int iA = E.a(E.a((this.f64534d.hashCode() + C3554n0.a(I.a(this.f64532b, Boolean.hashCode(this.f64531a) * 31, 31), 31, this.f64533c)) * 31, 31, this.f64535e), 31, this.f64536f);
            String str = this.f64537g;
            int iA2 = E.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
            String str2 = this.f64538i;
            int iA3 = I.a(this.f64542m, C3554n0.a(C3554n0.a(C3554n0.a((iA2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f64539j), 31, this.f64540k), 31, this.f64541l), 31);
            String str3 = this.f64543n;
            int iA4 = I.a(this.f64544o, (iA3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
            String str4 = this.f64545p;
            return iA4 + (str4 == null ? 0 : str4.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(success=");
            sb.append(this.f64531a);
            sb.append(", period=");
            sb.append(this.f64532b);
            sb.append(", length=");
            sb.append(this.f64533c);
            sb.append(", cdn=");
            sb.append(this.f64534d);
            sb.append(", tag=");
            sb.append(this.f64535e);
            sb.append(", url=");
            sb.append(this.f64536f);
            sb.append(", path=");
            sb.append(this.f64537g);
            sb.append(", taskId=");
            sb.append(this.h);
            sb.append(", hash=");
            sb.append(this.f64538i);
            sb.append(", startTime=");
            sb.append(this.f64539j);
            sb.append(", effectTime=");
            sb.append(this.f64540k);
            sb.append(", expireTime=");
            sb.append(this.f64541l);
            sb.append(", code=");
            sb.append(this.f64542m);
            sb.append(", msg=");
            sb.append(this.f64543n);
            sb.append(", innerCode=");
            sb.append(this.f64544o);
            sb.append(", innerMsg=");
            return C8770a.a(sb, this.f64545p, ")");
        }
    }

    default void d(@NotNull b bVar) {
        a("reportResult result = " + bVar, null);
    }

    @Override // com.bilibili.lib.stagger.internal.d
    @NotNull
    default String getLogTag() {
        return "Reporter";
    }

    default void i(@NotNull String str, @NotNull KeyType keyType, boolean z6) {
        a("reportHit key = " + str + ", keyType = " + keyType + ", hit = " + z6, null);
    }
}
