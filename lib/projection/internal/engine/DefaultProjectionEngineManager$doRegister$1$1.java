package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/DefaultProjectionEngineManager$doRegister$1$1.class */
public final class DefaultProjectionEngineManager$doRegister$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $triggerClient;
    int label;
    final DefaultProjectionEngineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultProjectionEngineManager$doRegister$1$1(DefaultProjectionEngineManager defaultProjectionEngineManager, int i7, Continuation<? super DefaultProjectionEngineManager$doRegister$1$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultProjectionEngineManager;
        this.$triggerClient = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultProjectionEngineManager$doRegister$1$1(this.this$0, this.$triggerClient, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.this$0;
        int i7 = this.$triggerClient;
        try {
            Result.Companion companion = Result.Companion;
            BLog.i("NirvanaEngine", "nirvana registerEngine in bg");
            defaultProjectionEngineManager.J(new NirvanaEngine(i7));
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj2);
        if (th2 != null) {
            com.bilibili.adcommon.utils.e.a("registerEngine in bg fail: ", "NirvanaEngine", th2);
        }
        return Unit.INSTANCE;
    }
}
