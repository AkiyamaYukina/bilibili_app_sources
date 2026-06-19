package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import fu0.C7178E;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePriceWeakenPublisherComponent$bind$2.class */
public final class CheesePriceWeakenPublisherComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final C7178E $binding;
    private Object L$0;
    int label;
    final CheesePriceWeakenPublisherComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePriceWeakenPublisherComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C7178E $binding;
        int label;
        final CheesePriceWeakenPublisherComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.publisher.CheesePriceWeakenPublisherComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePriceWeakenPublisherComponent$bind$2$1$1.class */
        public static final class C06221 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final C7178E $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06221(C7178E c7178e, Continuation<? super C06221> continuation) {
                super(2, continuation);
                this.$binding = c7178e;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06221 c06221 = new C06221(this.$binding, continuation);
                c06221.I$0 = ((Number) obj).intValue();
                return c06221;
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
                ConstraintLayout constraintLayout = this.$binding.f119427b;
                constraintLayout.setPaddingRelative(DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingTop(), DimenUtilsKt.dpToPx(i7), constraintLayout.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePriceWeakenPublisherComponent cheesePriceWeakenPublisherComponent, C7178E c7178e, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheesePriceWeakenPublisherComponent;
            this.$binding = c7178e;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f89811a.f89863b;
                C06221 c06221 = new C06221(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06221, this) == coroutine_suspended) {
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
    public CheesePriceWeakenPublisherComponent$bind$2(CheesePriceWeakenPublisherComponent cheesePriceWeakenPublisherComponent, C7178E c7178e, Continuation<? super CheesePriceWeakenPublisherComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = cheesePriceWeakenPublisherComponent;
        this.$binding = c7178e;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePriceWeakenPublisherComponent$bind$2 cheesePriceWeakenPublisherComponent$bind$2 = new CheesePriceWeakenPublisherComponent$bind$2(this.this$0, this.$binding, continuation);
        cheesePriceWeakenPublisherComponent$bind$2.L$0 = obj;
        return cheesePriceWeakenPublisherComponent$bind$2;
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
        return BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$binding, null), 3, (Object) null);
    }
}
