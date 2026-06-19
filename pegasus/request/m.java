package com.bilibili.pegasus.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.pegasus.data.base.PegasusResponse;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/m.class */
@StabilityInferred(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static f f78838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static Deferred<Resource<PegasusResponse>> f78839c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f78837a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Mutex f78840d = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final CoroutineScope f78841e = com.bilibili.adcommon.utils.ext.c.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

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
            boolean r0 = r0 instanceof com.bilibili.pegasus.request.TMPCache$clear$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.pegasus.request.TMPCache$clear$1 r0 = (com.bilibili.pegasus.request.TMPCache$clear$1) r0
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
            com.bilibili.pegasus.request.TMPCache$clear$1 r0 = new com.bilibili.pegasus.request.TMPCache$clear$1
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
            goto L84
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L60:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.sync.Mutex r0 = com.bilibili.pegasus.request.m.f78840d
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
            if (r0 != r1) goto L82
            r0 = r9
            return r0
        L82:
            r0 = r8
            r6 = r0
        L84:
            r0 = 0
            com.bilibili.pegasus.request.m.f78838b = r0     // Catch: java.lang.Throwable -> L9b
            r0 = 0
            com.bilibili.pegasus.request.m.f78839c = r0     // Catch: java.lang.Throwable -> L9b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9b
            r8 = r0
            r0 = r6
            r1 = 0
            r0.unlock(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9b:
            r8 = move-exception
            r0 = r6
            r1 = 0
            r0.unlock(r1)
            r0 = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.m.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.pegasus.request.f r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.request.m.b(com.bilibili.pegasus.request.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
