package com.bilibili.ship.theseus.ugc.play.schedule;

import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService;
import com.bilibili.ship.theseus.united.widget.TouchAwareConstraintLayout;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2.class */
final class AutoContinuousInterceptService$collectCancelEvent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final AutoContinuousInterceptService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$1$a.class */
        public static final class a implements LifecycleEventObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98143a;

            public a(AutoContinuousInterceptService autoContinuousInterceptService) {
                this.f98143a = autoContinuousInterceptService;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_PAUSE) {
                    this.f98143a.f98131t.tryEmit(CancelFrom.BACKGROUND);
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$1$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$1$b.class */
        public static final class b implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98144a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a f98145b;

            public b(AutoContinuousInterceptService autoContinuousInterceptService, a aVar) {
                this.f98144a = autoContinuousInterceptService;
                this.f98145b = aVar;
            }

            public final void invoke() {
                this.f98144a.f98124m.removeObserver(this.f98145b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.lib.coroutineextension.j bVar;
            com.bilibili.lib.coroutineextension.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                a aVar = new a(autoContinuousInterceptService);
                autoContinuousInterceptService.f98124m.addObserver(aVar);
                bVar = new b(autoContinuousInterceptService, aVar);
                try {
                    this.L$0 = bVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = jVar2;
                } catch (Throwable th2) {
                    bVar = jVar;
                    th = th2;
                    bVar.invoke();
                    throw th;
                }
            }
            com.bilibili.lib.coroutineextension.j jVar3 = bVar;
            jVar = bVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                if (this.Z$0) {
                    this.this$0.f98131t.tryEmit(CancelFrom.PLAYER_COLLAPSED);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
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
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                StateFlow<Boolean> stateFlow = autoContinuousInterceptService.f98118f.f102266r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AutoContinuousInterceptService.b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final AutoContinuousInterceptService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$3$1$a.class */
            public static final class a implements Function1<MotionEvent, Boolean> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Ref.FloatRef f98146a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.FloatRef f98147b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final AutoContinuousInterceptService f98148c;

                public a(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, AutoContinuousInterceptService autoContinuousInterceptService) {
                    this.f98146a = floatRef;
                    this.f98147b = floatRef2;
                    this.f98148c = autoContinuousInterceptService;
                }

                public final Object invoke(Object obj) {
                    MotionEvent motionEvent = (MotionEvent) obj;
                    Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
                    Ref.FloatRef floatRef = this.f98146a;
                    if (numValueOf != null && numValueOf.intValue() == 0) {
                        floatRef.element = motionEvent.getY();
                    }
                    if (numValueOf != null && numValueOf.intValue() == 2) {
                        Ref.FloatRef floatRef2 = this.f98147b;
                        float fAbs = Math.abs(motionEvent.getY() - floatRef.element) + floatRef2.element;
                        floatRef2.element = fAbs;
                        if (fAbs > ((Number) com.bilibili.ship.theseus.ugc.play.schedule.b.f98175b.getValue()).intValue()) {
                            this.f98148c.f98131t.tryEmit(CancelFrom.INTERACTION);
                        }
                    }
                    return Boolean.FALSE;
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$3$1$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$3$1$b.class */
            public static final class b implements com.bilibili.lib.coroutineextension.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TouchAwareConstraintLayout f98149a;

                public b(TouchAwareConstraintLayout touchAwareConstraintLayout) {
                    this.f98149a = touchAwareConstraintLayout;
                }

                public final void invoke() {
                    this.f98149a.setTouchEventInterceptor(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = autoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(AutoContinuousInterceptService.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                com.bilibili.lib.coroutineextension.j bVar;
                com.bilibili.lib.coroutineextension.j jVar;
                Throwable th;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AutoContinuousInterceptService.b bVar2 = (AutoContinuousInterceptService.b) this.L$0;
                    if (bVar2 == null) {
                        return Unit.INSTANCE;
                    }
                    a aVar = new a(new Ref.FloatRef(), new Ref.FloatRef(), this.this$0);
                    TouchAwareConstraintLayout touchAwareConstraintLayout = bVar2.f98142a;
                    touchAwareConstraintLayout.setTouchEventInterceptor(aVar);
                    bVar = new b(touchAwareConstraintLayout);
                    try {
                        this.L$0 = bVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        jVar = bVar;
                        th = th2;
                        jVar.invoke();
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
                    jVar = jVar2;
                    try {
                        ResultKt.throwOnFailure(obj);
                        bVar = jVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        jVar.invoke();
                        throw th;
                    }
                }
                com.bilibili.lib.coroutineextension.j jVar3 = bVar;
                jVar = bVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                Flow<AutoContinuousInterceptService.b> flow = autoContinuousInterceptService.f98126o;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(autoContinuousInterceptService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final AutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService$collectCancelEvent$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/AutoContinuousInterceptService$collectCancelEvent$2$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AutoContinuousInterceptService f98150a;

            public a(AutoContinuousInterceptService autoContinuousInterceptService) {
                this.f98150a = autoContinuousInterceptService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                defpackage.a.b("[theseus-ugc-AutoContinuousInterceptService$collectCancelEvent$2$4$1-emit] ", "cancel from " + ((CancelFrom) obj), "AutoContinuousInterceptService$collectCancelEvent$2$4$1-emit");
                this.f98150a.c();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = autoContinuousInterceptService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                AutoContinuousInterceptService autoContinuousInterceptService = this.this$0;
                MutableSharedFlow<CancelFrom> mutableSharedFlow = autoContinuousInterceptService.f98131t;
                a aVar = new a(autoContinuousInterceptService);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoContinuousInterceptService$collectCancelEvent$2(AutoContinuousInterceptService autoContinuousInterceptService, Continuation<? super AutoContinuousInterceptService$collectCancelEvent$2> continuation) {
        super(2, continuation);
        this.this$0 = autoContinuousInterceptService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoContinuousInterceptService$collectCancelEvent$2 autoContinuousInterceptService$collectCancelEvent$2 = new AutoContinuousInterceptService$collectCancelEvent$2(this.this$0, continuation);
        autoContinuousInterceptService$collectCancelEvent$2.L$0 = obj;
        return autoContinuousInterceptService$collectCancelEvent$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
