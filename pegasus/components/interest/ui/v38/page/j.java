package com.bilibili.pegasus.components.interest.ui.v38.page;

import android.view.View;
import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/j.class */
public final /* synthetic */ class j implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
        if (interestChooseV38PageViewModel != null) {
            interestChooseV38PageViewModel.f76952i.tryEmit(Unit.INSTANCE);
        }
    }
}
