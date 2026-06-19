package com.bilibili.ship.theseus.united.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f104858a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104859b = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.utils.SuspendingOr$keepActive$1
            if (r0 == 0) goto L29
            r0 = r6
            com.bilibili.ship.theseus.united.utils.SuspendingOr$keepActive$1 r0 = (com.bilibili.ship.theseus.united.utils.SuspendingOr$keepActive$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r6 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.utils.SuspendingOr$keepActive$1 r0 = new com.bilibili.ship.theseus.united.utils.SuspendingOr$keepActive$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L33:
            r0 = r6
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r0.f104859b
            r9 = r0
            r0 = 1
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L6a
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L66
            goto L93
        L66:
            r6 = move-exception
            goto L9d
        L6a:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f104858a
            int r0 = r0.incrementAndGet()
            r0 = r9
            r1 = 1
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.setValue(r1)
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L66
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L66
            r1 = r10
            if (r0 != r1) goto L93
            r0 = r10
            return r0
        L93:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L66
            r6 = r0
            r0 = r6
            r0.<init>()     // Catch: java.lang.Throwable -> L66
            r0 = r6
            throw r0     // Catch: java.lang.Throwable -> L66
        L9d:
            r0 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f104858a
            int r0 = r0.decrementAndGet()
            if (r0 <= 0) goto Laa
            goto Lac
        Laa:
            r0 = 0
            r8 = r0
        Lac:
            r0 = r9
            r1 = r8
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            r0.setValue(r1)
            r0 = r6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.utils.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
