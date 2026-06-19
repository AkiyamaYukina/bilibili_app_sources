package com.bilibili.ogv.operation.entrance.indexpage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryCondition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/f.class */
public final class f implements BangumFilterLayout.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryIndexFragment f70180a;

    public f(CategoryIndexFragment categoryIndexFragment) {
        this.f70180a = categoryIndexFragment;
    }

    @Override // com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout.d
    public final void a(int i7, int i8) {
        List<BangumiCategoryCondition.Item> list;
        CategoryIndexFragment categoryIndexFragment = this.f70180a;
        if (categoryIndexFragment.f70154t) {
            return;
        }
        List<? extends BangumiCategoryCondition.Filter> list2 = categoryIndexFragment.f70156v;
        BangumiCategoryCondition.Filter filter = list2 != null ? list2.get(i7) : null;
        if (filter != null && (list = filter.values) != null) {
            int size = list.size();
            int i9 = 0;
            while (i9 < size) {
                BangumiCategoryCondition.Item item = list.get(i9);
                boolean z6 = i9 == i8;
                item.isSelect = z6;
                if (z6) {
                    categoryIndexFragment.f70157w.put(filter.field, item);
                }
                i9++;
            }
        }
        List<? extends BangumiCategoryCondition.Item> list3 = categoryIndexFragment.f70146l;
        String str = "";
        String str2 = str;
        if (list3 != null) {
            Iterator<T> it = list3.iterator();
            while (true) {
                str2 = str;
                if (!it.hasNext()) {
                    break;
                }
                BangumiCategoryCondition.Item item2 = (BangumiCategoryCondition.Item) it.next();
                if (Intrinsics.areEqual(item2.field, categoryIndexFragment.f70147m)) {
                    str = item2.name;
                }
            }
        }
        String strJf = CategoryIndexFragment.jf(categoryIndexFragment);
        long j7 = categoryIndexFragment.f70149o;
        long j8 = categoryIndexFragment.f70149o;
        HashMap<String, BangumiCategoryCondition.Item> map = categoryIndexFragment.f70157w;
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.put("season_type", String.valueOf(j8));
            map2.put("order", str2);
            map2.put("index_type", String.valueOf(j7));
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                map2.put((String) entry.getKey(), ((BangumiCategoryCondition.Item) entry.getValue()).name);
            }
        }
        Neurons.reportClick(false, strJf, map2);
        GridLayoutManager gridLayoutManager = categoryIndexFragment.f70145k;
        if (gridLayoutManager != null) {
            gridLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        categoryIndexFragment.mf();
    }
}
