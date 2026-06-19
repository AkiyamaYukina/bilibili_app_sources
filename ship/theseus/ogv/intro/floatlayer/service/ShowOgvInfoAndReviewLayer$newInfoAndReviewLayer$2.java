package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import com.bilibili.ship.theseus.ogv.intro.floatlayer.uicomponent.c;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2.class */
final class ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final c.b $vm;
    int label;
    final i this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final c.b $vm;
        private Object L$0;
        int label;
        final i this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2$1$1.class */
        public static final class C07001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final c.b $vm;
            int label;
            final i this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2$1$1$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final c.b f92983a;

                public a(c.b bVar) {
                    this.f92983a = bVar;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    int iIntValue = ((Number) obj).intValue();
                    c.b bVar = this.f92983a;
                    if (iIntValue != bVar.f93035k) {
                        bVar.f93035k = iIntValue;
                        bVar.notifyPropertyChanged(285);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07001(i iVar, c.b bVar, Continuation<? super C07001> continuation) {
                super(2, continuation);
                this.this$0 = iVar;
                this.$vm = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07001(this.this$0, this.$vm, continuation);
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
                    StateFlow<Integer> stateFlow = this.this$0.f93010i.f100020a;
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
        public AnonymousClass1(i iVar, c.b bVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = iVar;
            this.$vm = bVar;
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C07001(this.this$0, this.$vm, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2(i iVar, c.b bVar, Continuation<? super ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2> continuation) {
        super(1, continuation);
        this.this$0 = iVar;
        this.$vm = bVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ShowOgvInfoAndReviewLayer$newInfoAndReviewLayer$2(this.this$0, this.$vm, continuation);
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
