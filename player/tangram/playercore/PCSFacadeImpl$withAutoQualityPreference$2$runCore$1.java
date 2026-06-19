package com.bilibili.player.tangram.playercore;

import com.bilibili.app.gemini.base.resolver.qn.QualityScene;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.AbrParamsInterface;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withAutoQualityPreference$2$runCore$1.class */
public final class PCSFacadeImpl$withAutoQualityPreference$2$runCore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PCSFacadeImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$withAutoQualityPreference$2$runCore$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$withAutoQualityPreference$2$runCore$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<ClosedRange<com.bilibili.player.tangram.basic.a>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PCSFacadeImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PCSFacadeImpl pCSFacadeImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pCSFacadeImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(ClosedRange<com.bilibili.player.tangram.basic.a> closedRange, Continuation<? super Unit> continuation) {
            return create(closedRange, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ClosedRange closedRange = (ClosedRange) this.L$0;
            if (com.bilibili.player.tangram.basic.a.b(((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a, 0)) {
                BLog.i("PCSFacadeImpl$withAutoQualityPreference$2$runCore$1$1-invokeSuspend", "[tangram-player-core-PCSFacadeImpl$withAutoQualityPreference$2$runCore$1$1-invokeSuspend] Auto quality range is lower, skip.");
                return Unit.INSTANCE;
            }
            defpackage.a.b("[tangram-player-core-PCSFacadeImpl$withAutoQualityPreference$2$runCore$1$1-invokeSuspend] ", "Auto quality range:" + closedRange, "PCSFacadeImpl$withAutoQualityPreference$2$runCore$1$1-invokeSuspend");
            AbrParamsInterface.setScreenRatio(((QualityScene) this.this$0.f79387d.h.invoke()).ordinal());
            this.this$0.f79384a.setDashAuto(true, ((com.bilibili.player.tangram.basic.a) closedRange.getStart()).f79320a, ((com.bilibili.player.tangram.basic.a) closedRange.getEndInclusive()).f79320a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSFacadeImpl$withAutoQualityPreference$2$runCore$1(PCSFacadeImpl pCSFacadeImpl, Continuation<? super PCSFacadeImpl$withAutoQualityPreference$2$runCore$1> continuation) {
        super(2, continuation);
        this.this$0 = pCSFacadeImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSFacadeImpl$withAutoQualityPreference$2$runCore$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PCSFacadeImpl pCSFacadeImpl = this.this$0;
            StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> stateFlow = pCSFacadeImpl.f79387d.f79347c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pCSFacadeImpl, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
