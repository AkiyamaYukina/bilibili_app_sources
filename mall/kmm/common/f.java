package com.bilibili.mall.kmm.common;

import androidx.room.m;
import com.tencent.connect.common.Constants;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/f.class */
public final class f {
    @Nullable
    public static final Object a(@NotNull String str, @Nullable Map map, @NotNull ContinuationImpl continuationImpl) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuationImpl), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt.launch$default(m.a(null, 1, null, Dispatchers.getDefault()), (CoroutineContext) null, (CoroutineStart) null, new NetKt$mallAsyncRequest$2$1(str, Constants.HTTP_POST, null, map, cancellableContinuationImpl, null), 3, (Object) null);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuationImpl);
        }
        return result;
    }
}
