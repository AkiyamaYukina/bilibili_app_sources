package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$switchQuality$3.class */
final class FlattenedPCSFacade$switchQuality$3 extends SuspendLambda implements Function2<FlattenedPCSFacade.c, Continuation<? super Boolean>, Object> {
    final com.bilibili.player.tangram.basic.c $preference;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPCSFacade$switchQuality$3(com.bilibili.player.tangram.basic.c cVar, Continuation<? super FlattenedPCSFacade$switchQuality$3> continuation) {
        super(2, continuation);
        this.$preference = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlattenedPCSFacade$switchQuality$3 flattenedPCSFacade$switchQuality$3 = new FlattenedPCSFacade$switchQuality$3(this.$preference, continuation);
        flattenedPCSFacade$switchQuality$3.L$0 = obj;
        return flattenedPCSFacade$switchQuality$3;
    }

    public final Object invoke(FlattenedPCSFacade.c cVar, Continuation<? super Boolean> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PCSFacadeImpl pCSFacadeImpl = ((FlattenedPCSFacade.c) this.L$0).f79381b;
            com.bilibili.player.tangram.basic.c cVar = this.$preference;
            this.label = 1;
            Object objK = pCSFacadeImpl.K(cVar, this);
            obj = objK;
            if (objK == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                obj = obj2;
                return obj;
            }
            ResultKt.throwOnFailure(obj);
        }
        ((Boolean) obj).getClass();
        this.L$0 = obj;
        this.label = 2;
        if (YieldKt.yield(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return obj;
    }
}
