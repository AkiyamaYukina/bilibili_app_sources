package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createHeadline$1.class */
public final class UgcHeadlineService$createHeadline$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<Integer> $containerWidthFlow;
    int label;
    final UgcHeadlineService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createHeadline$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createHeadline$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<Integer> $containerWidthFlow;
        private Object L$0;
        int label;
        final UgcHeadlineService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createHeadline$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createHeadline$1$1$1.class */
        public static final class C08541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<Integer> $containerWidthFlow;
            private Object L$0;
            int label;
            final UgcHeadlineService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineService$createHeadline$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineService$createHeadline$1$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CoroutineScope f97264a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MutableStateFlow<Integer> f97265b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final UgcHeadlineService f97266c;

                public a(CoroutineScope coroutineScope, MutableStateFlow<Integer> mutableStateFlow, UgcHeadlineService ugcHeadlineService) {
                    this.f97264a = coroutineScope;
                    this.f97265b = mutableStateFlow;
                    this.f97266c = ugcHeadlineService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    Unit unit;
                    WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
                    if (CoroutineScopeKt.isActive(this.f97264a)) {
                        this.f97265b.setValue(Boxing.boxInt(this.f97266c.f97248l.f() ? 375 : windowSizeClass.getMinWidthDp()));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08541(UgcHeadlineService ugcHeadlineService, MutableStateFlow<Integer> mutableStateFlow, Continuation<? super C08541> continuation) {
                super(2, continuation);
                this.this$0 = ugcHeadlineService;
                this.$containerWidthFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08541 c08541 = new C08541(this.this$0, this.$containerWidthFlow, continuation);
                c08541.L$0 = obj;
                return c08541;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    UgcHeadlineService ugcHeadlineService = this.this$0;
                    StateFlow<WindowSizeClass> stateFlow = ugcHeadlineService.f97248l.f102939c;
                    a aVar = new a(coroutineScope, this.$containerWidthFlow, ugcHeadlineService);
                    this.label = 1;
                    if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(UgcHeadlineService ugcHeadlineService, MutableStateFlow<Integer> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcHeadlineService;
            this.$containerWidthFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$containerWidthFlow, continuation);
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C08541(this.this$0, this.$containerWidthFlow, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcHeadlineService$createHeadline$1(UgcHeadlineService ugcHeadlineService, MutableStateFlow<Integer> mutableStateFlow, Continuation<? super UgcHeadlineService$createHeadline$1> continuation) {
        super(1, continuation);
        this.this$0 = ugcHeadlineService;
        this.$containerWidthFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UgcHeadlineService$createHeadline$1(this.this$0, this.$containerWidthFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$containerWidthFlow, null);
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
