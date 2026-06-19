package com.bilibili.ship.theseus.cheese.player.playposition;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.ad.reward.test.K;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import ev0.i;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$seekToLandingPosition$2.class */
final class CheeseEpStartPositionService$seekToLandingPosition$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final i $landingPosition;
    final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
    final WithVideoProgress $playable;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToLandingPosition$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$seekToLandingPosition$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final i $landingPosition;
        final WithVideoProgress $playable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WithVideoProgress withVideoProgress, i iVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = withVideoProgress;
            this.$landingPosition = iVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, this.$landingPosition, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                WithVideoProgress withVideoProgress = this.$playable;
                i iVar = this.$landingPosition;
                long j7 = iVar.f117655a;
                this.label = 1;
                if (withVideoProgress.c(j7, iVar.f117656b, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$seekToLandingPosition$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$seekToLandingPosition$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final i $landingPosition;
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, WithVideoProgress withVideoProgress, i iVar, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$playable = withVideoProgress;
            this.$landingPosition = iVar;
            this.$playViewUniteReplyDeferred = deferred;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$playable, this.$landingPosition, this.$playViewUniteReplyDeferred, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = this.this$0;
                WithVideoProgress withVideoProgress = this.$playable;
                long j7 = this.$landingPosition.f117655a;
                Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
                this.label = 1;
                if (aVar.a(withVideoProgress, j7, deferred, true, this) == coroutine_suspended) {
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
    public CheeseEpStartPositionService$seekToLandingPosition$2(i iVar, WithVideoProgress withVideoProgress, a aVar, Deferred<PlayViewUniteReply> deferred, Continuation<? super CheeseEpStartPositionService$seekToLandingPosition$2> continuation) {
        super(2, continuation);
        this.$landingPosition = iVar;
        this.$playable = withVideoProgress;
        this.this$0 = aVar;
        this.$playViewUniteReplyDeferred = deferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseEpStartPositionService$seekToLandingPosition$2 cheeseEpStartPositionService$seekToLandingPosition$2 = new CheeseEpStartPositionService$seekToLandingPosition$2(this.$landingPosition, this.$playable, this.this$0, this.$playViewUniteReplyDeferred, continuation);
        cheeseEpStartPositionService$seekToLandingPosition$2.L$0 = obj;
        return cheeseEpStartPositionService$seekToLandingPosition$2;
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
        BLog.i("CheeseEpStartPositionService$seekToLandingPosition$2-invokeSuspend", "[theseus-cheese-CheeseEpStartPositionService$seekToLandingPosition$2-invokeSuspend] " + K.a("seek to landing position, start progress: ", Duration.toString-impl(this.$landingPosition.f117655a), ", accurate: ", this.$landingPosition.f117656b));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, this.$landingPosition, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$playable, this.$landingPosition, this.$playViewUniteReplyDeferred, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
