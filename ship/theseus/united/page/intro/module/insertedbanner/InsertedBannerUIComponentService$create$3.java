package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.b;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService$create$3.class */
public final class InsertedBannerUIComponentService$create$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final b.a $vm;
    int label;
    final InsertedBannerUIComponentService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBannerUIComponentService$create$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService$create$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final b.a $vm;
        private Object L$0;
        int label;
        final InsertedBannerUIComponentService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBannerUIComponentService$create$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService$create$3$1$1.class */
        public static final class C10001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final b.a $vm;
            int label;
            final InsertedBannerUIComponentService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBannerUIComponentService$create$3$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/InsertedBannerUIComponentService$create$3$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b.a f100164a;

                public a(b.a aVar) {
                    this.f100164a = aVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    b.a aVar = this.f100164a;
                    if (iIntValue != aVar.f100171c) {
                        aVar.f100171c = iIntValue;
                        aVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10001(InsertedBannerUIComponentService insertedBannerUIComponentService, b.a aVar, Continuation<? super C10001> continuation) {
                super(2, continuation);
                this.this$0 = insertedBannerUIComponentService;
                this.$vm = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10001(this.this$0, this.$vm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f100160f.f100020a;
                    a aVar = new a(this.$vm);
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
        public AnonymousClass1(InsertedBannerUIComponentService insertedBannerUIComponentService, b.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = insertedBannerUIComponentService;
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C10001(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsertedBannerUIComponentService$create$3(InsertedBannerUIComponentService insertedBannerUIComponentService, b.a aVar, Continuation<? super InsertedBannerUIComponentService$create$3> continuation) {
        super(1, continuation);
        this.this$0 = insertedBannerUIComponentService;
        this.$vm = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new InsertedBannerUIComponentService$create$3(this.this$0, this.$vm, continuation);
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
