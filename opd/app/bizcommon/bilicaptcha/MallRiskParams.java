package com.bilibili.opd.app.bizcommon.bilicaptcha;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/MallRiskParams.class */
@Keep
public class MallRiskParams {

    @JSONField(name = "v_voucher")
    @Nullable
    private String vVoucher;

    @Nullable
    public final String getVVoucher() {
        return this.vVoucher;
    }

    public final void setVVoucher(@Nullable String str) {
        this.vVoucher = str;
    }
}
