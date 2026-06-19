package com.bilibili.playerbizcommon.features.network;

import com.bapis.bilibili.app.view.v1.TFInfoReply;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$updateFreeDataToastData$1.class */
public final class PlayerNetworkService$updateFreeDataToastData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<TFInfoReply, Unit> $action;
    Object L$0;
    Object L$1;
    int label;
    final PlayerNetworkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerNetworkService$updateFreeDataToastData$1(PlayerNetworkService playerNetworkService, Function1<? super TFInfoReply, Unit> function1, Continuation<? super PlayerNetworkService$updateFreeDataToastData$1> continuation) {
        super(2, continuation);
        this.this$0 = playerNetworkService;
        this.$action = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerNetworkService$updateFreeDataToastData$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        PlayerNetworkService playerNetworkService;
        TFInfoReply tFInfoReply;
        Function1<TFInfoReply, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            playerNetworkService = this.this$0;
            this.L$0 = playerNetworkService;
            this.label = 1;
            Object objAccess$fetcherToastDataFromRemote = PlayerNetworkService.access$fetcherToastDataFromRemote(playerNetworkService, this);
            obj = objAccess$fetcherToastDataFromRemote;
            if (objAccess$fetcherToastDataFromRemote == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tFInfoReply = (TFInfoReply) this.L$1;
                Function1<TFInfoReply, Unit> function12 = (Function1) this.L$0;
                ResultKt.throwOnFailure(obj);
                function1 = function12;
                function1.invoke(tFInfoReply);
                return Unit.INSTANCE;
            }
            playerNetworkService = (PlayerNetworkService) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        playerNetworkService.f79895v = (TFInfoReply) obj;
        tFInfoReply = this.this$0.f79895v;
        if (tFInfoReply != null) {
            function1 = this.$action;
            this.L$0 = function1;
            this.L$1 = tFInfoReply;
            this.label = 2;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            function1.invoke(tFInfoReply);
        }
        return Unit.INSTANCE;
    }
}
