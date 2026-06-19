package com.bilibili.player.tangram.playercore;

import com.bilibili.app.gemini.base.resolver.qn.QualityScene;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.AbrParamsInterface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1.class */
public final class PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $specifiedQuality;
    int label;
    final PCSFacadeImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<ClosedRange<com.bilibili.player.tangram.basic.a>, Continuation<? super Unit>, Object> {
        final int $specifiedQuality;
        Object L$0;
        int label;
        final PCSFacadeImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i7, PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$specifiedQuality = i7;
            this.this$0 = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$specifiedQuality, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(ClosedRange<com.bilibili.player.tangram.basic.a> closedRange, Continuation<? super Unit> continuation) {
            return create(closedRange, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            com.bilibili.player.tangram.basic.a aVarA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ClosedRange closedRange = (ClosedRange) this.L$0;
                if (com.bilibili.player.tangram.basic.a.b(((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a, 0)) {
                    BLog.i("PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend] specialQualityInHalfFlow is lower, skip.");
                    return Unit.INSTANCE;
                }
                BLog.i("PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend] " + ("specialQualityInHalfFlow is " + closedRange));
                if (com.bilibili.player.tangram.basic.a.c(((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a)) {
                    int i8 = ((com.bilibili.player.tangram.basic.a) closedRange.getStart()).f79320a;
                    defpackage.a.b("[tangram-player-core-PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend] ", cf.o.a(i8, " endInclusive:", String.valueOf(((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a), " ", G0.b.a("force auto quality specifiedQuality:", String.valueOf(this.$specifiedQuality), " maxQnNumber:", String.valueOf(0), " minQuality:")), "PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend");
                    AbrParamsInterface.setScreenRatio(((QualityScene) this.this$0.f79387d.h.invoke()).ordinal());
                    this.this$0.f79384a.setDashAuto(true, i8, ((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a);
                    return Unit.INSTANCE;
                }
                aVarA = y.a(this.this$0.o().f79460c, Integer.MAX_VALUE, this.$specifiedQuality);
                defpackage.a.b("[tangram-player-core-PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend] ", "specialQualityInHalfFlow to apply, quality:" + aVarA, "PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1$2-invokeSuspend");
                if (aVarA == null) {
                    return Unit.INSTANCE;
                }
                Flow<PlayerAvailability> flowD = this.this$0.f79388e.d();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = aVarA;
                this.label = 1;
                if (FlowKt.first(flowD, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
                ResultKt.throwOnFailure(obj);
                aVarA = aVar;
            }
            PCSFacadeImpl pCSFacadeImpl = this.this$0;
            pCSFacadeImpl.R(pCSFacadeImpl.o(), aVarA.f79320a);
            this.this$0.f79387d.f79351g.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1(PCSFacadeImpl pCSFacadeImpl, int i7, Continuation<? super PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1> continuation) {
        super(2, continuation);
        this.this$0 = pCSFacadeImpl;
        this.$specifiedQuality = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(ClosedRange closedRange, ClosedRange closedRange2) {
        return com.bilibili.player.tangram.basic.a.b(((com.bilibili.player.tangram.basic.a) closedRange.getStart()).f79320a, ((com.bilibili.player.tangram.basic.a) closedRange2.getStart()).f79320a) && com.bilibili.player.tangram.basic.a.b(((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a, ((com.bilibili.player.tangram.basic.a) closedRange2.getEndInclusive()).f79320a);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSFacadeImpl$withSpecificQualityPreference$2$runCore$1(this.this$0, this.$specifiedQuality, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.f79387d.f79346b, (Function2) new Object());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$specifiedQuality, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
