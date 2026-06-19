package com.bilibili.ship.theseus.united.player.charge;

import com.bilibili.app.producers.ability.l0;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$special$$inlined$flatMapLatest$1.class */
public final class TheseusChargeToastService$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends FullPromptBarVo, ? extends Duration>>, Pair<? extends FullPromptBarVo, ? extends Duration>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final TheseusChargeToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusChargeToastService$special$$inlined$flatMapLatest$1(Continuation continuation, TheseusChargeToastService theseusChargeToastService) {
        super(3, continuation);
        this.this$0 = theseusChargeToastService;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super Pair<? extends FullPromptBarVo, ? extends Duration>>) obj, (Pair<? extends FullPromptBarVo, ? extends Duration>) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super Pair<? extends FullPromptBarVo, ? extends Duration>> flowCollector, Pair<? extends FullPromptBarVo, ? extends Duration> pair, Continuation<? super Unit> continuation) {
        TheseusChargeToastService$special$$inlined$flatMapLatest$1 theseusChargeToastService$special$$inlined$flatMapLatest$1 = new TheseusChargeToastService$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        theseusChargeToastService$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        theseusChargeToastService$special$$inlined$flatMapLatest$1.L$1 = pair;
        return theseusChargeToastService$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
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
                final long j7 = ((Duration) pair.component2()).unbox-impl();
                String str = Duration.toString-impl(fullPromptBarVo.f102382d);
                String str2 = Duration.toString-impl(j7);
                String str3 = this.this$0.f104402g.a().f123881c;
                StringBuilder sbA = l0.a("data timerCountdown ", str, ", countdownEnable ");
                O4.a.d(", duration ", str2, ", fromSpmid ", sbA, fullPromptBarVo.f102383e);
                sbA.append(str3);
                defpackage.a.b("[theseus-united-TheseusChargeToastService$special$$inlined$flatMapLatest$1-invokeSuspend] ", sbA.toString(), "TheseusChargeToastService$special$$inlined$flatMapLatest$1-invokeSuspend");
                final Flow<Duration> flowJ = this.this$0.f104399d.J();
                final TheseusChargeToastService theseusChargeToastService = this.this$0;
                flowFlowOf = new Flow<Pair<? extends FullPromptBarVo, ? extends Duration>>(flowJ, theseusChargeToastService, j7, fullPromptBarVo, pair) { // from class: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$_init_$lambda$1$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f104403a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final TheseusChargeToastService f104404b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final long f104405c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final FullPromptBarVo f104406d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final Pair f104407e;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$_init_$lambda$1$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$_init_$lambda$1$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f104408a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final TheseusChargeToastService f104409b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final long f104410c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final FullPromptBarVo f104411d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final Pair f104412e;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$_init_$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$_init_$lambda$1$$inlined$map$1$2$1.class */
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

                        public AnonymousClass2(FlowCollector flowCollector, TheseusChargeToastService theseusChargeToastService, long j7, FullPromptBarVo fullPromptBarVo, Pair pair) {
                            this.f104408a = flowCollector;
                            this.f104409b = theseusChargeToastService;
                            this.f104410c = j7;
                            this.f104411d = fullPromptBarVo;
                            this.f104412e = pair;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
                            /*
                                Method dump skipped, instruction units count: 250
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$_init_$lambda$1$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f104403a = flowJ;
                        this.f104404b = theseusChargeToastService;
                        this.f104405c = j7;
                        this.f104406d = fullPromptBarVo;
                        this.f104407e = pair;
                    }

                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        Object objCollect = this.f104403a.collect(new AnonymousClass2(flowCollector2, this.f104404b, this.f104405c, this.f104406d, this.f104407e), continuation);
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
