package com.bilibili.ogv.rank.part;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/CreatePartKomponentImpl$invoke$1$Failure$2$1.class */
final /* synthetic */ class CreatePartKomponentImpl$invoke$1$Failure$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final MutableStateFlow<com.bilibili.ogv.rank.api.a> $currentPageDataFlow;
    final String $oid;
    final String $rankId;
    final KomponentScope<B> $this_Komponent;
    final Toaster $toaster;
    final MutableState<r> $uiState$delegate;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreatePartKomponentImpl$invoke$1$Failure$2$1(KomponentScope<? super B> komponentScope, l lVar, String str, String str2, MutableState<r> mutableState, MutableStateFlow<com.bilibili.ogv.rank.api.a> mutableStateFlow, Toaster toaster) {
        super(0, Intrinsics.Kotlin.class, "refreshData", "invoke$lambda$0$refreshData(Lkntr/common/komponent/KomponentScope;Lcom/bilibili/ogv/rank/part/CreatePartKomponentImpl;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/MutableStateFlow;Lkntr/common/trio/toast/Toaster;)V", 0);
        this.$this_Komponent = komponentScope;
        this.this$0 = lVar;
        this.$oid = str;
        this.$rankId = str2;
        this.$uiState$delegate = mutableState;
        this.$currentPageDataFlow = mutableStateFlow;
        this.$toaster = toaster;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7655invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7655invoke() {
        l.a(this.$this_Komponent, this.this$0, this.$oid, this.$rankId, this.$uiState$delegate, this.$currentPageDataFlow, this.$toaster);
    }
}
