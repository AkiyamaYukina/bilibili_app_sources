package com.bilibili.ship.theseus.ogv.tabpage;

import com.bilibili.ship.theseus.ogv.tabpage.ThirdTabUIComponent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1.class */
final class ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Flow<Boolean> $selectedFlow;
    final ThirdTabUIComponent.a $vm;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.tabpage.ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Flow<Boolean> $selectedFlow;
        final ThirdTabUIComponent.a $vm;
        private Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.tabpage.ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1$1$1.class */
        public static final class C07451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Flow<Boolean> $selectedFlow;
            final ThirdTabUIComponent.a $vm;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.tabpage.ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1$1$1$1.class */
            public static final class C07461 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final ThirdTabUIComponent.a $vm;
                boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07461(ThirdTabUIComponent.a aVar, Continuation<? super C07461> continuation) {
                    super(2, continuation);
                    this.$vm = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07461 c07461 = new C07461(this.$vm, continuation);
                    c07461.Z$0 = ((Boolean) obj).booleanValue();
                    return c07461;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z6 = this.Z$0;
                    ThirdTabUIComponent.a aVar = this.$vm;
                    if (z6 != aVar.h) {
                        aVar.h = z6;
                        aVar.notifyPropertyChanged(550);
                    }
                    ThirdTabUIComponent.ResType resType = z6 ? aVar.f94564c : aVar.f94563b;
                    if (!Intrinsics.areEqual(resType, aVar.f94568g)) {
                        aVar.f94568g = resType;
                        aVar.notifyPropertyChanged(143);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07451(Flow<Boolean> flow, ThirdTabUIComponent.a aVar, Continuation<? super C07451> continuation) {
                super(2, continuation);
                this.$selectedFlow = flow;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07451(this.$selectedFlow, this.$vm, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Boolean> flow = this.$selectedFlow;
                    C07461 c07461 = new C07461(this.$vm, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow, c07461, this) == coroutine_suspended) {
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
        public AnonymousClass1(Flow<Boolean> flow, ThirdTabUIComponent.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$selectedFlow = flow;
            this.$vm = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectedFlow, this.$vm, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C07451(this.$selectedFlow, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1(Flow<Boolean> flow, ThirdTabUIComponent.a aVar, Continuation<? super ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1> continuation) {
        super(1, continuation);
        this.$selectedFlow = flow;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ActivityTabProvider$activityTabMapper$1$1$newTabUIComponent$1(this.$selectedFlow, this.$vm, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$selectedFlow, this.$vm, null);
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
