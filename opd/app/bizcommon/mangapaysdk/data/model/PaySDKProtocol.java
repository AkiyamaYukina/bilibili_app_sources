package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PaySDKProtocol.class */
@Keep
public final class PaySDKProtocol {

    @JSONField(name = "agree_protocol")
    @NotNull
    private String agreeProtocolName = "";

    @JSONField(name = "jump_url")
    @NotNull
    private String protocolJumpUrl = "";

    @NotNull
    public final String getAgreeProtocolName() {
        return this.agreeProtocolName;
    }

    @NotNull
    public final String getProtocolJumpUrl() {
        return this.protocolJumpUrl;
    }

    public final void setAgreeProtocolName(@NotNull String str) {
        this.agreeProtocolName = str;
    }

    public final void setProtocolJumpUrl(@NotNull String str) {
        this.protocolJumpUrl = str;
    }
}
