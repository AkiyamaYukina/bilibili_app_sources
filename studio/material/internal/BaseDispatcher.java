package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.i;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.ActorKt;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/BaseDispatcher.class */
public abstract class BaseDispatcher implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f108528a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f108530c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicLong f108529b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f108531d = new i(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SendChannel<? super d> f108532e = ActorKt.actor$default(GlobalScope.INSTANCE, gA0.a.c, 0, (CoroutineStart) null, (Function1) null, new BaseDispatcher$actor$1(this, null), 14, (Object) null);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(com.bilibili.studio.material.internal.BaseDispatcher r5, kotlin.coroutines.Continuation<? super com.bilibili.studio.material.i> r6) {
        /*
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.studio.material.internal.BaseDispatcher$queryProgress$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.studio.material.internal.BaseDispatcher$queryProgress$1 r0 = (com.bilibili.studio.material.internal.BaseDispatcher$queryProgress$1) r0
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
            com.bilibili.studio.material.internal.BaseDispatcher$queryProgress$1 r0 = new com.bilibili.studio.material.internal.BaseDispatcher$queryProgress$1
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
            if (r0 == 0) goto L6e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5f
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L55
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r5 = r0
            goto Lc2
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5f:
            r0 = r6
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r0 = (kotlinx.coroutines.CompletableDeferred) r0
            r5 = r0
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            goto La5
        L6e:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = 0
            r1 = 1
            r2 = 0
            kotlinx.coroutines.CompletableDeferred r0 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r0, r1, r2)
            r8 = r0
            com.bilibili.studio.material.internal.d r0 = new com.bilibili.studio.material.internal.d
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r10 = r0
            r0 = r5
            kotlinx.coroutines.channels.SendChannel<? super com.bilibili.studio.material.internal.d> r0 = r0.f108532e
            r5 = r0
            r0 = r6
            r1 = r8
            r0.L$0 = r1
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r10
            r2 = r6
            java.lang.Object r0 = r0.send(r1, r2)
            r1 = r9
            if (r0 != r1) goto La3
            r0 = r9
            return r0
        La3:
            r0 = r8
            r5 = r0
        La5:
            r0 = r6
            r1 = 0
            r0.L$0 = r1
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.await(r1)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            r1 = r9
            if (r0 != r1) goto Lc2
            r0 = r9
            return r0
        Lc2:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.BaseDispatcher.d(com.bilibili.studio.material.internal.BaseDispatcher, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.studio.material.internal.b
    public final void b() {
        this.f108529b.set(0L);
        this.f108528a = 0L;
        this.f108530c = 0.0f;
    }

    @Override // com.bilibili.studio.material.internal.b
    @Nullable
    public final Object c(@NotNull Continuation<? super i> continuation) {
        return d(this, continuation);
    }
}
