package com.bilibili.playset.api;

import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/t.class */
public final class t {
    public static final <T> void a(@NotNull Function1<? super String, ? extends BiliCall<GeneralResponse<T>>> function1, @NotNull String str, @NotNull BiliApiDataCallback<T> biliApiDataCallback) {
        ((BiliCall) function1.invoke((Object) null)).enqueue(new s(biliApiDataCallback, FoundationAlias.getFapp(), str, new n(0, function1, biliApiDataCallback)));
    }

    @Nullable
    public static final Object b(@NotNull Function1 function1, @NotNull SuspendLambda suspendLambda) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
        cancellableContinuationImpl.initCancellability();
        a(function1, "compilation_favorite", new o(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return result;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2 r8, @org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r10, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r12, @org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.t.c(kotlin.jvm.functions.Function2, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
