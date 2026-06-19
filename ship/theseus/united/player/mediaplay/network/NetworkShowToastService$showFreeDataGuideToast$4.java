package com.bilibili.ship.theseus.united.player.mediaplay.network;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.IToastServiceKtxKt;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/NetworkShowToastService$showFreeDataGuideToast$4.class */
final class NetworkShowToastService$showFreeDataGuideToast$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Job> $job;
    final PlayerToast $toast;
    private Object L$0;
    int label;
    final m this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.NetworkShowToastService$showFreeDataGuideToast$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/NetworkShowToastService$showFreeDataGuideToast$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PlayerToast $toast;
        int label;
        final m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar, PlayerToast playerToast, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
            this.$toast = playerToast;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$toast, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IToastService iToastService = this.this$0.f104583b;
                PlayerToast playerToast = this.$toast;
                this.label = 1;
                if (IToastServiceKtxKt.a(iToastService, playerToast, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkShowToastService$showFreeDataGuideToast$4(Ref.ObjectRef<Job> objectRef, m mVar, PlayerToast playerToast, Continuation<? super NetworkShowToastService$showFreeDataGuideToast$4> continuation) {
        super(2, continuation);
        this.$job = objectRef;
        this.this$0 = mVar;
        this.$toast = playerToast;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetworkShowToastService$showFreeDataGuideToast$4 networkShowToastService$showFreeDataGuideToast$4 = new NetworkShowToastService$showFreeDataGuideToast$4(this.$job, this.this$0, this.$toast, continuation);
        networkShowToastService$showFreeDataGuideToast$4.L$0 = obj;
        return networkShowToastService$showFreeDataGuideToast$4;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        this.$job.element = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$toast, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
