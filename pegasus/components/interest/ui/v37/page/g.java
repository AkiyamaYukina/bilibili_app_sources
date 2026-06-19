package com.bilibili.pegasus.components.interest.ui.v37.page;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageType;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/g.class */
public final /* synthetic */ class g implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        InterestChooseV37PageViewModel interestChooseV37PageViewModel;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        if (i7 != 4 || keyEvent.getAction() != 1 || (interestChooseV37PageViewModel = j.f76896a) == null || (stateFlow = interestChooseV37PageViewModel.f76901b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
            return false;
        }
        com.bilibili.pegasus.components.interest.e.e(interestChoose.D(), interestChoose.O(), InterestPageCloseReason.GESTURE, InterestPageType.INFO, interestChoose.B());
        return false;
    }
}
