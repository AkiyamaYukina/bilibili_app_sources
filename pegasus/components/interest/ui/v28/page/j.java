package com.bilibili.pegasus.components.interest.ui.v28.page;

import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/j.class */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV28SecondTab f76534a;

    public final Object invoke(Object obj, Object obj2) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List<InterestChooseSubItem> subItems;
        InterestChooseSubItem interestChooseSubItem;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        this.f76534a.getClass();
        InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
        if (interestChooseV27PageViewModel != null && (stateFlow = interestChooseV27PageViewModel.f76495b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null && (listU = interestChoose.u()) != null && (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, iIntValue)) != null && (subItems = interestChooseItem.getSubItems()) != null && (interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, iIntValue2)) != null) {
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            long id = interestChooseItem.getId();
            String name = interestChooseItem.getName();
            String str = name;
            if (name == null) {
                str = "";
            }
            com.bilibili.pegasus.components.interest.e.n(iD, jO, id, str, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), interestChooseSubItem.f77423i + 1, !interestChooseSubItem.f77422g, null, 1536);
            InterestChooseV27PageViewModel interestChooseV27PageViewModel2 = e.f76528a;
            if (interestChooseV27PageViewModel2 != null) {
                interestChooseV27PageViewModel2.f(iIntValue, iIntValue2);
            }
        }
        return Unit.INSTANCE;
    }
}
