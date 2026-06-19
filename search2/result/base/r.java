package com.bilibili.search2.result.base;

import com.bilibili.search2.api.BaseSearchItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/r.class */
public final class r {
    public static final void a(List list) {
        Iterator it = list.iterator();
        while (true) {
            int i7 = 0;
            while (it.hasNext()) {
                BaseSearchItem baseSearchItem = (BaseSearchItem) it.next();
                if (baseSearchItem instanceof com.bilibili.search2.api.d) {
                    ((com.bilibili.search2.api.d) baseSearchItem).f86319k = i7;
                    i7++;
                }
            }
            return;
        }
    }
}
