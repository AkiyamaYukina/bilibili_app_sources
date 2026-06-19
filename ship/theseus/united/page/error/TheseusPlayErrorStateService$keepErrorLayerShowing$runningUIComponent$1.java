package com.bilibili.ship.theseus.united.page.error;

import com.bilibili.ship.theseus.united.page.error.e;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1.class */
final class TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final e.a $vm;
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final e.a $vm;
        private Object L$0;
        int label;
        final j this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$1.class */
        public static final class C09821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final e.a $vm;
            int label;
            final j this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$1$1.class */
            public static final class C09831 extends SuspendLambda implements Function3<a.C1102a, Integer, Continuation<? super Integer>, Object> {
                int I$0;
                Object L$0;
                int label;

                public C09831(Continuation<? super C09831> continuation) {
                    super(3, continuation);
                }

                public final Object invoke(a.C1102a c1102a, int i7, Continuation<? super Integer> continuation) {
                    C09831 c09831 = new C09831(continuation);
                    c09831.L$0 = c1102a;
                    c09831.I$0 = i7;
                    return c09831.invokeSuspend(Unit.INSTANCE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((a.C1102a) obj, ((Number) obj2).intValue(), (Continuation<? super Integer>) obj3);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    a.C1102a c1102a = (a.C1102a) this.L$0;
                    return Boxing.boxInt(c1102a.f102352b + this.I$0);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$1$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                final e.a $vm;
                int I$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e.a aVar, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$vm, continuation);
                    anonymousClass2.I$0 = ((Number) obj).intValue();
                    return anonymousClass2;
                }

                public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                    return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i7 = this.I$0;
                    e.a aVar = this.$vm;
                    if (i7 != aVar.f99612m) {
                        aVar.f99612m = i7;
                        aVar.notifyPropertyChanged(694);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09821(j jVar, e.a aVar, Continuation<? super C09821> continuation) {
                super(2, continuation);
                this.this$0 = jVar;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09821(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowCombine = FlowKt.combine(this.this$0.f99636g.g(), this.this$0.h.f102255f, new C09831(null));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final e.a $vm;
            int label;
            final j this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1$1$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e.a f99584a;

                public a(e.a aVar) {
                    this.f99584a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    boolean z6 = ((c.a) obj).f102988b;
                    e.a aVar = this.f99584a;
                    if (z6 != aVar.f99602b) {
                        aVar.f99602b = z6;
                        aVar.notifyPropertyChanged(289);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(j jVar, e.a aVar, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = jVar;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowC = this.this$0.f99632c.c();
                    a aVar = new a(this.$vm);
                    this.label = 1;
                    if (stateFlowC.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(j jVar, e.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$vm = aVar;
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09821(this.this$0, this.$vm, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1(j jVar, e.a aVar, Continuation<? super TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = jVar;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayErrorStateService$keepErrorLayerShowing$runningUIComponent$1(this.this$0, this.$vm, continuation);
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
