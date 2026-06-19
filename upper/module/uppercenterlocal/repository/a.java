package com.bilibili.upper.module.uppercenterlocal.repository;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.common.hilowebview.http.j;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public byte[] f114254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f114255b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Deferred<C1236a> f114257d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bilibili.upper.module.uppercenterlocal.b f114259f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mutex f114256c = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114258e = true;

    /* JADX INFO: renamed from: com.bilibili.upper.module.uppercenterlocal.repository.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/a$a.class */
    public static final class C1236a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final byte[] f114260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final b f114261b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final j.a f114262c;

        public C1236a(@Nullable byte[] bArr, @Nullable b bVar, @Nullable j.a aVar) {
            this.f114260a = bArr;
            this.f114261b = bVar;
            this.f114262c = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1236a)) {
                return false;
            }
            C1236a c1236a = (C1236a) obj;
            return Intrinsics.areEqual(this.f114260a, c1236a.f114260a) && Intrinsics.areEqual(this.f114261b, c1236a.f114261b) && Intrinsics.areEqual(this.f114262c, c1236a.f114262c);
        }

        public final int hashCode() {
            int iHashCode = 0;
            byte[] bArr = this.f114260a;
            int iHashCode2 = bArr == null ? 0 : Arrays.hashCode(bArr);
            b bVar = this.f114261b;
            int iHashCode3 = bVar == null ? 0 : bVar.hashCode();
            j.a aVar = this.f114262c;
            if (aVar != null) {
                iHashCode = aVar.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "FetchResult(bytes=" + Arrays.toString(this.f114260a) + ", meta=" + this.f114261b + ", failed=" + this.f114262c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/a$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f114264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, String> f114265c;

        public b(int i7, @NotNull String str, @NotNull Map<String, String> map) {
            this.f114263a = i7;
            this.f114264b = str;
            this.f114265c = map;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f114263a == bVar.f114263a && Intrinsics.areEqual(this.f114264b, bVar.f114264b) && Intrinsics.areEqual(this.f114265c, bVar.f114265c);
        }

        public final int hashCode() {
            return this.f114265c.hashCode() + E.a(Integer.hashCode(this.f114263a) * 31, 31, this.f114264b);
        }

        @NotNull
        public final String toString() {
            Map<String, String> map = this.f114265c;
            StringBuilder sb = new StringBuilder("ResponseMeta(code=");
            sb.append(this.f114263a);
            sb.append(", message=");
            return C4665g.a(sb, this.f114264b, ", headers=", map, ")");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.upper.module.uppercenterlocal.repository.UpperCenterMainDataRepository$disableCache$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.upper.module.uppercenterlocal.repository.UpperCenterMainDataRepository$disableCache$1 r0 = (com.bilibili.upper.module.uppercenterlocal.repository.UpperCenterMainDataRepository$disableCache$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.upper.module.uppercenterlocal.repository.UpperCenterMainDataRepository$disableCache$1 r0 = new com.bilibili.upper.module.uppercenterlocal.repository.UpperCenterMainDataRepository$disableCache$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L60
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L56
            r0 = r6
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            r6 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto L85
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            kotlinx.coroutines.sync.Mutex r0 = r0.f114256c
            r8 = r0
            r0 = r6
            r1 = r8
            r0.L$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = 0
            r2 = r6
            java.lang.Object r0 = r0.lock(r1, r2)
            r1 = r9
            if (r0 != r1) goto L83
            r0 = r9
            return r0
        L83:
            r0 = r8
            r6 = r0
        L85:
            r0 = r5
            r1 = 0
            r0.f114258e = r1     // Catch: java.lang.Throwable -> Laa
            r0 = r5
            r1 = 0
            r0.f114254a = r1     // Catch: java.lang.Throwable -> Laa
            r0 = r5
            r1 = 0
            r0.f114255b = r1     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "MainDataRepository"
            java.lang.String r1 = "disable cache"
            tv.danmaku.android.log.BLog.i(r0, r1)     // Catch: java.lang.Throwable -> Laa
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Laa
            r8 = r0
            r0 = r6
            r1 = 0
            r0.unlock(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Laa:
            r8 = move-exception
            r0 = r6
            r1 = 0
            r0.unlock(r1)
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.repository.a.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.repository.a.b(kotlinx.coroutines.CoroutineScope, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
