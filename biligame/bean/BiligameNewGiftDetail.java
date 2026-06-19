package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameGiftDetail;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/BiligameNewGiftDetail.class */
@Keep
public final class BiligameNewGiftDetail extends BiligameGiftDetail implements Serializable {

    @JSONField(name = "user_receive_status")
    @NotNull
    private String userReceive = "0";

    @Override // com.bilibili.biligame.api.BiligameGiftDetail
    public boolean canTake() {
        return this.remain > 0 && !isReceived();
    }

    @NotNull
    public final String getUserReceive() {
        return this.userReceive;
    }

    @Override // com.bilibili.biligame.api.BiligameGiftDetail
    public boolean isReceived() {
        return Intrinsics.areEqual("1", this.userReceive);
    }

    public final void setUserReceive(@NotNull String str) {
        this.userReceive = str;
    }
}
