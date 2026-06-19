package com.bilibili.pegasus.verticaltab.api.model;

import Sp0.f;
import Vp0.p;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/VerticalLargeCoverV11Item.class */
@Keep
public class VerticalLargeCoverV11Item extends BasicIndexItem implements f.a {

    @Nullable
    @JSONField(name = "item")
    public List<NavigationItem> items;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/VerticalLargeCoverV11Item$NavigationItem.class */
    @Keep
    public static class NavigationItem {

        @JSONField(deserialize = false, serialize = false)
        public boolean hasReported = false;

        @Nullable
        @JSONField(name = "id")
        public String id;

        @Nullable
        @JSONField(name = "name")
        public String name;

        @Nullable
        @JSONField(name = "pic")
        public String pic;

        @Nullable
        @JSONField(name = EditCustomizeSticker.TAG_URI)
        public String uri;
    }

    @Override // Sp0.f.a
    public boolean filter() {
        List<NavigationItem> list = this.items;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<NavigationItem> it = this.items.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next().name)) {
                it.remove();
            }
        }
        return !this.items.isEmpty();
    }

    public Rect getHolderOutRect(int i7, int i8) {
        int i9 = p.f25652b;
        return p.f25657g;
    }

    public int getSpanCount() {
        return 2;
    }

    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ String getUriQueryParameter(@NonNull String str) {
        return super.getUriQueryParameter(str);
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    public /* bridge */ /* synthetic */ boolean initCacheEnable() {
        return super.initCacheEnable();
    }

    public /* bridge */ /* synthetic */ void safeInitCache() {
        super.safeInitCache();
    }
}
