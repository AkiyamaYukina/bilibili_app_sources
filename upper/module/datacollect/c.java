package com.bilibili.upper.module.datacollect;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.foundation.FoundationAlias;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import ng0.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/c.class */
@StabilityInferred(parameters = 1)
public final class c {
    @Nullable
    public static Object a(@NotNull String str, @NotNull SuspendLambda suspendLambda) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
        cancellableContinuationImpl.initCancellability();
        f.c cVar = new f.c(FoundationAlias.getFapp(), str);
        cVar.f124167b = "svf/android";
        f fVarA = f.a(cVar, null);
        if (fVarA == null) {
            cancellableContinuationImpl.resumeWith(Result.constructor-impl(""));
        } else {
            fVarA.addUploadCallback(new b(cancellableContinuationImpl));
            fVarA.start();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(suspendLambda);
        }
        return result;
    }
}
