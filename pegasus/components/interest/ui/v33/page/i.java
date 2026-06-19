package com.bilibili.pegasus.components.interest.ui.v33.page;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/i.class */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f76734b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f76733a = i7;
        this.f76734b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        List<InterestChooseItem> listU;
        InterestChooseItem interestChooseItem;
        List<InterestChooseSubItem> subItems;
        InterestChooseSubItem interestChooseSubItem;
        switch (this.f76733a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                ((InterestChooseV33SecondTab) this.f76734b).getClass();
                InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
                if (interestChooseV33PageViewModel != null && (stateFlow = interestChooseV33PageViewModel.h) != null && (interestChoose = (InterestChoose) stateFlow.getValue()) != null && (listU = interestChoose.u()) != null && (interestChooseItem = (InterestChooseItem) CollectionsKt.getOrNull(listU, iIntValue)) != null && (subItems = interestChooseItem.getSubItems()) != null && (interestChooseSubItem = (InterestChooseSubItem) CollectionsKt.getOrNull(subItems, iIntValue2)) != null) {
                    int size = 0;
                    for (InterestChooseItem interestChooseItem2 : listU) {
                        if (interestChooseItem2.getId() == interestChooseItem.getId()) {
                            com.bilibili.pegasus.components.interest.e.o(interestChooseItem, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), size + interestChooseSubItem.f77423i + 1, interestChoose.D(), interestChoose.O(), null, false, 896);
                        } else if (interestChooseItem2.isSelected()) {
                            List<InterestChooseSubItem> subItems2 = interestChooseItem2.getSubItems();
                            size += subItems2 != null ? subItems2.size() : 0;
                        }
                    }
                    com.bilibili.pegasus.components.interest.e.o(interestChooseItem, iIntValue + 1, interestChooseSubItem.j(), interestChooseSubItem.i(), size + interestChooseSubItem.f77423i + 1, interestChoose.D(), interestChoose.O(), null, false, 896);
                }
                break;
            default:
                Composer composer = (Composer) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue3 & 3) != 2, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1755143618, iIntValue3, -1, "com.bilibili.lib.fasthybrid.game.utils.showPopAtBottomCompose.<anonymous>.<anonymous>.<anonymous> (PopupWindowComposeExt.kt:69)");
                    }
                    ((ComposableLambda) this.f76734b).invoke(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
