package com.bilibili.pegasus.components.interest.ui.v28.page;

import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.mall.ui.page.home.plantseeds.viewholder.n;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/k.class */
public final /* synthetic */ class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76536b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f76535a = i7;
        this.f76536b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List<InterestChooseSubItem> subItems;
        InterestChooseSubItem interestChooseSubItem;
        Integer num = (Integer) obj;
        switch (this.f76535a) {
            case 0:
                int iIntValue = num.intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ((InterestChooseV28SecondTab) this.f76536b).getClass();
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
                if (interestChooseV27PageViewModel != null && (stateFlow = interestChooseV27PageViewModel.f76495b) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null && (listU = interestChoose.u()) != null && (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, iIntValue)) != null && (subItems = interestChooseItem.getSubItems()) != null && (interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, iIntValue2)) != null) {
                    com.bilibili.pegasus.components.interest.e.o(interestChooseItem, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), interestChooseSubItem.f77423i + 1, interestChoose.D(), interestChoose.O(), null, false, 896);
                }
                break;
            default:
                ((n) this.f76536b).D0(num, (Map) obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
