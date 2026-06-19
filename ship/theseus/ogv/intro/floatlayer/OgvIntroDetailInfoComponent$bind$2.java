package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvIntroDetailInfoComponent$bind$2.class */
final class OgvIntroDetailInfoComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final s this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvIntroDetailInfoComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvIntroDetailInfoComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final s this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvIntroDetailInfoComponent$bind$2$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvIntroDetailInfoComponent$bind$2$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s f92824a;

            public a(s sVar) {
                this.f92824a = sVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                int iIntValue = ((Number) obj).intValue();
                for (androidx.databinding.f fVar : this.f92824a.h.f92949a) {
                    if (fVar instanceof com.bilibili.ship.theseus.ogv.intro.floatlayer.a) {
                        ((com.bilibili.ship.theseus.ogv.intro.floatlayer.a) fVar).d(iIntValue);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(s sVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                s sVar = this.this$0;
                StateFlow<Integer> stateFlow = sVar.f92971c;
                a aVar = new a(sVar);
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
    public OgvIntroDetailInfoComponent$bind$2(s sVar, Continuation<? super OgvIntroDetailInfoComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = sVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvIntroDetailInfoComponent$bind$2 ogvIntroDetailInfoComponent$bind$2 = new OgvIntroDetailInfoComponent$bind$2(this.this$0, continuation);
        ogvIntroDetailInfoComponent$bind$2.L$0 = obj;
        return ogvIntroDetailInfoComponent$bind$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
    }
}
