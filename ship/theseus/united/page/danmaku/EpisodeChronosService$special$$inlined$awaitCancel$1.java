package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.ILocalHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/EpisodeChronosService$special$$inlined$awaitCancel$1.class */
public final class EpisodeChronosService$special$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RpcInvokeObserver $observer$inlined;
    int label;
    final EpisodeChronosService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpisodeChronosService$special$$inlined$awaitCancel$1(Continuation continuation, EpisodeChronosService episodeChronosService, RpcInvokeObserver rpcInvokeObserver) {
        super(2, continuation);
        this.this$0 = episodeChronosService;
        this.$observer$inlined = rpcInvokeObserver;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EpisodeChronosService$special$$inlined$awaitCancel$1(continuation, this.this$0, this.$observer$inlined);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            ILocalHandler localHandler = this.this$0.f99430a.getLocalHandler();
            if (localHandler != null) {
                localHandler.unregisterRpcInvokeObserver();
            }
            EpisodeChronosService episodeChronosService = this.this$0;
            episodeChronosService.f99430a.removeSubtitleChangedObserver(episodeChronosService.f99433d);
            BLog.d("EpisodeChronosService", "GetWork --> EpisodeChronosService unregisterRpcInvokeObserver,observer = " + this.$observer$inlined);
            throw th;
        }
    }
}
