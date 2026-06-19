package com.bilibili.pegasus.verticaltab.api.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.api.model.BasicIndexItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/EmptyItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class EmptyItem extends BasicIndexItem {
    public static final int $stable = 8;

    public EmptyItem() {
        ((BasicIndexItem) this).cardType = "empty_view";
    }

    public int getSpanCount() {
        return 2;
    }

    @Nullable
    public /* bridge */ /* synthetic */ String getUriQueryParameter(@NonNull String str) {
        return super.getUriQueryParameter(str);
    }

    public /* bridge */ /* synthetic */ void initCache() {
        super.initCache();
    }

    public /* bridge */ /* synthetic */ boolean initCacheEnable() {
        return super.initCacheEnable();
    }

    public boolean isFunctionalItem() {
        return true;
    }

    public /* bridge */ /* synthetic */ void safeInitCache() {
        super.safeInitCache();
    }
}
