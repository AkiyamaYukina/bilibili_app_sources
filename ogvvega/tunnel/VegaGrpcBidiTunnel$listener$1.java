package com.bilibili.ogvvega.tunnel;

import G3.G0;
import android.net.NetworkInfo;
import androidx.annotation.UiThread;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaGrpcBidiTunnel$listener$1.class */
public final class VegaGrpcBidiTunnel$listener$1 implements ConnectivityMonitor.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onChanged$lambda$1() {
        if (VegaGrpcBidiTunnel.bidiCall != null) {
            return Unit.INSTANCE;
        }
        VegaGrpcBidiTunnel vegaGrpcBidiTunnel = VegaGrpcBidiTunnel.INSTANCE;
        if (vegaGrpcBidiTunnel.hasSubscribedBiz()) {
            vegaGrpcBidiTunnel.reconnect(new Cause(CauseType.NETWORK_ERROR, "network switch offline"));
        }
        return Unit.INSTANCE;
    }

    @Deprecated
    @UiThread
    public /* bridge */ /* synthetic */ void onChanged(int i7) {
    }

    @UiThread
    public void onChanged(int i7, int i8, NetworkInfo networkInfo) {
        if (i7 != 3) {
            HandlersKt.runOnGRPCThread(new G0(8));
        }
    }
}
