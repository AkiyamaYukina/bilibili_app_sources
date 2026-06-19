package com.bilibili.biligame.api.user;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiliGameMineGameCountBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliGameMineGameCountBean {
    public static final int $stable = 8;

    @JSONField(name = "bought_count")
    private int boughtCount;

    @JSONField(name = "downloaded_count")
    private int downloadedCount;

    @JSONField(name = "history_count")
    private int historyCount;

    @JSONField(name = "have_played_count")
    private int playCount;

    public final int getBoughtCount() {
        return this.boughtCount;
    }

    public final int getDownloadedCount() {
        return this.downloadedCount;
    }

    public final int getHistoryCount() {
        return this.historyCount;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public final boolean isEmpty() {
        return this.playCount == 0 && this.boughtCount == 0 && this.downloadedCount == 0 && this.historyCount == 0;
    }

    public final void setBoughtCount(int i7) {
        this.boughtCount = i7;
    }

    public final void setDownloadedCount(int i7) {
        this.downloadedCount = i7;
    }

    public final void setHistoryCount(int i7) {
        this.historyCount = i7;
    }

    public final void setPlayCount(int i7) {
        this.playCount = i7;
    }

    public final boolean validItemChange(@Nullable BiliGameMineGameCountBean biliGameMineGameCountBean) {
        if (biliGameMineGameCountBean == null) {
            return true;
        }
        if (this.playCount > 0 && biliGameMineGameCountBean.playCount <= 0) {
            return true;
        }
        if (this.boughtCount > 0 && biliGameMineGameCountBean.boughtCount <= 0) {
            return true;
        }
        if (this.downloadedCount <= 0 || biliGameMineGameCountBean.downloadedCount > 0) {
            return this.historyCount > 0 && biliGameMineGameCountBean.historyCount <= 0;
        }
        return true;
    }
}
