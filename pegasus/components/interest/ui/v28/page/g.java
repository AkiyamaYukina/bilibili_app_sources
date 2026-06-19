package com.bilibili.pegasus.components.interest.ui.v28.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV28FirstTab f76531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76532b;

    public /* synthetic */ g(InterestChooseV28FirstTab interestChooseV28FirstTab, InterestChoose interestChoose) {
        this.f76531a = interestChooseV28FirstTab;
        this.f76532b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV28FirstTab interestChooseV28FirstTab = this.f76531a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV28FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV28FirstTab$initRv$3$1(interestChooseV28FirstTab, obj, this.f76532b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
