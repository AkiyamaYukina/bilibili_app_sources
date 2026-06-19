package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/ServerStrategyManagerNew$autoGenerateResult$1.class */
public final class ServerStrategyManagerNew$autoGenerateResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $finish;
    final List<MediaStrategyItem> $source;
    Object L$0;
    int label;
    final ServerStrategyManagerNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ServerStrategyManagerNew$autoGenerateResult$1(ServerStrategyManagerNew serverStrategyManagerNew, List<? extends MediaStrategyItem> list, Function0<Unit> function0, Continuation<? super ServerStrategyManagerNew$autoGenerateResult$1> continuation) {
        super(2, continuation);
        this.this$0 = serverStrategyManagerNew;
        this.$source = list;
        this.$finish = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ServerStrategyManagerNew$autoGenerateResult$1(this.this$0, this.$source, this.$finish, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objA;
        ServerStrategyManagerNew serverStrategyManagerNew;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ServerStrategyManagerNew serverStrategyManagerNew2 = this.this$0;
            c cVar = serverStrategyManagerNew2.f107464j;
            this.L$0 = serverStrategyManagerNew2;
            this.label = 1;
            objA = cVar.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            serverStrategyManagerNew = serverStrategyManagerNew2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            serverStrategyManagerNew = (ServerStrategyManagerNew) this.L$0;
            ResultKt.throwOnFailure(obj);
            objA = obj;
        }
        serverStrategyManagerNew.h((g) objA, this.$source);
        Function0<Unit> function0 = this.$finish;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
