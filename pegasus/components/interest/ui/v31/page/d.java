package com.bilibili.pegasus.components.interest.ui.v31.page;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV31FirstTab f76613a;

    public /* synthetic */ d(InterestChooseV31FirstTab interestChooseV31FirstTab) {
        this.f76613a = interestChooseV31FirstTab;
    }

    public final Object invoke(Object obj) {
        InterestChooseV31FirstTab interestChooseV31FirstTab = this.f76613a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV31FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV31FirstTab$initRv$3$1(interestChooseV31FirstTab, (Fo0.c) obj, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
