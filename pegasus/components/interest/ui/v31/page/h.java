package com.bilibili.pegasus.components.interest.ui.v31.page;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/h.class */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV31SecondTab f76619a;

    public /* synthetic */ h(InterestChooseV31SecondTab interestChooseV31SecondTab) {
        this.f76619a = interestChooseV31SecondTab;
    }

    public final Object invoke(Object obj) {
        InterestChooseV31SecondTab interestChooseV31SecondTab = this.f76619a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV31SecondTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV31SecondTab$initRv$3$1(interestChooseV31SecondTab, (Fo0.j) obj, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
