package com.bilibili.studio.material.internal.download;

import J3.C2358l1;
import J3.C2361m1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/f.class */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy<f> f108556b = LazyKt.lazy(new C2358l1(8));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f108557a = LazyKt.lazy(new C2361m1(9));

    public final Object a(DownloadRequest downloadRequest, Function3 function3, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new d(this, ((c) this.f108557a.getValue()).a(downloadRequest, new e(function3, cancellableContinuationImpl))));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.bilibili.studio.material.internal.download.DownloadRequest$a, java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull com.bilibili.studio.material.Request r17, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3 r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.download.f.b(com.bilibili.studio.material.Request, kotlin.jvm.functions.Function3, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
