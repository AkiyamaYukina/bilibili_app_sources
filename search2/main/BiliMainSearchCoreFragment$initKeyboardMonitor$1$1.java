package com.bilibili.search2.main;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initKeyboardMonitor$1$1.class */
final class BiliMainSearchCoreFragment$initKeyboardMonitor$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ws0.d $this_apply;
    int label;
    final BiliMainSearchCoreFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initKeyboardMonitor$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initKeyboardMonitor$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ws0.d $this_apply;
        int label;
        final BiliMainSearchCoreFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchCoreFragment$initKeyboardMonitor$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$initKeyboardMonitor$1$1$1$1.class */
        public static final class C05801 extends SuspendLambda implements Function2<Ws0.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final BiliMainSearchCoreFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05801(BiliMainSearchCoreFragment biliMainSearchCoreFragment, Continuation<? super C05801> continuation) {
                super(2, continuation);
                this.this$0 = biliMainSearchCoreFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05801 c05801 = new C05801(this.this$0, continuation);
                c05801.L$0 = obj;
                return c05801;
            }

            public final Object invoke(Ws0.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Ws0.a aVar = (Ws0.a) this.L$0;
                BLog.i("BiliMainSearchCoreFragment", "keyboard change -> " + aVar);
                this.this$0.lf().f86731d.setValue(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ws0.d dVar, BiliMainSearchCoreFragment biliMainSearchCoreFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_apply = dVar;
            this.this$0 = biliMainSearchCoreFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_apply, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.$this_apply.f27354b);
                C05801 c05801 = new C05801(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, c05801, this) == coroutine_suspended) {
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
    public BiliMainSearchCoreFragment$initKeyboardMonitor$1$1(BiliMainSearchCoreFragment biliMainSearchCoreFragment, Ws0.d dVar, Continuation<? super BiliMainSearchCoreFragment$initKeyboardMonitor$1$1> continuation) {
        super(2, continuation);
        this.this$0 = biliMainSearchCoreFragment;
        this.$this_apply = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliMainSearchCoreFragment$initKeyboardMonitor$1$1(this.this$0, this.$this_apply, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_apply, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
