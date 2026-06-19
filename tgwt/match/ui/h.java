package com.bilibili.tgwt.match.ui;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/match/ui/h.class */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TogetherWatchMatchFragment f111512a;

    public /* synthetic */ h(TogetherWatchMatchFragment togetherWatchMatchFragment) {
        this.f111512a = togetherWatchMatchFragment;
    }

    public final Object invoke() {
        TogetherWatchMatchFragment togetherWatchMatchFragment = this.f111512a;
        JD0.d dVar = togetherWatchMatchFragment.f111478b;
        JD0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar2 = null;
        }
        if (true != dVar2.h) {
            dVar2.h = true;
            dVar2.notifyPropertyChanged(266);
        }
        JD0.d dVar3 = togetherWatchMatchFragment.f111478b;
        JD0.d dVar4 = dVar3;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVm");
            dVar4 = null;
        }
        dVar4.n(togetherWatchMatchFragment.getString(2131836288));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(togetherWatchMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchMatchFragment$onFateMatchClick$1$1(togetherWatchMatchFragment, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
