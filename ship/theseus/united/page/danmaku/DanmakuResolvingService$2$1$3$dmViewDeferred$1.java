package com.bilibili.ship.theseus.united.page.danmaku;

import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$2$1$3$dmViewDeferred$1.class */
public final class DanmakuResolvingService$2$1$3$dmViewDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DmViewReply>, Object> {
    final Video.DanmakuResolveParams $dmViewRequestParams;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuResolvingService$2$1$3$dmViewDeferred$1(Video.DanmakuResolveParams danmakuResolveParams, Continuation<? super DanmakuResolvingService$2$1$3$dmViewDeferred$1> continuation) {
        super(2, continuation);
        this.$dmViewRequestParams = danmakuResolveParams;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DanmakuResolvingService$2$1$3$dmViewDeferred$1(this.$dmViewRequestParams, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DmViewReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy = tv.danmaku.biliplayerv2.service.resolve.danmaku.b.a;
            Video.DanmakuResolveParams danmakuResolveParams = this.$dmViewRequestParams;
            this.label = 1;
            Object objC = tv.danmaku.biliplayerv2.service.resolve.danmaku.b.c(danmakuResolveParams, this);
            obj = objC;
            if (objC == coroutine_suspended) {
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
