package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/PageUiService$komponent$1$Failure$2$1.class */
final /* synthetic */ class PageUiService$komponent$1$Failure$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final KomponentScope<Unit> $this_Komponent;
    final Toaster $toaster;
    final MutableState<s> $uiState$delegate;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageUiService$komponent$1$Failure$2$1(KomponentScope<? super Unit> komponentScope, B b7, MutableState<s> mutableState, Toaster toaster) {
        super(0, Intrinsics.Kotlin.class, "refreshData", "komponent$lambda$0$refreshData(Lkntr/common/komponent/KomponentScope;Lcom/bilibili/ogv/filmlist/PageUiService;Landroidx/compose/runtime/MutableState;Lkntr/common/trio/toast/Toaster;)V", 0);
        this.$this_Komponent = komponentScope;
        this.this$0 = b7;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7214invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7214invoke() {
        B.a(this.$this_Komponent, this.this$0, this.$uiState$delegate, this.$toaster);
    }
}
