package com.bilibili.ship.theseus.ugc;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayViewPlayStart$2.class */
final class UGCEpStartPositionService$handlePlayViewPlayStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
    final WithVideoProgress $playable;
    private Object L$0;
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayViewPlayStart$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayViewPlayStart$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final WithVideoProgress $playable;
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WithVideoProgress withVideoProgress, j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = withVideoProgress;
            this.this$0 = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, this.this$0, continuation);
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
                long j7 = this.this$0.f97945i;
                this.label = 1;
                if (withVideoProgress.c(j7, false, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayViewPlayStart$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayViewPlayStart$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(j jVar, WithVideoProgress withVideoProgress, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$playable = withVideoProgress;
            this.$playViewUniteReplyDeferred = deferred;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$playable, this.$playViewUniteReplyDeferred, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = this.this$0;
                WithVideoProgress withVideoProgress = this.$playable;
                long j7 = jVar.f97945i;
                Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
                this.label = 1;
                if (j.a(jVar, withVideoProgress, j7, deferred, this) == coroutine_suspended) {
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
    public UGCEpStartPositionService$handlePlayViewPlayStart$2(Deferred<PlayViewUniteReply> deferred, j jVar, WithVideoProgress withVideoProgress, Continuation<? super UGCEpStartPositionService$handlePlayViewPlayStart$2> continuation) {
        super(2, continuation);
        this.$playViewUniteReplyDeferred = deferred;
        this.this$0 = jVar;
        this.$playable = withVideoProgress;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEpStartPositionService$handlePlayViewPlayStart$2 uGCEpStartPositionService$handlePlayViewPlayStart$2 = new UGCEpStartPositionService$handlePlayViewPlayStart$2(this.$playViewUniteReplyDeferred, this.this$0, this.$playable, continuation);
        uGCEpStartPositionService$handlePlayViewPlayStart$2.L$0 = obj;
        return uGCEpStartPositionService$handlePlayViewPlayStart$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = deferred.await(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        j jVar = this.this$0;
        long jA = k.a((PlayViewUniteReply) obj);
        jVar.f97945i = jA;
        jVar.f97944g.f123391d = jA;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$playable, this.$playViewUniteReplyDeferred, null), 3, (Object) null);
    }
}
