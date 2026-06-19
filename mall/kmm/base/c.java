package com.bilibili.mall.kmm.base;

import androidx.room.m;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/base/c.class */
public final class c {
    @Nullable
    public static final Object a(@NotNull String str, @NotNull String str2, @Nullable Map map, @Nullable Map map2, @NotNull ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt.launch$default(m.a(null, 1, null, Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new MallEnvKt$mallKntrAsyncRequest$2$1(str, str2, map, map2, cancellableContinuationImpl, null), 3, (Object) null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }
}
