package com.bilibili.ship.theseus.cheese.biz.intro.season;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/season/CheeseSeasonService$create$3.class */
public final class CheeseSeasonService$create$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CheeseSeasonComponent $cheeseSeasonComponent;
    int label;
    final CheeseSeasonService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseSeasonService$create$3(CheeseSeasonService cheeseSeasonService, CheeseSeasonComponent cheeseSeasonComponent, Continuation<? super CheeseSeasonService$create$3> continuation) {
        super(2, continuation);
        this.this$0 = cheeseSeasonService;
        this.$cheeseSeasonComponent = cheeseSeasonComponent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseSeasonService$create$3(this.this$0, this.$cheeseSeasonComponent, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f90032b;
            CheeseSeasonComponent cheeseSeasonComponent = this.$cheeseSeasonComponent;
            this.label = 1;
            if (theseusFloatLayerService.d(cheeseSeasonComponent, null, this) == coroutine_suspended) {
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
