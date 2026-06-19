package com.bilibili.biligame.api.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/VersionGiftReserve.class */
@StabilityInferred(parameters = 0)
@Keep
public final class VersionGiftReserve {
    public static final int $stable = 8;

    @JSONField(name = "gift_code")
    @Nullable
    private String giftCode;

    @JSONField(name = "send_gift_type")
    private int sendGiftType = -1;

    @JSONField(name = "tip_text")
    @Nullable
    private String tipText;

    @Nullable
    public final String getGiftCode() {
        return this.giftCode;
    }

    public final int getSendGiftType() {
        return this.sendGiftType;
    }

    @Nullable
    public final String getTipText() {
        return this.tipText;
    }

    public final void setGiftCode(@Nullable String str) {
        this.giftCode = str;
    }

    public final void setSendGiftType(int i7) {
        this.sendGiftType = i7;
    }

    public final void setTipText(@Nullable String str) {
        this.tipText = str;
    }
}
