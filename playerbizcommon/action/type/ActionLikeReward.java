package com.bilibili.playerbizcommon.action.type;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/action/type/ActionLikeReward.class */
@Keep
public final class ActionLikeReward {

    @JSONField(name = "toast")
    @Nullable
    private String toast;

    @JSONField(name = "v_voucher")
    @Nullable
    private String voucher;

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    @Nullable
    public final String getVoucher() {
        return this.voucher;
    }

    public final void setToast(@Nullable String str) {
        this.toast = str;
    }

    public final void setVoucher(@Nullable String str) {
        this.voucher = str;
    }
}
