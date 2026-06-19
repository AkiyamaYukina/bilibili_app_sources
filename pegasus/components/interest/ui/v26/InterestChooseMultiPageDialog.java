package com.bilibili.pegasus.components.interest.ui.v26;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import aq0.C4872l0;
import com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubSection;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageDialog.class */
@StabilityInferred(parameters = 0)
public final class InterestChooseMultiPageDialog extends BaseInterestChooseDialog {

    @Nullable
    public C4872l0 h;

    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, androidx.fragment.app.DialogFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageDialog.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C4872l0 c4872l0Inflate = C4872l0.inflate(layoutInflater);
        this.h = c4872l0Inflate;
        return c4872l0Inflate != null ? c4872l0Inflate.f54084a : null;
    }

    @Override // com.bilibili.pegasus.components.interest.ui.BaseInterestChooseDialog, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        l.f76461a = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialogInterface) {
        String str;
        String strP;
        List<InterestChooseItem> listU;
        String strP2;
        List<InterestChooseItem> listU2;
        StateFlow<InterestChoose> stateFlow;
        super.onDismiss(dialogInterface);
        InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
        InterestChoose interestChoose = (interestChooseMultiPageViewModel == null || (stateFlow = interestChooseMultiPageViewModel.f76436b) == null) ? null : (InterestChoose) stateFlow.getValue();
        if (interestChoose == null) {
            m8033if();
            return;
        }
        com.bilibili.pegasus.components.interest.m mVar = this.f76372b;
        if (mVar != null) {
            boolean z6 = this.f76376f;
            long jO = interestChoose.O();
            InterestChooseMultiPageViewModel interestChooseMultiPageViewModel2 = l.f76461a;
            if (interestChooseMultiPageViewModel2 != null) {
                InterestChoose interestChoose2 = (InterestChoose) interestChooseMultiPageViewModel2.f76436b.getValue();
                if (interestChoose2 == null || (listU2 = interestChoose2.u()) == null) {
                    strP2 = null;
                } else {
                    int iIntValue = ((Number) interestChooseMultiPageViewModel2.f76437c.getValue()).intValue();
                    ArrayList arrayList = new ArrayList();
                    List<InterestChooseItem> list = listU2;
                    ArrayList<InterestChooseItem> arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        if (((InterestChooseItem) obj).isSelected()) {
                            arrayList2.add(obj);
                        }
                    }
                    for (InterestChooseItem interestChooseItem : arrayList2) {
                        if (iIntValue == 0) {
                            arrayList.add(String.valueOf(interestChooseItem.getId()));
                        } else {
                            List<InterestChooseSubSection> subSections = interestChooseItem.getSubSections();
                            if (subSections != null) {
                                Iterator<T> it = subSections.iterator();
                                while (it.hasNext()) {
                                    List<InterestChooseSubItem> subItems = ((InterestChooseSubSection) it.next()).getSubItems();
                                    if (subItems != null) {
                                        List<InterestChooseSubItem> list2 = subItems;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj2 : list2) {
                                            if (((InterestChooseSubItem) obj2).f77422g) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        Iterator it2 = arrayList3.iterator();
                                        while (it2.hasNext()) {
                                            V0.f.b(interestChooseItem.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it2.next()).i(), arrayList);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    strP2 = CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                }
                str = strP2;
            } else {
                str = null;
            }
            InterestChooseMultiPageViewModel interestChooseMultiPageViewModel3 = l.f76461a;
            if (interestChooseMultiPageViewModel3 != null) {
                InterestChoose interestChoose3 = (InterestChoose) interestChooseMultiPageViewModel3.f76436b.getValue();
                if (interestChoose3 == null || (listU = interestChoose3.u()) == null) {
                    strP = "";
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (InterestChooseItem interestChooseItem2 : listU) {
                        List<InterestChooseSubSection> subSections2 = interestChooseItem2.getSubSections();
                        if (subSections2 != null) {
                            Iterator<T> it3 = subSections2.iterator();
                            while (it3.hasNext()) {
                                List<InterestChooseSubItem> subItems2 = ((InterestChooseSubSection) it3.next()).getSubItems();
                                if (subItems2 != null) {
                                    Iterator<T> it4 = subItems2.iterator();
                                    while (it4.hasNext()) {
                                        V0.f.b(interestChooseItem2.getId(), UtilsKt.DOT, ((InterestChooseSubItem) it4.next()).i(), arrayList4);
                                    }
                                }
                            }
                        }
                    }
                    strP = CollectionsKt.p(arrayList4, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62);
                }
            } else {
                strP = null;
            }
            mVar.a(z6, new kp0.f(jO, null, strP, null, null, str, false, 90));
        }
        if (this.f76375e) {
            com.bilibili.pegasus.components.interest.e.f(this.f76373c, interestChoose.O(), interestChoose.D(), false, 16);
        }
        m8033if();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
