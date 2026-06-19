package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$1$1.class */
final class CreatePartKomponentImpl$invoke$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<com.bilibili.ogv.rank.api.a> $currentPageDataFlow;
    final CompletableDeferred<Unit> $hasEverRendered;
    final String $oid;
    final String $rankId;
    final KomponentScope<B> $this_Komponent;
    final Toaster $toaster;
    final MutableState<r> $uiState$delegate;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreatePartKomponentImpl$invoke$1$1(CompletableDeferred<Unit> completableDeferred, KomponentScope<? super B> komponentScope, l lVar, String str, String str2, MutableState<r> mutableState, MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow, Toaster toaster, Continuation<? super CreatePartKomponentImpl$invoke$1$1> continuation) {
        super(2, continuation);
        this.$hasEverRendered = completableDeferred;
        this.$this_Komponent = komponentScope;
        this.this$0 = lVar;
        this.$oid = str;
        this.$rankId = str2;
        this.$uiState$delegate = mutableState;
        this.$currentPageDataFlow = mutableStateFlow;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatePartKomponentImpl$invoke$1$1(this.$hasEverRendered, this.$this_Komponent, this.this$0, this.$oid, this.$rankId, this.$uiState$delegate, this.$currentPageDataFlow, this.$toaster, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CompletableDeferred<Unit> completableDeferred = this.$hasEverRendered;
            this.label = 1;
            if (completableDeferred.await(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        l.a(this.$this_Komponent, this.this$0, this.$oid, this.$rankId, this.$uiState$delegate, this.$currentPageDataFlow, this.$toaster);
        return Unit.INSTANCE;
    }
}
