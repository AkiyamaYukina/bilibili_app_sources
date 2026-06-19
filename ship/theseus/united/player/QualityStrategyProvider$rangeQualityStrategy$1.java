package com.bilibili.ship.theseus.united.player;

import com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange;
import com.bilibili.app.gemini.base.resolver.qn.QualityScene;
import com.bilibili.player.tangram.playercore.F;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$1.class */
public final class QualityStrategyProvider$rangeQualityStrategy$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<AutoQualityRange> $autoQualityRange;
    final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $autoQualityRangeFlow;
    final Ref.BooleanRef $hasFullscreen;
    final f $mediaPlayInitial;
    final com.bilibili.ship.theseus.united.page.playingarea.a $playingContainerSizeRepo;
    final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $rangeForInitialQualityWhenAutoFlow;
    final com.bilibili.ship.theseus.united.page.screenstate.c $screenStateRepo;
    final boolean $sharingIgnoreAuto;
    final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $specialQualityHalfRangeFlow;
    final float $videoRatio;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<c.a, a.C1102a, Continuation<? super Pair<? extends c.a, ? extends a.C1102a>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(c.a aVar, a.C1102a c1102a, Continuation<? super Pair<c.a, a.C1102a>> continuation) {
            return QualityStrategyProvider$rangeQualityStrategy$1.invokeSuspend$lambda$0(aVar, c1102a, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends c.a, ? extends a.C1102a>, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<AutoQualityRange> $autoQualityRange;
        final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $autoQualityRangeFlow;
        final Ref.BooleanRef $hasFullscreen;
        final f $mediaPlayInitial;
        final com.bilibili.ship.theseus.united.page.playingarea.a $playingContainerSizeRepo;
        final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $rangeForInitialQualityWhenAutoFlow;
        final com.bilibili.ship.theseus.united.page.screenstate.c $screenStateRepo;
        final boolean $sharingIgnoreAuto;
        final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $specialQualityHalfRangeFlow;
        final float $videoRatio;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Ref.ObjectRef<AutoQualityRange> objectRef, Ref.BooleanRef booleanRef, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow2, boolean z6, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow3, com.bilibili.ship.theseus.united.page.playingarea.a aVar, com.bilibili.ship.theseus.united.page.screenstate.c cVar, float f7, f fVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$autoQualityRange = objectRef;
            this.$hasFullscreen = booleanRef;
            this.$autoQualityRangeFlow = mutableStateFlow;
            this.$specialQualityHalfRangeFlow = mutableStateFlow2;
            this.$sharingIgnoreAuto = z6;
            this.$rangeForInitialQualityWhenAutoFlow = mutableStateFlow3;
            this.$playingContainerSizeRepo = aVar;
            this.$screenStateRepo = cVar;
            this.$videoRatio = f7;
            this.$mediaPlayInitial = fVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$autoQualityRange, this.$hasFullscreen, this.$autoQualityRangeFlow, this.$specialQualityHalfRangeFlow, this.$sharingIgnoreAuto, this.$rangeForInitialQualityWhenAutoFlow, this.$playingContainerSizeRepo, this.$screenStateRepo, this.$videoRatio, this.$mediaPlayInitial, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<c.a, a.C1102a> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            c.a aVar = (c.a) pair.component1();
            a.C1102a c1102a = (a.C1102a) pair.component2();
            boolean z6 = aVar.f102988b;
            int i7 = c1102a.f102351a;
            Object obj2 = this.$autoQualityRange.element;
            StringBuilder sbA = cf.e.a(i7, "fullScreen:", " width:", " height:", z6);
            sbA.append(c1102a.f102352b);
            sbA.append(" autoQualityRange:");
            sbA.append(obj2);
            BLog.i("QualityStrategyProvider$rangeQualityStrategy$1$4-invokeSuspend", "[theseus-united-QualityStrategyProvider$rangeQualityStrategy$1$4-invokeSuspend] " + sbA.toString());
            boolean zB = QualityStrategyProvider.b();
            boolean z7 = aVar.f102988b;
            if (zB) {
                if (z7) {
                    this.$hasFullscreen.element = true;
                }
                QualityStrategyProvider.g(this.$sharingIgnoreAuto, this.$specialQualityHalfRangeFlow, this.$autoQualityRangeFlow, this.$hasFullscreen, this.$rangeForInitialQualityWhenAutoFlow, this.$autoQualityRange, this.$playingContainerSizeRepo, this.$screenStateRepo, this.$videoRatio, this.$mediaPlayInitial, false, false);
            } else {
                QualityScene qualitySceneF = QualityStrategyProvider.f(this.$playingContainerSizeRepo, this.$screenStateRepo, this.$autoQualityRange, this.$videoRatio, QualityStrategyProvider.e(this.$playingContainerSizeRepo, this.$videoRatio, c1102a, !z7), 32);
                if (qualitySceneF == QualityScene.HIGH_RATIO) {
                    this.$autoQualityRangeFlow.setValue(QualityStrategyProvider.h(F.c(((AutoQualityRange) this.$autoQualityRange.element).getHighRatio()), this.$mediaPlayInitial, qualitySceneF, (AutoQualityRange) this.$autoQualityRange.element));
                }
                if (z7 && com.bilibili.player.tangram.basic.a.c(((com.bilibili.player.tangram.basic.a) ((ClosedRange) this.$specialQualityHalfRangeFlow.getValue()).getEndInclusive()).f79320a)) {
                    this.$specialQualityHalfRangeFlow.setValue(RangesKt.rangeTo(new com.bilibili.player.tangram.basic.a(Integer.MAX_VALUE), new com.bilibili.player.tangram.basic.a(Integer.MAX_VALUE)));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityStrategyProvider$rangeQualityStrategy$1(com.bilibili.ship.theseus.united.page.screenstate.c cVar, com.bilibili.ship.theseus.united.page.playingarea.a aVar, Ref.ObjectRef<AutoQualityRange> objectRef, Ref.BooleanRef booleanRef, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow2, boolean z6, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow3, float f7, f fVar, Continuation<? super QualityStrategyProvider$rangeQualityStrategy$1> continuation) {
        super(2, continuation);
        this.$screenStateRepo = cVar;
        this.$playingContainerSizeRepo = aVar;
        this.$autoQualityRange = objectRef;
        this.$hasFullscreen = booleanRef;
        this.$autoQualityRangeFlow = mutableStateFlow;
        this.$specialQualityHalfRangeFlow = mutableStateFlow2;
        this.$sharingIgnoreAuto = z6;
        this.$rangeForInitialQualityWhenAutoFlow = mutableStateFlow3;
        this.$videoRatio = f7;
        this.$mediaPlayInitial = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(c.a aVar, a.C1102a c1102a, Continuation continuation) {
        return new Pair(aVar, c1102a);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityStrategyProvider$rangeQualityStrategy$1(this.$screenStateRepo, this.$playingContainerSizeRepo, this.$autoQualityRange, this.$hasFullscreen, this.$autoQualityRangeFlow, this.$specialQualityHalfRangeFlow, this.$sharingIgnoreAuto, this.$rangeForInitialQualityWhenAutoFlow, this.$videoRatio, this.$mediaPlayInitial, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.$screenStateRepo.c(), this.$playingContainerSizeRepo.g(), AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$autoQualityRange, this.$hasFullscreen, this.$autoQualityRangeFlow, this.$specialQualityHalfRangeFlow, this.$sharingIgnoreAuto, this.$rangeForInitialQualityWhenAutoFlow, this.$playingContainerSizeRepo, this.$screenStateRepo, this.$videoRatio, this.$mediaPlayInitial, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
