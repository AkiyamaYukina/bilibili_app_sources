package com.bilibili.pegasus.components.interest.ui.v30.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV30FirstTab f76575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterestChoose f76576b;

    public /* synthetic */ f(InterestChooseV30FirstTab interestChooseV30FirstTab, InterestChoose interestChoose) {
        this.f76575a = interestChooseV30FirstTab;
        this.f76576b = interestChoose;
    }

    public final Object invoke(Object obj) {
        InterestChooseV30FirstTab interestChooseV30FirstTab = this.f76575a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV30FirstTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV30FirstTab$initRv$2$1(interestChooseV30FirstTab, obj, this.f76576b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
