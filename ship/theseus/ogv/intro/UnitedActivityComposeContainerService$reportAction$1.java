package com.bilibili.ship.theseus.ogv.intro;

import com.bilibili.ship.theseus.ogv.activity.ActivityDialogActionType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/UnitedActivityComposeContainerService$reportAction$1.class */
final class UnitedActivityComposeContainerService$reportAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ActivityDialogActionType $action;
    final String $code;
    final String $id;
    int label;
    final UnitedActivityComposeContainerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedActivityComposeContainerService$reportAction$1(UnitedActivityComposeContainerService unitedActivityComposeContainerService, String str, String str2, ActivityDialogActionType activityDialogActionType, Continuation<? super UnitedActivityComposeContainerService$reportAction$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedActivityComposeContainerService;
        this.$id = str;
        this.$code = str2;
        this.$action = activityDialogActionType;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedActivityComposeContainerService$reportAction$1(this.this$0, this.$id, this.$code, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.activity.c cVar = this.this$0.f92281c;
            String str = this.$id;
            String str2 = this.$code;
            ActivityDialogActionType activityDialogActionType = this.$action;
            this.label = 1;
            if (cVar.c(str, str2, activityDialogActionType, this) == coroutine_suspended) {
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
