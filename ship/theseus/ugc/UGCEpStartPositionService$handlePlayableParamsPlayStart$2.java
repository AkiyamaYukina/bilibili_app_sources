package com.bilibili.ship.theseus.ugc;

import androidx.compose.ui.text.font.C4496a;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayableParamsPlayStart$2.class */
final class UGCEpStartPositionService$handlePlayableParamsPlayStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GeminiCommonPlayableParams $param;
    final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
    final WithVideoProgress $playable;
    private Object L$0;
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayableParamsPlayStart$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayableParamsPlayStart$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MediaHistoryEntry $memoryHistory;
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WithVideoProgress withVideoProgress, MediaHistoryEntry mediaHistoryEntry, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = withVideoProgress;
            this.$memoryHistory = mediaHistoryEntry;
            this.$playViewUniteReplyDeferred = deferred;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, this.$memoryHistory, this.$playViewUniteReplyDeferred, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(2:6|(2:8|(3:10|33|34)(2:11|12))(8:13|23|35|24|27|(2:29|(2:31|32))|33|34))(1:14))(2:15|(2:17|18))|19|(2:21|22)|23|35|24|27|(0)|33|34) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
        
            com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel.getDefaultInstance();
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayableParamsPlayStart$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayableParamsPlayStart$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayableParamsPlayStart$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MediaHistoryEntry $memoryHistory;
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(j jVar, WithVideoProgress withVideoProgress, MediaHistoryEntry mediaHistoryEntry, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$playable = withVideoProgress;
            this.$memoryHistory = mediaHistoryEntry;
            this.$playViewUniteReplyDeferred = deferred;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$playable, this.$memoryHistory, this.$playViewUniteReplyDeferred, continuation);
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
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(this.$memoryHistory.getProgress(), DurationUnit.MILLISECONDS);
                Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
                this.label = 1;
                if (j.a(jVar, withVideoProgress, duration, deferred, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayableParamsPlayStart$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayableParamsPlayStart$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final WithVideoProgress $playable;
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(j jVar, WithVideoProgress withVideoProgress, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$playable = withVideoProgress;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$playable, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                defpackage.a.b("[theseus-ugc-UGCEpStartPositionService$handlePlayableParamsPlayStart$2$3-invokeSuspend] ", C4496a.a("from playable params wait play view reply, seek to ", Duration.toString-impl(this.this$0.f97945i)), "UGCEpStartPositionService$handlePlayableParamsPlayStart$2$3-invokeSuspend");
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayableParamsPlayStart$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handlePlayableParamsPlayStart$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(j jVar, WithVideoProgress withVideoProgress, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$playable = withVideoProgress;
            this.$playViewUniteReplyDeferred = deferred;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$playable, this.$playViewUniteReplyDeferred, continuation);
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
    public UGCEpStartPositionService$handlePlayableParamsPlayStart$2(GeminiCommonPlayableParams geminiCommonPlayableParams, Deferred<PlayViewUniteReply> deferred, WithVideoProgress withVideoProgress, j jVar, Continuation<? super UGCEpStartPositionService$handlePlayableParamsPlayStart$2> continuation) {
        super(2, continuation);
        this.$param = geminiCommonPlayableParams;
        this.$playViewUniteReplyDeferred = deferred;
        this.$playable = withVideoProgress;
        this.this$0 = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEpStartPositionService$handlePlayableParamsPlayStart$2 uGCEpStartPositionService$handlePlayableParamsPlayStart$2 = new UGCEpStartPositionService$handlePlayableParamsPlayStart$2(this.$param, this.$playViewUniteReplyDeferred, this.$playable, this.this$0, continuation);
        uGCEpStartPositionService$handlePlayableParamsPlayStart$2.L$0 = obj;
        return uGCEpStartPositionService$handlePlayableParamsPlayStart$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(2:6|(3:8|29|30)(2:9|10))(1:11))(2:12|(3:14|32|33)(2:15|(2:17|18)))|19|34|20|23|(4:25|(2:27|28)|29|30)(3:31|32|33)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
    
        com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel.getDefaultInstance();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handlePlayableParamsPlayStart$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
