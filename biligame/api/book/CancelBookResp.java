package com.bilibili.biligame.api.book;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/book/CancelBookResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CancelBookResp implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "cancel_tip")
    @Nullable
    private String cancelTip = "";

    @JSONField(name = "cancelled_games")
    @Nullable
    private List<Integer> cancelledGames;

    @Nullable
    public final String getCancelTip() {
        return this.cancelTip;
    }

    @Nullable
    public final List<Integer> getCancelledGames() {
        return this.cancelledGames;
    }

    public final void setCancelTip(@Nullable String str) {
        this.cancelTip = str;
    }

    public final void setCancelledGames(@Nullable List<Integer> list) {
        this.cancelledGames = list;
    }
}
