package com.bilibili.biligame.api.comment;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/comment/CommentAttitude.class */
@StabilityInferred(parameters = 0)
@Keep
public class CommentAttitude {
    public static final int $stable = 8;

    @JSONField(name = GameDetailContent.DetailInfo.UI_TYPE_OFFICIAL_ACCOUNT)
    private boolean officialAccount;

    @JSONField(name = "official_like_tooltip")
    @Nullable
    private String officialLikeTip;

    @JSONField(name = "official_like_updated")
    private boolean officialLikeUpdated;

    public final boolean getOfficialAccount() {
        return this.officialAccount;
    }

    @Nullable
    public final String getOfficialLikeTip() {
        return this.officialLikeTip;
    }

    public final boolean getOfficialLikeUpdated() {
        return this.officialLikeUpdated;
    }

    public final void setOfficialAccount(boolean z6) {
        this.officialAccount = z6;
    }

    public final void setOfficialLikeTip(@Nullable String str) {
        this.officialLikeTip = str;
    }

    public final void setOfficialLikeUpdated(boolean z6) {
        this.officialLikeUpdated = z6;
    }
}
