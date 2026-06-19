package com.bilibili.ogv.rank.part;

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
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$1$2.class */
final class CreatePartKomponentImpl$invoke$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<com.bilibili.ogv.rank.api.a> $currentPageDataFlow;
    final String $oid;
    final String $rankId;
    final KomponentScope<B> $this_Komponent;
    final Toaster $toaster;
    final MutableState<r> $uiState$delegate;
    int label;
    final l this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$1$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KomponentScope<B> f72014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f72015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f72017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MutableState<r> f72018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MutableStateFlow<com.bilibili.ogv.rank.api.a> f72019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Toaster f72020g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(KomponentScope<? super B> komponentScope, l lVar, String str, String str2, MutableState<r> mutableState, MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow, Toaster toaster) {
            this.f72014a = komponentScope;
            this.f72015b = lVar;
            this.f72016c = str;
            this.f72017d = str2;
            this.f72018e = mutableState;
            this.f72019f = mutableStateFlow;
            this.f72020g = toaster;
        }

        public final Object emit(Object obj, Continuation continuation) {
            l.a(this.f72014a, this.f72015b, this.f72016c, this.f72017d, this.f72018e, this.f72019f, this.f72020g);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreatePartKomponentImpl$invoke$1$2(KomponentScope<? super B> komponentScope, l lVar, String str, String str2, MutableState<r> mutableState, MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow, Toaster toaster, Continuation<? super CreatePartKomponentImpl$invoke$1$2> continuation) {
        super(2, continuation);
        this.$this_Komponent = komponentScope;
        this.this$0 = lVar;
        this.$oid = str;
        this.$rankId = str2;
        this.$uiState$delegate = mutableState;
        this.$currentPageDataFlow = mutableStateFlow;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatePartKomponentImpl$invoke$1$2(this.$this_Komponent, this.this$0, this.$oid, this.$rankId, this.$uiState$delegate, this.$currentPageDataFlow, this.$toaster, continuation);
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
            a aVar = new a(this.$this_Komponent, this.this$0, this.$oid, this.$rankId, this.$uiState$delegate, this.$currentPageDataFlow, this.$toaster);
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
