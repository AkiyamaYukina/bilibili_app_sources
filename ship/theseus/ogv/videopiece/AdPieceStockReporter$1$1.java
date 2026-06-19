package com.bilibili.ship.theseus.ogv.videopiece;

import com.bapis.bilibili.playershared.FragmentVideoInfo;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.ship.theseus.keel.player.q;
import com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$1$1.class */
public final class AdPieceStockReporter$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<FragmentVideoInfo> $preList;
    final SourceContent $sc;
    int label;
    final AdPieceStockReporter this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$1$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<q<?>, Continuation<? super Flow<? extends Duration>>, Object> {
        Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(q<?> qVar, Continuation<? super Flow<Duration>> continuation) {
            return create(qVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((q) this.L$0).f91144e.J();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$1$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdPieceStockReporter f94782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<FragmentVideoInfo> f94783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SourceContent f94784c;

        public a(AdPieceStockReporter adPieceStockReporter, List<FragmentVideoInfo> list, SourceContent sourceContent) {
            this.f94782a = adPieceStockReporter;
            this.f94783b = list;
            this.f94784c = sourceContent;
        }

        public final Object emit(Object obj, Continuation continuation) {
            ((Duration) obj).unbox-impl();
            AdPieceStockReporter adPieceStockReporter = this.f94782a;
            AdPieceStockReporter.a aVar = adPieceStockReporter.f94776b;
            if (!aVar.f94794a) {
                aVar.f94794a = true;
                AdPieceStockReporter.a(adPieceStockReporter, (FragmentVideoInfo) CollectionsKt.firstOrNull(this.f94783b), this.f94784c);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPieceStockReporter$1$1(AdPieceStockReporter adPieceStockReporter, List<FragmentVideoInfo> list, SourceContent sourceContent, Continuation<? super AdPieceStockReporter$1$1> continuation) {
        super(2, continuation);
        this.this$0 = adPieceStockReporter;
        this.$preList = list;
        this.$sc = sourceContent;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdPieceStockReporter$1$1(this.this$0, this.$preList, this.$sc, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f94779e.f103682a);
            Flow flowFlatMapConcat = FlowKt.flatMapConcat(new Flow<q<?>>(flowFilterNotNull) { // from class: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f94785a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f94786a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videopiece/AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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
                        this.f94786a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r9 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L85
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            com.bilibili.ship.theseus.keel.player.q r0 = (com.bilibili.ship.theseus.keel.player.q) r0
                            int r0 = r0.f91140a
                            if (r0 != 0) goto L85
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f94786a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto L85
                            r0 = r10
                            return r0
                        L85:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.videopiece.AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f94785a = flowFilterNotNull;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f94785a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new AnonymousClass2(null));
            AdPieceStockReporter adPieceStockReporter = this.this$0;
            a aVar = new a(adPieceStockReporter, this.$preList, this.$sc);
            this.label = 1;
            Object objCollect = flowFlatMapConcat.collect(new AdPieceStockReporter$1$1$invokeSuspend$$inlined$filter$2$2(aVar, adPieceStockReporter), this);
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
