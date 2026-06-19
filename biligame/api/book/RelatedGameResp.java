package com.bilibili.biligame.api.book;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/book/RelatedGameResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RelatedGameResp implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "games")
    @Nullable
    private List<RelatedGame> games;

    @Nullable
    public final List<RelatedGame> getGames() {
        return this.games;
    }

    public final void setGames(@Nullable List<RelatedGame> list) {
        this.games = list;
    }
}
