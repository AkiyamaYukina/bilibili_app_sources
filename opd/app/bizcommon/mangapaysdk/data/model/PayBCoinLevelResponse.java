package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayBCoinLevelResponse.class */
@Keep
public final class PayBCoinLevelResponse {

    @JSONField(name = "more_coin_levels")
    @NotNull
    private List<PayBCoinLevel> coinLevels = CollectionsKt.emptyList();

    @JSONField(name = "coin")
    private float userCoin = -1.0f;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(PayBCoinLevelResponse.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        PayBCoinLevelResponse payBCoinLevelResponse = (PayBCoinLevelResponse) obj;
        return Intrinsics.areEqual(this.coinLevels, payBCoinLevelResponse.coinLevels) && this.userCoin == payBCoinLevelResponse.userCoin;
    }

    @NotNull
    public final List<PayBCoinLevel> getCoinLevels() {
        return this.coinLevels;
    }

    public final float getUserCoin() {
        return this.userCoin;
    }

    public int hashCode() {
        return Float.hashCode(this.userCoin) + (this.coinLevels.hashCode() * 31);
    }

    public final void setCoinLevels(@NotNull List<PayBCoinLevel> list) {
        this.coinLevels = list;
    }

    public final void setUserCoin(float f7) {
        this.userCoin = f7;
    }
}
