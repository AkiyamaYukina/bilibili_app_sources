package com.bilibili.studio.editor.moudle.aistory.sensitive.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/bean/SensitiveCheckResult.class */
@Keep
public final class SensitiveCheckResult {

    @JSONField(name = CaptureSchema.JUMP_PARAMS_EXTRA)
    @Nullable
    private String extra;

    @JSONField(name = "forbid_msg")
    @Nullable
    private String forbidMsg;

    @JSONField(name = Constant.IN_KEY_REASON)
    @Nullable
    private String reason;

    @JSONField(name = "risk_level")
    private int riskLevel;

    @JSONField(name = "unique_id")
    private int uniqueId;

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getForbidMsg() {
        return this.forbidMsg;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public final int getRiskLevel() {
        return this.riskLevel;
    }

    public final int getUniqueId() {
        return this.uniqueId;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setForbidMsg(@Nullable String str) {
        this.forbidMsg = str;
    }

    public final void setReason(@Nullable String str) {
        this.reason = str;
    }

    public final void setRiskLevel(int i7) {
        this.riskLevel = i7;
    }

    public final void setUniqueId(int i7) {
        this.uniqueId = i7;
    }
}
