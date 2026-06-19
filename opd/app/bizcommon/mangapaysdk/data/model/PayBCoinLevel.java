package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import androidx.compose.animation.n;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayBCoinLevel.class */
@Keep
public final class PayBCoinLevel {

    @JSONField(name = "is_default_select")
    private boolean isDefaultSelect;

    @JSONField(name = "is_show_recommend_tag")
    private boolean isShowRecommendTag;

    @JSONField(name = "coin")
    private float coin = -1.0f;

    @JSONField(name = "rmb")
    private float rmb = -1.0f;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(PayBCoinLevel.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        PayBCoinLevel payBCoinLevel = (PayBCoinLevel) obj;
        return this.coin == payBCoinLevel.coin && this.rmb == payBCoinLevel.rmb && this.isShowRecommendTag == payBCoinLevel.isShowRecommendTag;
    }

    public final float getCoin() {
        return this.coin;
    }

    public final float getRmb() {
        return this.rmb;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isShowRecommendTag) + n.a(this.rmb, Float.hashCode(this.coin) * 31, 31);
    }

    public final boolean isDefaultSelect() {
        return this.isDefaultSelect;
    }

    public final boolean isShowRecommendTag() {
        return this.isShowRecommendTag;
    }

    public final void setCoin(float f7) {
        this.coin = f7;
    }

    public final void setDefaultSelect(boolean z6) {
        this.isDefaultSelect = z6;
    }

    public final void setRmb(float f7) {
        this.rmb = f7;
    }

    public final void setShowRecommendTag(boolean z6) {
        this.isShowRecommendTag = z6;
    }
}
