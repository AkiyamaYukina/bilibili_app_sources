package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$clickFlow$1.class */
final class DanmakuCompoundRepository$clickFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final PlayerToast $this_clickFlow;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuCompoundRepository$clickFlow$1$a.class */
    public static final class a implements PlayerToast.MessageClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<Boolean> f99392a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ProducerScope<? super Boolean> producerScope) {
            this.f99392a = producerScope;
        }

        public final void onActionWithCollapse(int i7, boolean z6) {
            this.f99392a.trySend-JP2dKIU(Boolean.TRUE);
        }

        public final void onDismiss() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuCompoundRepository$clickFlow$1(PlayerToast playerToast, Continuation<? super DanmakuCompoundRepository$clickFlow$1> continuation) {
        super(2, continuation);
        this.$this_clickFlow = playerToast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(PlayerToast playerToast) {
        playerToast.setClickListener((PlayerToast.MessageClickListener) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuCompoundRepository$clickFlow$1 danmakuCompoundRepository$clickFlow$1 = new DanmakuCompoundRepository$clickFlow$1(this.$this_clickFlow, continuation);
        danmakuCompoundRepository$clickFlow$1.L$0 = obj;
        return danmakuCompoundRepository$clickFlow$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            this.$this_clickFlow.setClickListener(new a(producerScope));
            final PlayerToast playerToast = this.$this_clickFlow;
            Function0 function0 = new Function0(playerToast) { // from class: com.bilibili.ship.theseus.united.page.danmaku.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerToast f99533a;

                {
                    this.f99533a = playerToast;
                }

                public final Object invoke() {
                    return DanmakuCompoundRepository$clickFlow$1.invokeSuspend$lambda$0(this.f99533a);
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
