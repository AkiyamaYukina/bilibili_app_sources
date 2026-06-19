package com.bilibili.pegasus.components.interest.ui.v36.page;

import android.view.View;
import com.bilibili.pegasus.components.interest.ui.common.j;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/d.class */
public final /* synthetic */ class d implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
        if (interestChooseV36PageViewModel != null) {
            interestChooseV36PageViewModel.f76861g.tryEmit(new j(InterestPageType.INTEREST_1ST, InterestPageCloseReason.LEFTUP_RETURN));
        }
    }
}
