package com.bilibili.opd.app.bizcommon.bilicaptcha;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.opd.app.bizcommon.hybridruntime.web.FlutterWebModCheckerKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/bilicaptcha/MallMigrationParamsConf.class */
@Keep
public class MallMigrationParamsConf {

    @JSONField(name = "ga_data")
    @Nullable
    private MallMigrationParamsInternalConf gaData;

    @Nullable
    public final MallMigrationParamsInternalConf getGaData() {
        return this.gaData;
    }

    @Nullable
    public final String getMToken() {
        MallRiskParams riskParams;
        MallMigrationParamsInternalConf mallMigrationParamsInternalConf = this.gaData;
        return (mallMigrationParamsInternalConf == null || (riskParams = mallMigrationParamsInternalConf.getRiskParams()) == null) ? null : riskParams.getVVoucher();
    }

    public final void setGaData(@Nullable MallMigrationParamsInternalConf mallMigrationParamsInternalConf) {
        this.gaData = mallMigrationParamsInternalConf;
    }

    public final boolean verfyMigrationValid() {
        if (this.gaData != null) {
            return FlutterWebModCheckerKt.isNotNullAndNotEmpty(getMToken());
        }
        return false;
    }
}
