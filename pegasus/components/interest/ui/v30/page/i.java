package com.bilibili.pegasus.components.interest.ui.v30.page;

import android.view.View;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/i.class */
public final /* synthetic */ class i implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
        if (interestChooseV30PageViewModel != null) {
            interestChooseV30PageViewModel.f76586g.setValue(0);
        }
    }
}
