package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$1$Failure$1.class */
final /* synthetic */ class PageModel$komponent$1$Failure$1 extends AdaptedFunctionReference implements Function0<Unit> {
    final Ref.ObjectRef<Boolean> $lastIsNormalWindow;
    final Ref.ObjectRef<q91.i> $lastRefreshTime;
    final KomponentScope<a> $this_Komponent;
    final MutableState<p> $uiState$delegate;
    final o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageModel$komponent$1$Failure$1(KomponentScope<? super a> komponentScope, Ref.ObjectRef<q91.i> objectRef, o oVar, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState) {
        super(0, Intrinsics.Kotlin.class, "refreshData", "komponent$lambda$0$refreshData(Lkntr/common/komponent/KomponentScope;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/bilibili/ogv/kmm/operation/page/PageModel;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V", 0);
        this.$this_Komponent = komponentScope;
        this.$lastRefreshTime = objectRef;
        this.this$0 = oVar;
        this.$lastIsNormalWindow = objectRef2;
        this.$uiState$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7325invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7325invoke() {
        o.a(this.$this_Komponent, this.$lastRefreshTime, this.this$0, this.$lastIsNormalWindow, this.$uiState$delegate);
    }
}
