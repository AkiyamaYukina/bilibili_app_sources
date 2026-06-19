package com.bilibili.pegasus.components.interest.ui.v28.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV28FirstTab f76529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76530b;

    public /* synthetic */ f(InterestChooseV28FirstTab interestChooseV28FirstTab, InterestChoose interestChoose) {
        this.f76529a = interestChooseV28FirstTab;
        this.f76530b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV28FirstTab interestChooseV28FirstTab = this.f76529a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV28FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV28FirstTab$initRv$2$1(interestChooseV28FirstTab, obj, this.f76530b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
