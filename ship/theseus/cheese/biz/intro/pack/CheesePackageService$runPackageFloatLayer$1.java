package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageService$runPackageFloatLayer$1.class */
final class CheesePackageService$runPackageFloatLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RunningUIComponent $runningUIComponent;
    int label;
    final CheesePackageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePackageService$runPackageFloatLayer$1(RunningUIComponent runningUIComponent, CheesePackageService cheesePackageService, Continuation<? super CheesePackageService$runPackageFloatLayer$1> continuation) {
        super(2, continuation);
        this.$runningUIComponent = runningUIComponent;
        this.this$0 = cheesePackageService;
    }

    private static final Unit invokeSuspend$lambda$0(RunningUIComponent runningUIComponent, CheesePackageService cheesePackageService, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new CheesePackageService$runPackageFloatLayer$1$1$1(runningUIComponent, null));
        cVar.b(new CheesePackageService$runPackageFloatLayer$1$1$2(cheesePackageService, runningUIComponent, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePackageService$runPackageFloatLayer$1(this.$runningUIComponent, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            RunningUIComponent runningUIComponent = this.$runningUIComponent;
            CheesePackageService cheesePackageService = this.this$0;
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(runningUIComponent, cheesePackageService, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
