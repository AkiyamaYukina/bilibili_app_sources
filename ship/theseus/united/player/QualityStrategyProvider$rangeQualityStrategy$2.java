package com.bilibili.ship.theseus.united.player;

import com.bilibili.app.gemini.base.resolver.qn.AutoQualityRange;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$2.class */
public final class QualityStrategyProvider$rangeQualityStrategy$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<AutoQualityRange> $autoQualityRange;
    final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $autoQualityRangeFlow;
    final Ref.BooleanRef $hasFullscreen;
    final f $mediaPlayInitial;
    final com.bilibili.ship.theseus.united.page.playingarea.a $playingContainerSizeRepo;
    final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $rangeForInitialQualityWhenAutoFlow;
    final com.bilibili.ship.theseus.united.page.screenstate.c $screenStateRepo;
    final boolean $sharingIgnoreAuto;
    final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> $specialQualityHalfRangeFlow;
    final h $theseusKeelPlayer;
    final float $videoRatio;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> f104309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> f104311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.BooleanRef f104312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> f104313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Ref.ObjectRef<AutoQualityRange> f104314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final com.bilibili.ship.theseus.united.page.playingarea.a f104315g;
        public final com.bilibili.ship.theseus.united.page.screenstate.c h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f104316i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final f f104317j;

        public a(MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow, boolean z6, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow2, Ref.BooleanRef booleanRef, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow3, Ref.ObjectRef<AutoQualityRange> objectRef, com.bilibili.ship.theseus.united.page.playingarea.a aVar, com.bilibili.ship.theseus.united.page.screenstate.c cVar, float f7, f fVar) {
            this.f104309a = mutableStateFlow;
            this.f104310b = z6;
            this.f104311c = mutableStateFlow2;
            this.f104312d = booleanRef;
            this.f104313e = mutableStateFlow3;
            this.f104314f = objectRef;
            this.f104315g = aVar;
            this.h = cVar;
            this.f104316i = f7;
            this.f104317j = fVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            ((Boolean) obj).getClass();
            if (QualityStrategyProvider.b()) {
                QualityStrategyProvider.g(this.f104310b, this.f104311c, this.f104309a, this.f104312d, this.f104313e, this.f104314f, this.f104315g, this.h, this.f104316i, this.f104317j, false, false);
            } else {
                this.f104309a.setValue(QualityStrategyProvider.d(this.f104314f, this.f104315g, this.h, this.f104316i, this.f104317j, null, 96));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityStrategyProvider$rangeQualityStrategy$2(h hVar, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow, boolean z6, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow2, Ref.BooleanRef booleanRef, MutableStateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> mutableStateFlow3, Ref.ObjectRef<AutoQualityRange> objectRef, com.bilibili.ship.theseus.united.page.playingarea.a aVar, com.bilibili.ship.theseus.united.page.screenstate.c cVar, float f7, f fVar, Continuation<? super QualityStrategyProvider$rangeQualityStrategy$2> continuation) {
        super(2, continuation);
        this.$theseusKeelPlayer = hVar;
        this.$autoQualityRangeFlow = mutableStateFlow;
        this.$sharingIgnoreAuto = z6;
        this.$specialQualityHalfRangeFlow = mutableStateFlow2;
        this.$hasFullscreen = booleanRef;
        this.$rangeForInitialQualityWhenAutoFlow = mutableStateFlow3;
        this.$autoQualityRange = objectRef;
        this.$playingContainerSizeRepo = aVar;
        this.$screenStateRepo = cVar;
        this.$videoRatio = f7;
        this.$mediaPlayInitial = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QualityStrategyProvider$rangeQualityStrategy$2(this.$theseusKeelPlayer, this.$autoQualityRangeFlow, this.$sharingIgnoreAuto, this.$specialQualityHalfRangeFlow, this.$hasFullscreen, this.$rangeForInitialQualityWhenAutoFlow, this.$autoQualityRange, this.$playingContainerSizeRepo, this.$screenStateRepo, this.$videoRatio, this.$mediaPlayInitial, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final MutableStateFlow<com.bilibili.player.tangram.basic.c> mutableStateFlow = this.$theseusKeelPlayer.f91109c.f79294a;
            Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(new Flow<Boolean>(mutableStateFlow) { // from class: com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f104319a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f104320a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        Object result;
                        final AnonymousClass2 this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                            super(continuation);
                            this.this$0 = anonymousClass2;
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f104320a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            r0 = r7
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            r9 = r0
                            r0 = r9
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            r1 = -2147483648(0xffffffff80000000, float:-0.0)
                            r0 = r0 & r1
                            if (r0 == 0) goto L29
                            r0 = r9
                            r1 = r8
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            int r1 = r1 + r2
                            r0.label = r1
                            r0 = r9
                            r7 = r0
                            goto L33
                        L29:
                            com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r10 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r9 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L86
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r10
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            com.bilibili.player.tangram.basic.c r0 = (com.bilibili.player.tangram.basic.c) r0
                            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.c.a
                            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                            r6 = r0
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f104320a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r9
                            if (r0 != r1) goto L86
                            r0 = r9
                            return r0
                        L86:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f104319a = mutableStateFlow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f104319a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }), 1);
            a aVar = new a(this.$autoQualityRangeFlow, this.$sharingIgnoreAuto, this.$specialQualityHalfRangeFlow, this.$hasFullscreen, this.$rangeForInitialQualityWhenAutoFlow, this.$autoQualityRange, this.$playingContainerSizeRepo, this.$screenStateRepo, this.$videoRatio, this.$mediaPlayInitial);
            this.label = 1;
            Object objCollect = flowDrop.collect(new QualityStrategyProvider$rangeQualityStrategy$2$invokeSuspend$$inlined$filter$1$2(aVar), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
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
