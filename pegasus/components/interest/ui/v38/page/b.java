package com.bilibili.pegasus.components.interest.ui.v38.page;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/b.class */
public final /* synthetic */ class b implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        InterestChooseV38PageViewModel interestChooseV38PageViewModel;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        if (i7 != 4 || keyEvent.getAction() != 1 || (interestChooseV38PageViewModel = d.f76936a) == null || (stateFlow = interestChooseV38PageViewModel.f76946b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return false;
        }
        com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), InterestPageCloseReason.GESTURE, InterestPageType.INFO, interestChoose.B());
        return false;
    }
}
