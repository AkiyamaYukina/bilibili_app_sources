package com.bilibili.pegasus.components.interest.ui.v33.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV33FirstTab f76725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76726b;

    public /* synthetic */ d(InterestChooseV33FirstTab interestChooseV33FirstTab, InterestChoose interestChoose) {
        this.f76725a = interestChooseV33FirstTab;
        this.f76726b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV33FirstTab interestChooseV33FirstTab = this.f76725a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV33FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV33FirstTab$initRv$2$1(interestChooseV33FirstTab, obj, this.f76726b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
