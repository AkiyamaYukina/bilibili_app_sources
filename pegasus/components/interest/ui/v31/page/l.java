package com.bilibili.pegasus.components.interest.ui.v31.page;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseSubItemUi;
import com.bilibili.pegasus.components.interest.ui.v31.vm.InterestChooseV31PageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/l.class */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV31ThirdTab f76624a;

    public final Object invoke(Object obj, Object obj2) {
        InterestChooseItemUi interestChooseItemUi = (InterestChooseItemUi) obj;
        InterestChooseSubItemUi interestChooseSubItemUi = (InterestChooseSubItemUi) obj2;
        InterestChooseV31PageViewModel interestChooseV31PageViewModelHf = this.f76624a.hf();
        if (interestChooseV31PageViewModelHf != null) {
            interestChooseV31PageViewModelHf.I0(new Actions.a.d(interestChooseItemUi, interestChooseSubItemUi));
        }
        return Unit.INSTANCE;
    }
}
