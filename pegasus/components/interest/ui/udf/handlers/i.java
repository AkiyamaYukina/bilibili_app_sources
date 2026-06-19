package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/i.class */
public final class i {
    public static final Map a(Map map, String... strArr) {
        Set set = ArraysKt.toSet(strArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getValue();
            if ((charSequence != null && !StringsKt.isBlank(charSequence)) || !set.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
