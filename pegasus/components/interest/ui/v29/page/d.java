package com.bilibili.pegasus.components.interest.ui.v29.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV29FirstTab f76543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76544b;

    public /* synthetic */ d(InterestChooseV29FirstTab interestChooseV29FirstTab, InterestChoose interestChoose) {
        this.f76543a = interestChooseV29FirstTab;
        this.f76544b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV29FirstTab interestChooseV29FirstTab = this.f76543a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV29FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV29FirstTab$initRv$3$1(interestChooseV29FirstTab, obj, this.f76544b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
