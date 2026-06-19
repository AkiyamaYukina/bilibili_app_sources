package com.bilibili.ship.theseus.ugc;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.history.MediaHistoryHelper;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import cq0.C6748a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleFastPlayStart$2.class */
final class UGCEpStartPositionService$handleFastPlayStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ev0.h $fastPlayData;
    final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
    final WithVideoProgress $playable;
    private Object L$0;
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handleFastPlayStart$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleFastPlayStart$2$1.class */
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handleFastPlayStart$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleFastPlayStart$2$2.class */
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
    public UGCEpStartPositionService$handleFastPlayStart$2(ev0.h hVar, j jVar, WithVideoProgress withVideoProgress, Deferred<PlayViewUniteReply> deferred, Continuation<? super UGCEpStartPositionService$handleFastPlayStart$2> continuation) {
        super(2, continuation);
        this.$fastPlayData = hVar;
        this.this$0 = jVar;
        this.$playable = withVideoProgress;
        this.$playViewUniteReplyDeferred = deferred;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEpStartPositionService$handleFastPlayStart$2 uGCEpStartPositionService$handleFastPlayStart$2 = new UGCEpStartPositionService$handleFastPlayStart$2(this.$fastPlayData, this.this$0, this.$playable, this.$playViewUniteReplyDeferred, continuation);
        uGCEpStartPositionService$handleFastPlayStart$2.L$0 = obj;
        return uGCEpStartPositionService$handleFastPlayStart$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        long duration;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        MediaHistoryEntry mediaHistoryEntry = MediaHistoryHelper.Companion.getInstance().read(new C6748a(this.$fastPlayData.f117648d));
        long j7 = this.$fastPlayData.f117652i;
        j jVar = this.this$0;
        if (mediaHistoryEntry != null) {
            int progress = mediaHistoryEntry.getProgress();
            Duration.Companion companion = Duration.Companion;
            duration = DurationKt.toDuration(progress, DurationUnit.MILLISECONDS);
        } else {
            duration = j7;
        }
        jVar.f97945i = duration;
        jVar.f97944g.f123391d = duration;
        Integer numBoxInt = mediaHistoryEntry != null ? Boxing.boxInt(mediaHistoryEntry.getProgress()) : null;
        BLog.i("UGCEpStartPositionService$handleFastPlayStart$2-invokeSuspend", "[theseus-ugc-UGCEpStartPositionService$handleFastPlayStart$2-invokeSuspend] " + ("handleFastPlayStart, memoryHistory: " + numBoxInt + ", fastPlayHistory: " + Duration.toIsoString-impl(j7)));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$playable, this.$playViewUniteReplyDeferred, null), 3, (Object) null);
    }
}
