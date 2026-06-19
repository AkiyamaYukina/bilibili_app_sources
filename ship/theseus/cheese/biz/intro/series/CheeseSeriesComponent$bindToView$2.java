package com.bilibili.ship.theseus.cheese.biz.intro.series;

import com.bilibili.app.comm.list.common.utils.CommonExtensionKt;
import com.bilibili.droid.DimenUtilsKt;
import fu0.O;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/CheeseSeriesComponent$bindToView$2.class */
final class CheeseSeriesComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final O $binding;
    private Object L$0;
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.series.CheeseSeriesComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/CheeseSeriesComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final O $binding;
        int label;
        final a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.intro.series.CheeseSeriesComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/CheeseSeriesComponent$bindToView$2$1$1.class */
        public static final class C06361 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final O $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06361(O o7, Continuation<? super C06361> continuation) {
                super(2, continuation);
                this.$binding = o7;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06361 c06361 = new C06361(this.$binding, continuation);
                c06361.I$0 = ((Number) obj).intValue();
                return c06361;
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
                CommonExtensionKt.setMarginLeft(this.$binding.f119482d, DimenUtilsKt.dpToPx(i7));
                CommonExtensionKt.setMarginRight(this.$binding.f119481c, DimenUtilsKt.dpToPx(i7));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, O o7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$binding = o7;
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
                StateFlow<Integer> stateFlow = this.this$0.f90087a.f90097b;
                C06361 c06361 = new C06361(this.$binding, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06361, this) == coroutine_suspended) {
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
    public CheeseSeriesComponent$bindToView$2(a aVar, O o7, Continuation<? super CheeseSeriesComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$binding = o7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseSeriesComponent$bindToView$2 cheeseSeriesComponent$bindToView$2 = new CheeseSeriesComponent$bindToView$2(this.this$0, this.$binding, continuation);
        cheeseSeriesComponent$bindToView$2.L$0 = obj;
        return cheeseSeriesComponent$bindToView$2;
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
