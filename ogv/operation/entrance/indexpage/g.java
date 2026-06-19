package com.bilibili.ogv.operation.entrance.indexpage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout;
import com.bilibili.ogv.operation.entrance.indexpage.BangumiCategoryCondition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/g.class */
public final class g implements BangumFilterLayout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategoryIndexFragment f70181a;

    public g(CategoryIndexFragment categoryIndexFragment) {
        this.f70181a = categoryIndexFragment;
    }

    @Override // com.bilibili.ogv.operation.entrance.indexpage.BangumFilterLayout.e
    public final void a(String str) {
        CategoryIndexFragment categoryIndexFragment = this.f70181a;
        categoryIndexFragment.f70147m = str;
        categoryIndexFragment.f70148n = "0";
        List<? extends BangumiCategoryCondition.Item> list = categoryIndexFragment.f70146l;
        String str2 = "";
        String str3 = str2;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                str3 = str2;
                if (!it.hasNext()) {
                    break;
                }
                BangumiCategoryCondition.Item item = (BangumiCategoryCondition.Item) it.next();
                if (Intrinsics.areEqual(item.field, categoryIndexFragment.f70147m)) {
                    str2 = item.name;
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
            map2.put("order", str3);
            map2.put("index_type", String.valueOf(j7));
            for (Map.Entry<String, BangumiCategoryCondition.Item> entry : map.entrySet()) {
                map2.put(entry.getKey(), entry.getValue().name);
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
