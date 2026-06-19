package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.commons.StringUtils;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchRankingMeta.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchRankingMeta {
    public static final int $stable = 8;

    @JvmField
    @JSONField(name = "link")
    @Nullable
    public String link;

    @JSONField(name = "open_search_ranking")
    private boolean openSearchRanking;

    @JvmField
    @JSONField(name = "text")
    @Nullable
    public String text;

    public final boolean canShowEntrance() {
        return (!this.openSearchRanking || StringUtils.isBlank(this.text) || StringUtils.isBlank(this.link)) ? false : true;
    }

    public final boolean getOpenSearchRanking() {
        return this.openSearchRanking;
    }

    public final void setOpenSearchRanking(boolean z6) {
        this.openSearchRanking = z6;
    }
}
