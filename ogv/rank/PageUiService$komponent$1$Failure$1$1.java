package com.bilibili.ogv.rank;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/PageUiService$komponent$1$Failure$1$1.class */
final /* synthetic */ class PageUiService$komponent$1$Failure$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final KomponentScope<Unit> $this_Komponent;
    final MutableState<T> $uiState$delegate;
    final PageUiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageUiService$komponent$1$Failure$1$1(KomponentScope<? super Unit> komponentScope, PageUiService pageUiService, MutableState<T> mutableState) {
        super(0, Intrinsics.Kotlin.class, "refreshData", "komponent$lambda$0$refreshData(Lkntr/common/komponent/KomponentScope;Lcom/bilibili/ogv/rank/PageUiService;Landroidx/compose/runtime/MutableState;)V", 0);
        this.$this_Komponent = komponentScope;
        this.this$0 = pageUiService;
        this.$uiState$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7640invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7640invoke() {
        PageUiService.a(this.$this_Komponent, this.this$0, this.$uiState$delegate);
    }
}
