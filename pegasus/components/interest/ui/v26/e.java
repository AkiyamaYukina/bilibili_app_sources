package com.bilibili.pegasus.components.interest.ui.v26;

import android.view.View;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/e.class */
public final /* synthetic */ class e implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
        if (interestChooseMultiPageViewModel != null) {
            interestChooseMultiPageViewModel.f76437c.setValue(0);
        }
    }
}
