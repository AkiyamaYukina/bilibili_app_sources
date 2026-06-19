package com.bilibili.pegasus.components.interest.ui.v32.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseSubItemUi;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/m.class */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV32ThirdTab f76689a;

    public final Object invoke(Object obj, Object obj2) {
        InterestChooseV32ThirdTab interestChooseV32ThirdTab = this.f76689a;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(interestChooseV32ThirdTab.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV32ThirdTab$initRv$2$1(interestChooseV32ThirdTab, (InterestChooseItemUi) obj, (InterestChooseSubItemUi) obj2, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
