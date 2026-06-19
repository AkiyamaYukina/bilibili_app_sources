package com.bilibili.pegasus.components.interest.ui.v27.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/e.class */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV27FirstTab f76485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76486b;

    public /* synthetic */ e(InterestChooseV27FirstTab interestChooseV27FirstTab, InterestChoose interestChoose) {
        this.f76485a = interestChooseV27FirstTab;
        this.f76486b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV27FirstTab interestChooseV27FirstTab = this.f76485a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV27FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV27FirstTab$initRv$3$1(interestChooseV27FirstTab, obj, this.f76486b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
