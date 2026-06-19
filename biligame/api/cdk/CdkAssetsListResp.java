package com.bilibili.biligame.api.cdk;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkAssetsListResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CdkAssetsListResp {
    public static final int $stable = 8;

    @JSONField(name = "list")
    @Nullable
    private List<CdkAssetInfo> list;

    @Nullable
    public final List<CdkAssetInfo> getList() {
        return this.list;
    }

    public final void setList(@Nullable List<CdkAssetInfo> list) {
        this.list = list;
    }
}
