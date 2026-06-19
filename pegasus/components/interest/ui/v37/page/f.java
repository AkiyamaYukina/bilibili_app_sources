package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.view.View;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/f.class */
public final /* synthetic */ class f implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
        if (interestChooseV37PageViewModel != null) {
            interestChooseV37PageViewModel.f76909k.tryEmit(Unit.INSTANCE);
        }
    }
}
