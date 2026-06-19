package com.bilibili.pegasus.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.data.base.PegasusResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/request/j.class */
@StabilityInferred(parameters = 1)
public final class j implements k {
    @Override // com.bilibili.pegasus.request.k
    @NotNull
    public final PegasusResponse a(@NotNull PegasusResponse pegasusResponse) {
        List<PegasusHolderData> items = pegasusResponse.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it = items.iterator();
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (!it.hasNext()) {
                return PegasusResponse.copy$default(pegasusResponse, arrayList, null, null, 6, null);
            }
            Object next = it.next();
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PegasusHolderData pegasusHolderData = (PegasusHolderData) next;
            pegasusHolderData.getExtra().setIndexInResponse(i9);
            arrayList.add(pegasusHolderData);
            i7 = i9;
        }
    }
}
