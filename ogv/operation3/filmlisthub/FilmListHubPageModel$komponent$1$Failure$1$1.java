package com.bilibili.ogv.operation3.filmlisthub;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel$komponent$1$Failure$1$1.class */
final /* synthetic */ class FilmListHubPageModel$komponent$1$Failure$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    final KomponentScope<Unit> $this_Komponent;
    final Toaster $toaster;
    final MutableState<l> $uiState$delegate;
    final FilmListHubPageModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilmListHubPageModel$komponent$1$Failure$1$1(KomponentScope<? super Unit> komponentScope, FilmListHubPageModel filmListHubPageModel, MutableState<l> mutableState, Toaster toaster) {
        super(0, Intrinsics.Kotlin.class, "refreshData", "komponent$lambda$0$refreshData(Lkntr/common/komponent/KomponentScope;Lcom/bilibili/ogv/operation3/filmlisthub/FilmListHubPageModel;Landroidx/compose/runtime/MutableState;Lkntr/common/trio/toast/Toaster;)V", 0);
        this.$this_Komponent = komponentScope;
        this.this$0 = filmListHubPageModel;
        this.$uiState$delegate = mutableState;
        this.$toaster = toaster;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        m7536invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m7536invoke() {
        FilmListHubPageModel.a(this.$this_Komponent, this.this$0, this.$uiState$delegate, this.$toaster);
    }
}
