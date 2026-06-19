package com.bilibili.lib.stagger.internal;

import com.bilibili.lib.stagger.internal.KStaggerAdapter;
import d41.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mf0.InterfaceC7988c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$subscribeAll$1.class */
final class KStaggerAdapter$subscribeAll$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $bizType;
    final InterfaceC7988c.InterfaceC1323c $subscriber;
    int label;
    final KStaggerAdapter this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$subscribeAll$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KStaggerAdapter f64478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC7988c.InterfaceC1323c f64479b;

        public a(KStaggerAdapter kStaggerAdapter, InterfaceC7988c.InterfaceC1323c interfaceC1323c) {
            this.f64478a = kStaggerAdapter;
            this.f64479b = interfaceC1323c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            h.b bVar = (d41.h) obj;
            this.f64478a.getClass();
            boolean z6 = bVar instanceof h.b;
            InterfaceC7988c.InterfaceC1323c interfaceC1323c = this.f64479b;
            if (z6) {
                interfaceC1323c.a(new KStaggerAdapter.KMPResource(bVar.a));
            } else {
                if (!(bVar instanceof h.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                d41.e eVar = ((h.a) bVar).b;
                interfaceC1323c.b(new InterfaceC7988c.a(eVar.a, eVar.b));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KStaggerAdapter$subscribeAll$1(KStaggerAdapter kStaggerAdapter, String str, InterfaceC7988c.InterfaceC1323c interfaceC1323c, Continuation<? super KStaggerAdapter$subscribeAll$1> continuation) {
        super(2, continuation);
        this.this$0 = kStaggerAdapter;
        this.$bizType = str;
        this.$subscriber = interfaceC1323c;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KStaggerAdapter$subscribeAll$1(this.this$0, this.$bizType, this.$subscriber, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.getClass();
            Flow flowI = d41.d.b.a.i();
            String str = this.$bizType;
            a aVar = new a(this.this$0, this.$subscriber);
            this.label = 1;
            Object objCollect = flowI.collect(new KStaggerAdapter$subscribeAll$1$invokeSuspend$$inlined$filter$1$2(aVar, str), this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
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
