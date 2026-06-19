package com.bilibili.studio.videoeditor.template;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/BiliTemplateEngineManager$checkTribeInstalledState$1.class */
public final class BiliTemplateEngineManager$checkTribeInstalledState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Boolean, Unit> $callback;
    final boolean $needShowHint;
    final boolean $needShowLoading;
    Object L$0;
    int label;
    final BiliTemplateEngineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiliTemplateEngineManager$checkTribeInstalledState$1(Function1<? super Boolean, Unit> function1, BiliTemplateEngineManager biliTemplateEngineManager, boolean z6, boolean z7, Continuation<? super BiliTemplateEngineManager$checkTribeInstalledState$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
        this.this$0 = biliTemplateEngineManager;
        this.$needShowLoading = z6;
        this.$needShowHint = z7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliTemplateEngineManager$checkTribeInstalledState$1(this.$callback, this.this$0, this.$needShowLoading, this.$needShowHint, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object objD;
        Function1<Boolean, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Boolean, Unit> function12 = this.$callback;
            BiliTemplateEngineManager biliTemplateEngineManager = this.this$0;
            boolean z6 = this.$needShowLoading;
            boolean z7 = this.$needShowHint;
            this.L$0 = function12;
            this.label = 1;
            objD = biliTemplateEngineManager.d(z6, z7, this);
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1 = function12;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) this.L$0;
            ResultKt.throwOnFailure(obj);
            objD = obj;
        }
        function1.invoke(objD);
        return Unit.INSTANCE;
    }
}
