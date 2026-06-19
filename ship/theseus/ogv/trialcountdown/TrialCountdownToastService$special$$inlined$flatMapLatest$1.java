package com.bilibili.ship.theseus.ogv.trialcountdown;

import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$special$$inlined$flatMapLatest$1.class */
public final class TrialCountdownToastService$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends FullPromptBarVo, ? extends Duration>>, Pair<? extends FullPromptBarVo, ? extends Duration>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final TrialCountdownToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrialCountdownToastService$special$$inlined$flatMapLatest$1(Continuation continuation, TrialCountdownToastService trialCountdownToastService) {
        super(3, continuation);
        this.this$0 = trialCountdownToastService;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super Pair<? extends FullPromptBarVo, ? extends Duration>>) obj, (Pair<? extends FullPromptBarVo, ? extends Duration>) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super Pair<? extends FullPromptBarVo, ? extends Duration>> flowCollector, Pair<? extends FullPromptBarVo, ? extends Duration> pair, Continuation<? super Unit> continuation) {
        TrialCountdownToastService$special$$inlined$flatMapLatest$1 trialCountdownToastService$special$$inlined$flatMapLatest$1 = new TrialCountdownToastService$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        trialCountdownToastService$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        trialCountdownToastService$special$$inlined$flatMapLatest$1.L$1 = pair;
        return trialCountdownToastService$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<Pair<? extends FullPromptBarVo, ? extends Duration>> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            final Pair pair = (Pair) this.L$1;
            if (pair == null) {
                flowFlowOf = FlowKt.flowOf((Object) null);
            } else {
                final FullPromptBarVo fullPromptBarVo = (FullPromptBarVo) pair.component1();
                final Duration duration = (Duration) pair.component2();
                final Flow<Duration> flowJ = this.this$0.f94587c.J();
                flowFlowOf = new Flow<Pair<? extends FullPromptBarVo, ? extends Duration>>(flowJ, duration, fullPromptBarVo, pair) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f94592a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Duration f94593b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final FullPromptBarVo f94594c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final Pair f94595d;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f94596a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Duration f94597b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final FullPromptBarVo f94598c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Pair f94599d;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2$1.class */
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

                        public AnonymousClass2(FlowCollector flowCollector, Duration duration, FullPromptBarVo fullPromptBarVo, Pair pair) {
                            this.f94596a = flowCollector;
                            this.f94597b = duration;
                            this.f94598c = fullPromptBarVo;
                            this.f94599d = pair;
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
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r13 = r0
                                r0 = r13
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r13
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r13
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r14 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r13 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r14
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto Lc3
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r14
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                kotlin.time.Duration r0 = (kotlin.time.Duration) r0
                                long r0 = r0.unbox-impl()
                                r11 = r0
                                r0 = r5
                                kotlin.time.Duration r0 = r0.f94597b
                                r6 = r0
                                r0 = r6
                                long r0 = r0.unbox-impl()
                                r1 = r5
                                com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo r1 = r1.f94598c
                                long r1 = r1.f102382d
                                long r0 = kotlin.time.Duration.minus-LRDsOJo(r0, r1)
                                r9 = r0
                                r0 = r11
                                kotlin.time.Duration r0 = kotlin.time.Duration.box-impl(r0)
                                r1 = r6
                                int r0 = r0.compareTo(r1)
                                if (r0 > 0) goto La9
                                r0 = r11
                                kotlin.time.Duration r0 = kotlin.time.Duration.box-impl(r0)
                                r1 = r9
                                kotlin.time.Duration r1 = kotlin.time.Duration.box-impl(r1)
                                int r0 = r0.compareTo(r1)
                                if (r0 < 0) goto La9
                                r0 = r5
                                kotlin.Pair r0 = r0.f94599d
                                r6 = r0
                                goto Lab
                            La9:
                                r0 = 0
                                r6 = r0
                            Lab:
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f94596a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r13
                                if (r0 != r1) goto Lc3
                                r0 = r13
                                return r0
                            Lc3:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$_init_$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f94592a = flowJ;
                        this.f94593b = duration;
                        this.f94594c = fullPromptBarVo;
                        this.f94595d = pair;
                    }

                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = this.f94592a.collect(new AnonymousClass2(flowCollector2, this.f94593b, this.f94594c, this.f94595d), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == coroutine_suspended) {
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
