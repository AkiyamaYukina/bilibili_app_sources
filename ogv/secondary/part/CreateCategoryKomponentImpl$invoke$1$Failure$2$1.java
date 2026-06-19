package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl$invoke$1$Failure$2$1.class */
final /* synthetic */ class CreateCategoryKomponentImpl$invoke$1$Failure$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final String $pageName;
    final String $tabId;
    final KomponentScope<Unit> $this_Komponent;
    final Toaster $toaster;
    final MutableState<InterfaceC5531a> $uiState$delegate;
    final CreateCategoryKomponentImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCategoryKomponentImpl$invoke$1$Failure$2$1(KomponentScope<? super Unit> komponentScope, CreateCategoryKomponentImpl createCategoryKomponentImpl, String str, String str2, MutableState<InterfaceC5531a> mutableState, Toaster toaster) {
        super(0, Intrinsics.Kotlin.class, "refreshData", "invoke$lambda$0$refreshData(Lkntr/common/komponent/KomponentScope;Lcom/bilibili/ogv/secondary/part/CreateCategoryKomponentImpl;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkntr/common/trio/toast/Toaster;)V", 0);
        this.$this_Komponent = komponentScope;
        this.this$0 = createCategoryKomponentImpl;
        this.$tabId = str;
        this.$pageName = str2;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7705invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7705invoke() {
        CreateCategoryKomponentImpl.a(this.$this_Komponent, this.this$0, this.$tabId, this.$pageName, this.$uiState$delegate, this.$toaster);
    }
}
