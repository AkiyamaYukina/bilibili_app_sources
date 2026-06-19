package com.bilibili.ship.theseus.united.page.danmaku;

import com.bapis.bilibili.community.service.dm.v1.PostPanelV2;
import com.bilibili.playerbizcommonv2.danmaku.postpanel.DanmakuTimerService;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository$postPanelFlow$2;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$postPanelFlow$2.class */
final class DanmakuCompoundRepository$postPanelFlow$2 extends SuspendLambda implements Function2<ProducerScope<? super Pair<? extends Integer, ? extends PostPanelV2>>, Continuation<? super Unit>, Object> {
    final DanmakuTimerService $this_postPanelFlow;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$postPanelFlow$2$a.class */
    public static final class a implements tv.danmaku.biliplayerv2.service.interact.biz.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<Pair<Integer, PostPanelV2>> f99393a;

        public a(ProducerScope<? super Pair<Integer, PostPanelV2>> producerScope) {
            this.f99393a = producerScope;
        }

        public final void onPostPanelActive(int i7, PostPanelV2 postPanelV2) {
            this.f99393a.trySend-JP2dKIU(TuplesKt.to(Integer.valueOf(i7), postPanelV2));
        }

        public final void onPostPanelInactive(int i7, PostPanelV2 postPanelV2) {
            this.f99393a.trySend-JP2dKIU(TuplesKt.to(Integer.valueOf(i7), (Object) null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuCompoundRepository$postPanelFlow$2(DanmakuTimerService danmakuTimerService, Continuation<? super DanmakuCompoundRepository$postPanelFlow$2> continuation) {
        super(2, continuation);
        this.$this_postPanelFlow = danmakuTimerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(DanmakuTimerService danmakuTimerService, a aVar) {
        danmakuTimerService.d(aVar);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuCompoundRepository$postPanelFlow$2 danmakuCompoundRepository$postPanelFlow$2 = new DanmakuCompoundRepository$postPanelFlow$2(this.$this_postPanelFlow, continuation);
        danmakuCompoundRepository$postPanelFlow$2.L$0 = obj;
        return danmakuCompoundRepository$postPanelFlow$2;
    }

    public final Object invoke(ProducerScope<? super Pair<Integer, PostPanelV2>> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final a aVar = new a(producerScope);
            this.$this_postPanelFlow.c(aVar);
            final DanmakuTimerService danmakuTimerService = this.$this_postPanelFlow;
            Function0 function0 = new Function0(danmakuTimerService, aVar) { // from class: com.bilibili.ship.theseus.united.page.danmaku.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final DanmakuTimerService f99534a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DanmakuCompoundRepository$postPanelFlow$2.a f99535b;

                {
                    this.f99534a = danmakuTimerService;
                    this.f99535b = aVar;
                }

                public final Object invoke() {
                    return DanmakuCompoundRepository$postPanelFlow$2.invokeSuspend$lambda$0(this.f99534a, this.f99535b);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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
