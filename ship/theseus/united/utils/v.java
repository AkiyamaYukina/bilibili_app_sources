package com.bilibili.ship.theseus.united.utils;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/v.class */
public final class v {
    @Nullable
    public static final Object a(@NotNull View view, @NotNull SuspendLambda suspendLambda) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
        cancellableContinuationImpl.initCancellability();
        t tVar = new t(view, cancellableContinuationImpl);
        view.getViewTreeObserver().addOnGlobalLayoutListener(tVar);
        cancellableContinuationImpl.invokeOnCancellation(new s(view, tVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
