package com.bilibili.biligame.card2;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonView2$bindToView$2$2$1.class */
public final class GameCardButtonView2$bindToView$2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final GameCardButtonView2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardButtonView2$bindToView$2$2$1(GameCardButtonView2 gameCardButtonView2, Continuation<? super GameCardButtonView2$bindToView$2$2$1> continuation) {
        super(2, continuation);
        this.this$0 = gameCardButtonView2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GameCardButtonView2$bindToView$2$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function0<Unit> clickCallBack = this.this$0.getClickCallBack();
            if (clickCallBack != null) {
                clickCallBack.invoke();
            }
            GameCardButtonPresentImpV2 gameCardButtonPresentImplV2 = this.this$0.getGameCardButtonPresentImplV2();
            Map<String, String> clickReportParams = this.this$0.getClickReportParams();
            this.label = 1;
            if (gameCardButtonPresentImplV2.handleClickSus(clickReportParams, this) == coroutine_suspended) {
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
