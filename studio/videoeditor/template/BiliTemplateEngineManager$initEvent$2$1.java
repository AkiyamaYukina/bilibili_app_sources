package com.bilibili.studio.videoeditor.template;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/BiliTemplateEngineManager$initEvent$2$1.class */
final class BiliTemplateEngineManager$initEvent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final eD0.a $it;
    int label;
    final BiliTemplateEngineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliTemplateEngineManager$initEvent$2$1(BiliTemplateEngineManager biliTemplateEngineManager, eD0.a aVar, Continuation<? super BiliTemplateEngineManager$initEvent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = biliTemplateEngineManager;
        this.$it = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliTemplateEngineManager$initEvent$2$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliTemplateEngineManager biliTemplateEngineManager = this.this$0;
            eD0.a aVar = this.$it;
            aVar.getClass();
            String str = aVar.a;
            this.label = 1;
            if (biliTemplateEngineManager.f(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
