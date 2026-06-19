package com.bilibili.ship.theseus.ugc;

import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.history.MediaHistoryHelper;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleCachedPlayStart$2.class */
final class UGCEpStartPositionService$handleCachedPlayStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ev0.g $cachedPlayData;
    final WithVideoProgress $playable;
    private Object L$0;
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handleCachedPlayStart$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleCachedPlayStart$2$1.class */
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handleCachedPlayStart$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleCachedPlayStart$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final j this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCEpStartPositionService$handleCachedPlayStart$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCEpStartPositionService$handleCachedPlayStart$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(j jVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Duration.compareTo-LRDsOJo(this.this$0.f97945i, Duration.Companion.getZERO-UwyO8pc()) <= 0) {
                    return Unit.INSTANCE;
                }
                Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.this$0.f97943f);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                if (FlowKt.first(flowD, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.f97940c.showToast(j.b(this.this$0.h.getString(2131847208, com.bilibili.ship.theseus.united.utils.p.a(this.this$0.f97945i))));
            this.this$0.f97941d.report(new NeuronsEvents.NormalEvent("player.player.auto-seek.show.player", new String[0]));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCEpStartPositionService$handleCachedPlayStart$2(ev0.g gVar, j jVar, WithVideoProgress withVideoProgress, Continuation<? super UGCEpStartPositionService$handleCachedPlayStart$2> continuation) {
        super(2, continuation);
        this.$cachedPlayData = gVar;
        this.this$0 = jVar;
        this.$playable = withVideoProgress;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCEpStartPositionService$handleCachedPlayStart$2 uGCEpStartPositionService$handleCachedPlayStart$2 = new UGCEpStartPositionService$handleCachedPlayStart$2(this.$cachedPlayData, this.this$0, this.$playable, continuation);
        uGCEpStartPositionService$handleCachedPlayStart$2.L$0 = obj;
        return uGCEpStartPositionService$handleCachedPlayStart$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        long duration;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            MediaHistoryHelper companion = MediaHistoryHelper.Companion.getInstance();
            C6748a c6748a = new C6748a(this.$cachedPlayData.f117640c);
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = companion.readFromDB(c6748a, this);
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
        MediaHistoryEntry mediaHistoryEntry = (MediaHistoryEntry) obj;
        j jVar = this.this$0;
        if (mediaHistoryEntry != null) {
            int progress = mediaHistoryEntry.getProgress();
            Duration.Companion companion2 = Duration.Companion;
            duration = DurationKt.toDuration(progress, DurationUnit.MILLISECONDS);
        } else {
            duration = Duration.Companion.getZERO-UwyO8pc();
        }
        jVar.f97945i = duration;
        jVar.f97944g.f123391d = duration;
        BLog.i("UGCEpStartPositionService$handleCachedPlayStart$2-invokeSuspend", "[theseus-ugc-UGCEpStartPositionService$handleCachedPlayStart$2-invokeSuspend] " + com.bilibili.app.comm.rubick.common.g.b(mediaHistoryEntry != null ? Boxing.boxInt(mediaHistoryEntry.getProgress()) : null, "handleCachedPlayStart, memoryHistory: "));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$playable, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
    }
}
