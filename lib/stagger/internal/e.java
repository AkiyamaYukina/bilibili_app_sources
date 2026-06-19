package com.bilibili.lib.stagger.internal;

import Fa.T;
import I3.C2214e0;
import I3.C2218f0;
import I3.C2222g0;
import I3.C2226h0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f64506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f64507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f64508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Lazy f64509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f64510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static float f64511f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/e$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Long f64512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Float f64513b;

        public a() {
            this(0L, Float.valueOf(-1.0f));
        }

        public a(@Nullable Long l7, @Nullable Float f7) {
            this.f64512a = l7;
            this.f64513b = f7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f64512a, aVar.f64512a) && Intrinsics.areEqual(this.f64513b, aVar.f64513b);
        }

        public final int hashCode() {
            int iHashCode = 0;
            Long l7 = this.f64512a;
            int iHashCode2 = l7 == null ? 0 : l7.hashCode();
            Float f7 = this.f64513b;
            if (f7 != null) {
                iHashCode = f7.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "DelayDecision(delayTime=" + this.f64512a + ", probability=" + this.f64513b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/e$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f64514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Boolean f64515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Boolean f64516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Boolean f64517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Long f64518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Boolean f64519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Boolean f64520g;

        public b(@NotNull String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Long l7, @Nullable Boolean bool4, @Nullable Boolean bool5) {
            this.f64514a = str;
            this.f64515b = bool;
            this.f64516c = bool2;
            this.f64517d = bool3;
            this.f64518e = l7;
            this.f64519f = bool4;
            this.f64520g = bool5;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f64514a, bVar.f64514a) && Intrinsics.areEqual(this.f64515b, bVar.f64515b) && Intrinsics.areEqual(this.f64516c, bVar.f64516c) && Intrinsics.areEqual(this.f64517d, bVar.f64517d) && Intrinsics.areEqual(this.f64518e, bVar.f64518e) && Intrinsics.areEqual(this.f64519f, bVar.f64519f) && Intrinsics.areEqual(this.f64520g, bVar.f64520g);
        }

        public final int hashCode() {
            int iHashCode = this.f64514a.hashCode();
            int iHashCode2 = 0;
            Boolean bool = this.f64515b;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.f64516c;
            int iHashCode4 = bool2 == null ? 0 : bool2.hashCode();
            Boolean bool3 = this.f64517d;
            int iHashCode5 = bool3 == null ? 0 : bool3.hashCode();
            Long l7 = this.f64518e;
            int iHashCode6 = l7 == null ? 0 : l7.hashCode();
            Boolean bool4 = this.f64519f;
            int iHashCode7 = bool4 == null ? 0 : bool4.hashCode();
            Boolean bool5 = this.f64520g;
            if (bool5 != null) {
                iHashCode2 = bool5.hashCode();
            }
            return (((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteOption(type=");
            sb.append(this.f64514a);
            sb.append(", encrypted=");
            sb.append(this.f64515b);
            sb.append(", cleanable=");
            sb.append(this.f64516c);
            sb.append(", recoverable=");
            sb.append(this.f64517d);
            sb.append(", mobileByteThreshold=");
            sb.append(this.f64518e);
            sb.append(", lowDownloadOnly=");
            sb.append(this.f64519f);
            sb.append(", priorDownloadOnly=");
            return T.a(sb, this.f64520g, ")");
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        f64506a = LazyKt.lazy(lazyThreadSafetyMode, new C2214e0(6));
        f64507b = LazyKt.lazy(lazyThreadSafetyMode, new Gb1.b(8));
        f64508c = LazyKt.lazy(lazyThreadSafetyMode, new C2218f0(7));
        f64509d = LazyKt.lazy(lazyThreadSafetyMode, new C2222g0(7));
        f64510e = LazyKt.lazy(lazyThreadSafetyMode, new C2226h0(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mf0.InterfaceC7991f.e a() {
        /*
            mf0.f$b r0 = mf0.C7993h.f123762d
            r2 = r0
            r0 = r2
            if (r0 == 0) goto L13
            r0 = r2
            mf0.f$e r0 = r0.f123726e
            r3 = r0
            r0 = r3
            r2 = r0
            r0 = r3
            if (r0 != 0) goto L17
        L13:
            mf0.f$e$a$a r0 = mf0.InterfaceC7991f.e.a.f123755a
            r2 = r0
        L17:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.stagger.internal.e.a():mf0.f$e");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static mf0.InterfaceC7991f.a b() {
        /*
            mf0.f$b r0 = mf0.C7993h.f123762d
            r2 = r0
            r0 = r2
            if (r0 == 0) goto L13
            r0 = r2
            mf0.f$a r0 = r0.f123722a
            r3 = r0
            r0 = r3
            r2 = r0
            r0 = r3
            if (r0 != 0) goto L17
        L13:
            mf0.f$a$a$a r0 = mf0.InterfaceC7991f.a.C1324a.f123721a
            r2 = r0
        L17:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.stagger.internal.e.b():mf0.f$a");
    }

    public static float c() {
        float f7;
        try {
            String strDd = a().dd("dd_staggermaneger_update_manifest", "");
            f7 = 0.0f;
            if (strDd != null) {
                f7 = Float.parseFloat(strDd);
            }
        } catch (Exception e7) {
            f7 = 0.0f;
        }
        return f7;
    }
}
