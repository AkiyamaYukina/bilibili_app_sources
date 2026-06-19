package com.bilibili.search2.result.bangumi;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.EpisodeNew;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/EpisodesNewItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class EpisodesNewItem {
    public static final int $stable = 8;

    @SerializedName("episodes")
    @JSONField(name = "episodes")
    @Nullable
    private List<EpisodeNew> episodeNewList;

    @SerializedName("title")
    @JSONField(name = "title")
    @Nullable
    private String title;

    @SerializedName("total")
    @JSONField(name = "total")
    private int total;

    @Nullable
    public final List<EpisodeNew> getEpisodeNewList() {
        return this.episodeNewList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getTotal() {
        return this.total;
    }

    public final void setEpisodeNewList(@Nullable List<EpisodeNew> list) {
        this.episodeNewList = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTotal(int i7) {
        this.total = i7;
    }
}
