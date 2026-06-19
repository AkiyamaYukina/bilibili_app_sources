package com.bilibili.pegasus.components.interestv2.host;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/l.class */
@StabilityInferred(parameters = 1)
public final class l {
    public static fd1.g a(InterestChooseItem interestChooseItem) {
        boolean z6;
        long id = interestChooseItem.getId();
        String name = interestChooseItem.getName();
        String tip = interestChooseItem.getTip();
        String desc = interestChooseItem.getDesc();
        String icon = interestChooseItem.getIcon();
        int subType = interestChooseItem.getSubType();
        List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
        List<InterestChooseSubItem> listEmptyList = subItems;
        if (subItems == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<InterestChooseSubItem> list = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            z6 = true;
            if (!it.hasNext()) {
                break;
            }
            fd1.h hVarB = b((InterestChooseSubItem) it.next());
            fd1.h hVarA = hVarB;
            if (hVarB.g) {
                hVarA = fd1.h.a(hVarB, true);
            }
            arrayList.add(hVarA);
        }
        boolean zIsSelected = interestChooseItem.isSelected();
        if (interestChooseItem.getDefaultSelected() != 1) {
            z6 = false;
        }
        return new fd1.g(id, name, tip, desc, icon, subType, arrayList, zIsSelected, z6, interestChooseItem.getListPosition(), interestChooseItem.getHasReported(), interestChooseItem.getMaxSubitemsShowCount(), 4096);
    }

    public static fd1.h b(InterestChooseSubItem interestChooseSubItem) {
        return new fd1.h(interestChooseSubItem.i(), interestChooseSubItem.d(), interestChooseSubItem.h(), interestChooseSubItem.j(), interestChooseSubItem.c(), interestChooseSubItem.f77422g, interestChooseSubItem.b() == 1);
    }
}
