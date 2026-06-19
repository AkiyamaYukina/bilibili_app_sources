package com.bilibili.pegasus.components.interest.ui.v36.page;

import com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/g.class */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV36SecondTab f76854a;

    public final Object invoke(Object obj, Object obj2) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List<InterestChooseSubItem> subItems;
        InterestChooseSubItem interestChooseSubItem;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        this.f76854a.getClass();
        InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
        if (interestChooseV36PageViewModel != null && (stateFlow = interestChooseV36PageViewModel.f76856b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null && (listU = interestChoose.u()) != null && (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, iIntValue)) != null && (subItems = interestChooseItem.getSubItems()) != null && (interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, iIntValue2)) != null) {
            int size = 0;
            for (InterestChooseItem interestChooseItem2 : listU) {
                if (interestChooseItem2.getId() == interestChooseItem.getId()) {
                    break;
                }
                if (interestChooseItem2.isSelected()) {
                    List<InterestChooseSubItem> subItems2 = interestChooseItem2.getSubItems();
                    size += subItems2 != null ? subItems2.size() : 0;
                }
            }
            com.bilibili.pegasus.components.interest.e.o(interestChooseItem, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), size + interestChooseSubItem.f77423i + 1, interestChoose.D(), interestChoose.O(), null, false, 896);
        }
        return Unit.INSTANCE;
    }
}
