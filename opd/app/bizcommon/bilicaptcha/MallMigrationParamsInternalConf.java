package com.bilibili.opd.app.bizcommon.bilicaptcha;

import androidx.annotation.Keep;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.FlutterWebModCheckerKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/MallMigrationParamsInternalConf.class */
@Keep
public class MallMigrationParamsInternalConf {

    @Nullable
    private MallRiskParams riskParams;

    @Nullable
    private String tag;

    @Nullable
    public final String getMToken() {
        MallRiskParams mallRiskParams = this.riskParams;
        return mallRiskParams != null ? mallRiskParams.getVVoucher() : null;
    }

    @Nullable
    public final MallRiskParams getRiskParams() {
        return this.riskParams;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    public final void setRiskParams(@Nullable MallRiskParams mallRiskParams) {
        this.riskParams = mallRiskParams;
    }

    public final void setTag(@Nullable String str) {
        this.tag = str;
    }

    public final boolean verifyMigrationValid() {
        if (this.riskParams != null) {
            return FlutterWebModCheckerKt.isNotNullAndNotEmpty(getMToken());
        }
        return false;
    }
}
