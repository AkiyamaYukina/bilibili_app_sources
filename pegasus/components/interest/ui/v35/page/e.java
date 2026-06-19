package com.bilibili.pegasus.components.interest.ui.v35.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/e.class */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV35FirstTab f76805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76806b;

    public /* synthetic */ e(InterestChooseV35FirstTab interestChooseV35FirstTab, InterestChoose interestChoose) {
        this.f76805a = interestChooseV35FirstTab;
        this.f76806b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV35FirstTab interestChooseV35FirstTab = this.f76805a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV35FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV35FirstTab$initRv$2$1(interestChooseV35FirstTab, obj, this.f76806b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
