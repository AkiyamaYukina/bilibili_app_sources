package com.bilibili.ogv.operation.entrance.indexpage;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryCondition.class */
@Keep
public class BangumiCategoryCondition {

    @Nullable
    @JSONField(name = "filter")
    public List<Filter> filterList;
    public List<Item> order;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryCondition$Filter.class */
    @Keep
    public static class Filter {
        public String field;
        public String name;

        @Nullable
        @JSONField(name = "values")
        public List<Item> values;

        /* JADX WARN: Type inference failed for: r0v18, types: [com.bilibili.ogv.operation.entrance.indexpage.PreselectedFilterItem, java.lang.Object] */
        @Nullable
        public Item select(PreSelectedFilter preSelectedFilter) {
            if (!this.field.equals(preSelectedFilter.f70160a)) {
                return null;
            }
            Item item = null;
            for (Item item2 : this.values) {
                String str = item2.keyword;
                ?? obj = new Object();
                obj.f70163a = str;
                obj.f70164b = null;
                int iIndexOf = preSelectedFilter.f70162c.indexOf(obj);
                PreselectedFilterItem preselectedFilterItem = iIndexOf >= 0 ? preSelectedFilter.f70162c.get(iIndexOf) : null;
                item2.isSelect = preselectedFilterItem != null;
                if (preselectedFilterItem != null) {
                    item = item2;
                }
            }
            if (item != null) {
                return item;
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryCondition$Item.class */
    @Keep
    public static class Item {
        public String field;

        @JSONField(deserialize = false, serialize = false)
        public boolean isSelect;
        public String keyword;
        public String name;
    }
}
