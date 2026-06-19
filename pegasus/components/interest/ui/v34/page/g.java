package com.bilibili.pegasus.components.interest.ui.v34.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/g.class */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV34FirstTab f76776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76777b;

    public /* synthetic */ g(InterestChooseV34FirstTab interestChooseV34FirstTab, InterestChoose interestChoose) {
        this.f76776a = interestChooseV34FirstTab;
        this.f76777b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV34FirstTab interestChooseV34FirstTab = this.f76776a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV34FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV34FirstTab$initRv$3$1(interestChooseV34FirstTab, obj, this.f76777b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
