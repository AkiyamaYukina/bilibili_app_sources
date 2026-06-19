package com.bilibili.ogvvega.tunnel;

import androidx.compose.ui.text.font.C4496a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/ProtocolKt.class */
public final class ProtocolKt {

    @NotNull
    private static final String AUTH = toRoutePath(S7.e.getAuthMethod().getFullMethodName());

    @NotNull
    private static final String MSG_ACK = toRoutePath(S7.e.getMessageAckMethod().getFullMethodName());

    @NotNull
    private static final String HEARTBEAT = toRoutePath(S7.e.getHeartbeatMethod().getFullMethodName());

    @NotNull
    private static final String SUBSCRIBE = toRoutePath(S7.e.getSubscribeMethod().getFullMethodName());

    @NotNull
    public static final String getAUTH() {
        return AUTH;
    }

    @NotNull
    public static final String getHEARTBEAT() {
        return HEARTBEAT;
    }

    @NotNull
    public static final String getMSG_ACK() {
        return MSG_ACK;
    }

    @NotNull
    public static final String getSUBSCRIBE() {
        return SUBSCRIBE;
    }

    @NotNull
    public static final String toRoutePath(@NotNull String str) {
        return C4496a.a("/", str);
    }
}
