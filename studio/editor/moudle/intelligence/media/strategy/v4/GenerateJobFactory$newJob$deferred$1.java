package com.bilibili.studio.editor.moudle.intelligence.media.strategy.v4;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/v4/GenerateJobFactory$newJob$deferred$1.class */
final class GenerateJobFactory$newJob$deferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super g>, Object> {
    final List<MediaStrategyItem> $source;
    final String $traceKey;
    final int $version;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GenerateJobFactory$newJob$deferred$1(a aVar, String str, int i7, List<? extends MediaStrategyItem> list, Continuation<? super GenerateJobFactory$newJob$deferred$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$traceKey = str;
        this.$version = i7;
        this.$source = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenerateJobFactory$newJob$deferred$1(this.this$0, this.$traceKey, this.$version, this.$source, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super g> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.this$0;
            String str = this.$traceKey;
            int i8 = this.$version;
            List<MediaStrategyItem> list = this.$source;
            this.label = 1;
            Object objA = a.a(aVar, str, i8, list, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
