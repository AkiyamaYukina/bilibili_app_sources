package com.bilibili.pegasus.components.interest.ui.v32.page;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV32FirstTab f76681a;

    public /* synthetic */ g(InterestChooseV32FirstTab interestChooseV32FirstTab) {
        this.f76681a = interestChooseV32FirstTab;
    }

    public final Object invoke(Object obj) {
        InterestChooseV32FirstTab interestChooseV32FirstTab = this.f76681a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV32FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32FirstTab$initRv$3$1(interestChooseV32FirstTab, (Fo0.c) obj, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
