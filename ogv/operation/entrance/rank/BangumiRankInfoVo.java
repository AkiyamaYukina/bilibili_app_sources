package com.bilibili.ogv.operation.entrance.rank;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/rank/BangumiRankInfoVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiRankInfoVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f70196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("season_type")
    private int f70197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public List<RankItem> f70198c = CollectionsKt.emptyList();

    public final int a() {
        return this.f70197b;
    }

    public final void b(int i7) {
        this.f70197b = i7;
    }
}
