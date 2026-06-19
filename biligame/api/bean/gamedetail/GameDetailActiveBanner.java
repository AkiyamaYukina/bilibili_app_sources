package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailActiveBanner.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameDetailActiveBanner implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "active_url")
    @Nullable
    private String activeUrl;

    @JSONField(name = "game_base_id")
    @Nullable
    private String gameBaseId = "";

    @JSONField(name = ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL)
    @Nullable
    private String imageUrl;

    @JSONField(name = "seq")
    private int seq;

    @Nullable
    public final String getActiveUrl() {
        return this.activeUrl;
    }

    @Nullable
    public final String getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final void setActiveUrl(@Nullable String str) {
        this.activeUrl = str;
    }

    public final void setGameBaseId(@Nullable String str) {
        this.gameBaseId = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setSeq(int i7) {
        this.seq = i7;
    }
}
