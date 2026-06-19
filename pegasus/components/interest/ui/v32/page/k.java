package com.bilibili.pegasus.components.interest.ui.v32.page;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/k.class */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV32SecondTab f76687a;

    public /* synthetic */ k(InterestChooseV32SecondTab interestChooseV32SecondTab) {
        this.f76687a = interestChooseV32SecondTab;
    }

    public final Object invoke(Object obj) {
        InterestChooseV32SecondTab interestChooseV32SecondTab = this.f76687a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV32SecondTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32SecondTab$initRv$3$1(interestChooseV32SecondTab, (Fo0.j) obj, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
