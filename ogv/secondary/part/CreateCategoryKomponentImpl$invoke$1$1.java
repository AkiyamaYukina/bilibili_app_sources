package com.bilibili.ogv.secondary.part;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$invoke$1$1.class */
public final class CreateCategoryKomponentImpl$invoke$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CompletableDeferred<Unit> $hasEverRendered;
    final String $pageName;
    final String $tabId;
    final KomponentScope<Unit> $this_Komponent;
    final Toaster $toaster;
    final MutableState<InterfaceC5531a> $uiState$delegate;
    int label;
    final CreateCategoryKomponentImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCategoryKomponentImpl$invoke$1$1(CompletableDeferred<Unit> completableDeferred, KomponentScope<? super Unit> komponentScope, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, MutableState<InterfaceC5531a> mutableState, Toaster toaster, Continuation<? super CreateCategoryKomponentImpl$invoke$1$1> continuation) {
        super(2, continuation);
        this.$hasEverRendered = completableDeferred;
        this.$this_Komponent = komponentScope;
        this.this$0 = createCategoryKomponentImpl;
        this.$tabId = str;
        this.$pageName = str2;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateCategoryKomponentImpl$invoke$1$1(this.$hasEverRendered, this.$this_Komponent, this.this$0, this.$tabId, this.$pageName, this.$uiState$delegate, this.$toaster, continuation);
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
        CreateCategoryKomponentImpl.a(this.$this_Komponent, this.this$0, this.$tabId, this.$pageName, this.$uiState$delegate, this.$toaster);
        return Unit.INSTANCE;
    }
}
