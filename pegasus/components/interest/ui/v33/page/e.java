package com.bilibili.pegasus.components.interest.ui.v33.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/e.class */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV33FirstTab f76727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76728b;

    public /* synthetic */ e(InterestChooseV33FirstTab interestChooseV33FirstTab, InterestChoose interestChoose) {
        this.f76727a = interestChooseV33FirstTab;
        this.f76728b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV33FirstTab interestChooseV33FirstTab = this.f76727a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV33FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV33FirstTab$initRv$3$1(interestChooseV33FirstTab, obj, this.f76728b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
