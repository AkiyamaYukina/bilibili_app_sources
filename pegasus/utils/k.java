package com.bilibili.pegasus.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.bilibili.bus.IIdentifiedData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/k.class */
@StabilityInferred(parameters = 4)
public abstract class k<T extends IIdentifiedData<ID>, ID> implements Observer<List<? extends T>> {
    public abstract void a(@NotNull Map<ID, ? extends T> map);

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        HashMap map = new HashMap();
        for (IIdentifiedData iIdentifiedData : (List) obj) {
            map.put(iIdentifiedData.getId(), iIdentifiedData);
        }
        a(map);
    }
}
