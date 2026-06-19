package com.bilibili.ogvvega.tunnel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaManager.class */
public final class VegaManager implements IBidiTunnel {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final IBidiTunnel tunnel = VegaGrpcBidiTunnel.INSTANCE;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/VegaManager$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int vegaABTest() {
            return vegaOptEnabled() ? 2 : 1;
        }

        public final boolean vegaOptEnabled() {
            return Hj0.a.a("ogv_enable_vega_optimization", true);
        }
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    public void connect() {
        this.tunnel.connect();
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    public void disconnect() {
        this.tunnel.disconnect();
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    @NotNull
    public <Req> Requester<Req> subscribe(@NotNull TargetPath targetPath, @NotNull Subscriber<?> subscriber) {
        return this.tunnel.subscribe(targetPath, subscriber);
    }

    @Override // com.bilibili.ogvvega.tunnel.IBidiTunnel
    public void unsubscribe(@NotNull TargetPath targetPath) {
        this.tunnel.unsubscribe(targetPath);
    }
}
