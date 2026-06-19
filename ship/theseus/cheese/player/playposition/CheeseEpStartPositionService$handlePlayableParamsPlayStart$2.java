package com.bilibili.ship.theseus.cheese.player.playposition;

import androidx.compose.ui.text.font.C4496a;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.comm.rubick.common.g;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$handlePlayableParamsPlayStart$2.class */
final class CheeseEpStartPositionService$handlePlayableParamsPlayStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final GeminiCommonPlayableParams $param;
    final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
    final WithVideoProgress $playable;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MediaHistoryEntry $memoryHistory;
        final WithVideoProgress $playable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WithVideoProgress withVideoProgress, MediaHistoryEntry mediaHistoryEntry, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playable = withVideoProgress;
            this.$memoryHistory = mediaHistoryEntry;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playable, this.$memoryHistory, continuation);
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
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(this.$memoryHistory.getProgress(), DurationUnit.MILLISECONDS);
                this.label = 1;
                if (withVideoProgress.c(duration, false, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MediaHistoryEntry $memoryHistory;
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, WithVideoProgress withVideoProgress, MediaHistoryEntry mediaHistoryEntry, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
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
                a aVar = this.this$0;
                WithVideoProgress withVideoProgress = this.$playable;
                Duration.Companion companion = Duration.Companion;
                long duration = DurationKt.toDuration(this.$memoryHistory.getProgress(), DurationUnit.MILLISECONDS);
                Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
                this.label = 1;
                if (aVar.a(withVideoProgress, duration, deferred, false, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final WithVideoProgress $playable;
        final long $startProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(long j7, WithVideoProgress withVideoProgress, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$startProgress = j7;
            this.$playable = withVideoProgress;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$startProgress, this.$playable, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                defpackage.a.b("[theseus-cheese-CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$3-invokeSuspend] ", C4496a.a("from playable params wait play view reply, seek to ", Duration.toString-impl(this.$startProgress)), "CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$3-invokeSuspend");
                WithVideoProgress withVideoProgress = this.$playable;
                long j7 = this.$startProgress;
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.playposition.CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/CheeseEpStartPositionService$handlePlayableParamsPlayStart$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Deferred<PlayViewUniteReply> $playViewUniteReplyDeferred;
        final WithVideoProgress $playable;
        final long $startProgress;
        int label;
        final a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(a aVar, WithVideoProgress withVideoProgress, long j7, Deferred<PlayViewUniteReply> deferred, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$playable = withVideoProgress;
            this.$startProgress = j7;
            this.$playViewUniteReplyDeferred = deferred;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$playable, this.$startProgress, this.$playViewUniteReplyDeferred, continuation);
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
                long j7 = this.$startProgress;
                Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
                this.label = 1;
                if (aVar.a(withVideoProgress, j7, deferred, false, this) == coroutine_suspended) {
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
    public CheeseEpStartPositionService$handlePlayableParamsPlayStart$2(GeminiCommonPlayableParams geminiCommonPlayableParams, Deferred<PlayViewUniteReply> deferred, WithVideoProgress withVideoProgress, a aVar, Continuation<? super CheeseEpStartPositionService$handlePlayableParamsPlayStart$2> continuation) {
        super(2, continuation);
        this.$param = geminiCommonPlayableParams;
        this.$playViewUniteReplyDeferred = deferred;
        this.$playable = withVideoProgress;
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseEpStartPositionService$handlePlayableParamsPlayStart$2 cheeseEpStartPositionService$handlePlayableParamsPlayStart$2 = new CheeseEpStartPositionService$handlePlayableParamsPlayStart$2(this.$param, this.$playViewUniteReplyDeferred, this.$playable, this.this$0, continuation);
        cheeseEpStartPositionService$handlePlayableParamsPlayStart$2.L$0 = obj;
        return cheeseEpStartPositionService$handlePlayableParamsPlayStart$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineScope coroutineScope;
        Job jobLaunch$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MediaHistoryEntry mediaHistoryEntry = MediaHistoryHelper.Companion.getInstance().read(new C6748a(this.$param.getCid()));
            defpackage.a.b("[theseus-cheese-CheeseEpStartPositionService$handlePlayableParamsPlayStart$2-invokeSuspend] ", g.b(mediaHistoryEntry != null ? Boxing.boxInt(mediaHistoryEntry.getProgress()) : null, "playableParams memoryHistory progress: "), "CheeseEpStartPositionService$handlePlayableParamsPlayStart$2-invokeSuspend");
            if (mediaHistoryEntry != null) {
                BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, mediaHistoryEntry, null), 3, (Object) null);
                jobLaunch$default = BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$playable, mediaHistoryEntry, this.$playViewUniteReplyDeferred, null), 3, (Object) null);
                return jobLaunch$default;
            }
            Deferred<PlayViewUniteReply> deferred = this.$playViewUniteReplyDeferred;
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objAwait = deferred.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = objAwait;
            coroutineScope = coroutineScope2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        }
        long jB = b.b((PlayViewUniteReply) obj2);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(jB, this.$playable, null), 3, (Object) null);
        jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$playable, jB, this.$playViewUniteReplyDeferred, null), 3, (Object) null);
        return jobLaunch$default;
    }
}
