package com.bilibili.opd.app.bizcommon.hybridruntime.network;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/network/NetResultBean.class */
@Keep
public final class NetResultBean {

    @NotNull
    private final String host;
    private int respCode = -1;
    private int speed;

    public NetResultBean(@NotNull String str) {
        this.host = str;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final int getRespCode() {
        return this.respCode;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final void setRespCode(int i7) {
        this.respCode = i7;
    }

    public final void setSpeed(int i7) {
        this.speed = i7;
    }
}
