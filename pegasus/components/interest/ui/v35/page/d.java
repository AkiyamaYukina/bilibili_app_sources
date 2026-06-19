package com.bilibili.pegasus.components.interest.ui.v35.page;

import android.view.View;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/d.class */
public final /* synthetic */ class d implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
        if (interestChooseV35PageViewModel != null) {
            interestChooseV35PageViewModel.f76823i.tryEmit(new com.bilibili.pegasus.components.interest.ui.common.j(InterestPageType.INFO, InterestPageCloseReason.LEFTUP_RETURN));
        }
    }
}
