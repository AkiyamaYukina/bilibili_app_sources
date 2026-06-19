package com.bilibili.ogv.infra.android.view;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/android/view/d.class */
public final class d {
    @Nullable
    public static final Object a(@NotNull View view, @NotNull ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        c cVar = new c(cancellableContinuationImpl);
        view.post(cVar);
        cancellableContinuationImpl.invokeOnCancellation(new b(view, cVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
