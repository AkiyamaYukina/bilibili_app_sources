package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import kntr.base.account.KAccountStoreKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/PageUiService$komponent$1$2.class */
final class PageUiService$komponent$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final KomponentScope<Unit> $this_Komponent;
    final Toaster $toaster;
    final MutableState<s> $uiState$delegate;
    int label;
    final B this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/PageUiService$komponent$1$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KomponentScope<Unit> f67619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f67620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MutableState<s> f67621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Toaster f67622d;

        public a(KomponentScope<? super Unit> komponentScope, B b7, MutableState<s> mutableState, Toaster toaster) {
            this.f67619a = komponentScope;
            this.f67620b = b7;
            this.f67621c = mutableState;
            this.f67622d = toaster;
        }

        public final Object emit(Object obj, Continuation continuation) {
            B.a(this.f67619a, this.f67620b, this.f67621c, this.f67622d);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageUiService$komponent$1$2(KomponentScope<? super Unit> komponentScope, B b7, MutableState<s> mutableState, Toaster toaster, Continuation<? super PageUiService$komponent$1$2> continuation) {
        super(2, continuation);
        this.$this_Komponent = komponentScope;
        this.this$0 = b7;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageUiService$komponent$1$2(this.$this_Komponent, this.this$0, this.$uiState$delegate, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDrop = FlowKt.drop(KAccountStoreKt.getAccountHolder().getState(), 1);
            a aVar = new a(this.$this_Komponent, this.this$0, this.$uiState$delegate, this.$toaster);
            this.label = 1;
            if (flowDrop.collect(aVar, this) == coroutine_suspended) {
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
