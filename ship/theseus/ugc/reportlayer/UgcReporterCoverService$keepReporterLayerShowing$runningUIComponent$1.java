package com.bilibili.ship.theseus.ugc.reportlayer;

import com.bilibili.ship.theseus.ugc.reportlayer.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1.class */
final class UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final a.C0925a $vm;
    int label;
    final UgcReporterCoverService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.C0925a $vm;
        private Object L$0;
        int label;
        final UgcReporterCoverService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1$1.class */
        public static final class C09231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final a.C0925a $vm;
            int label;
            final UgcReporterCoverService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1$1$1.class */
            public static final class C09241 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
                final a.C0925a $vm;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09241(a.C0925a c0925a, Continuation<? super C09241> continuation) {
                    super(2, continuation);
                    this.$vm = c0925a;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C09241 c09241 = new C09241(this.$vm, continuation);
                    c09241.L$0 = obj;
                    return c09241;
                }

                public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c.a aVar = (c.a) this.L$0;
                    a.C0925a c0925a = this.$vm;
                    boolean z6 = aVar.f102988b;
                    if (z6 != c0925a.f98487d) {
                        c0925a.f98487d = z6;
                        c0925a.notifyPropertyChanged(289);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09231(UgcReporterCoverService ugcReporterCoverService, a.C0925a c0925a, Continuation<? super C09231> continuation) {
                super(2, continuation);
                this.this$0 = ugcReporterCoverService;
                this.$vm = c0925a;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09231(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowC = this.this$0.h.c();
                    C09241 c09241 = new C09241(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowC, c09241, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.reportlayer.UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/reportlayer/UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final UgcReporterCoverService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(UgcReporterCoverService ugcReporterCoverService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ugcReporterCoverService;
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
                try {
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.f98469b.h("reporterLayerSuppressor");
                        UgcReporterCoverService ugcReporterCoverService = this.this$0;
                        ugcReporterCoverService.f98476j.addHeadsetEventObserver(ugcReporterCoverService.f98480n);
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    this.this$0.f98469b.i("reporterLayerSuppressor");
                    UgcReporterCoverService ugcReporterCoverService2 = this.this$0;
                    ugcReporterCoverService2.f98476j.removeHeadsetEventObserver(ugcReporterCoverService2.f98480n);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcReporterCoverService ugcReporterCoverService, a.C0925a c0925a, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcReporterCoverService;
            this.$vm = c0925a;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09231(this.this$0, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1(UgcReporterCoverService ugcReporterCoverService, a.C0925a c0925a, Continuation<? super UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcReporterCoverService;
        this.$vm = c0925a;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcReporterCoverService$keepReporterLayerShowing$runningUIComponent$1(this.this$0, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$vm, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
