package com.bilibili.ogvvega.tunnel;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/d.class */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f73381b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f73380a = i7;
        this.f73381b = obj;
    }

    public final Object invoke() {
        switch (this.f73380a) {
            case 0:
                return VegaGrpcBidiTunnel.reconnect$lambda$0((Cause) this.f73381b);
            default:
                return ((com.bilibili.search2.result.holder.author.g) this.f73381b).itemView.findViewById(2131299632);
        }
    }
}
