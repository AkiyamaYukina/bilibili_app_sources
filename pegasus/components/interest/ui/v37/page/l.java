package com.bilibili.pegasus.components.interest.ui.v37.page;

import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/l.class */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterestChooseV37ThirdTab f76899a;

    public final Object invoke(Object obj, Object obj2) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List<InterestChooseSubItem> subItems;
        InterestChooseSubItem interestChooseSubItem;
        List<InterestChooseItem> listU2;
        InterestChooseItem interestChooseItem2;
        List list;
        List mutableList;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        this.f76899a.getClass();
        InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
        if (interestChooseV37PageViewModel != null && (stateFlow = interestChooseV37PageViewModel.f76903d) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null && (listU = interestChoose.u()) != null && (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, iIntValue)) != null && (subItems = interestChooseItem.getSubItems()) != null && (interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, iIntValue2)) != null) {
            int size = 0;
            for (InterestChooseItem interestChooseItem3 : listU) {
                if (interestChooseItem3.getId() == interestChooseItem.getId()) {
                    break;
                }
                if (interestChooseItem3.isSelected()) {
                    List<InterestChooseSubItem> subItems2 = interestChooseItem3.getSubItems();
                    size += subItems2 != null ? subItems2.size() : 0;
                }
            }
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            long id = interestChooseItem.getId();
            String name = interestChooseItem.getName();
            String str = name;
            if (name == null) {
                str = "";
            }
            com.bilibili.pegasus.components.interest.e.n(iD, jO, id, str, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), size + interestChooseSubItem.f77423i + 1, !interestChooseSubItem.f77422g, null, 1536);
            InterestChooseV37PageViewModel interestChooseV37PageViewModel2 = j.f76896a;
            if (interestChooseV37PageViewModel2 != null) {
                MutableStateFlow<InterestChoose> mutableStateFlow = interestChooseV37PageViewModel2.f76902c;
                InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
                if (interestChoose2 != null && (listU2 = interestChoose2.u()) != null && (interestChooseItem2 = (InterestChooseItem) CollectionsKt.getOrNull(listU2, iIntValue)) != null) {
                    InterestChoose interestChoose3 = (InterestChoose) mutableStateFlow.getValue();
                    InterestChoose interestChooseA = null;
                    if (interestChoose3 != null) {
                        List mutableList2 = CollectionsKt.toMutableList(listU2);
                        List<InterestChooseSubItem> subItems3 = interestChooseItem2.getSubItems();
                        InterestChooseSubItem interestChooseSubItem2 = subItems3 != null ? (InterestChooseSubItem) CollectionsKt.getOrNull(subItems3, iIntValue2) : null;
                        List<InterestChooseSubItem> subItems4 = interestChooseItem2.getSubItems();
                        if (subItems4 == null || (mutableList = CollectionsKt.toMutableList(subItems4)) == null) {
                            list = null;
                        } else {
                            if (interestChooseSubItem2 != null) {
                                mutableList.set(iIntValue2, InterestChooseSubItem.a(interestChooseSubItem2, !interestChooseSubItem2.f77422g, 0, 447));
                            }
                            list = mutableList;
                        }
                        mutableList2.set(interestChooseItem2.getOriginPos(), InterestChooseItem.copy$default(interestChooseItem2, 0L, null, null, null, null, 0, null, null, list, 0, 0, false, 0, false, 0, 32511, null));
                        Unit unit = Unit.INSTANCE;
                        interestChooseA = InterestChoose.a(interestChoose3, mutableList2, null, null, 536870895);
                    }
                    mutableStateFlow.setValue(interestChooseA);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
