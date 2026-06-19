package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.okretro.response.BiliApiResponse;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$MediaScopedState$dataDeferred$1.class */
public final class OgvVideoCardService$MediaScopedState$dataDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiliApiResponse<? extends List<? extends PlayerCardVO>>>, Object> {
    final OgvVideoCardApiService $apiService;
    final long $epId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$MediaScopedState$dataDeferred$1(OgvVideoCardApiService ogvVideoCardApiService, long j7, Continuation<? super OgvVideoCardService$MediaScopedState$dataDeferred$1> continuation) {
        super(2, continuation);
        this.$apiService = ogvVideoCardApiService;
        this.$epId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVideoCardService$MediaScopedState$dataDeferred$1(this.$apiService, this.$epId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiliApiResponse<? extends List<PlayerCardVO>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvVideoCardApiService ogvVideoCardApiService = this.$apiService;
            long j7 = this.$epId;
            this.label = 1;
            Object operationCardList = ogvVideoCardApiService.getOperationCardList(j7, 0, this);
            obj = operationCardList;
            if (operationCardList == coroutine_suspended) {
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
