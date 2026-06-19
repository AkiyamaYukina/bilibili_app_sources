package com.bilibili.live.streaming;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.live.streaming.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/n.class */
public final /* synthetic */ class C5371n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65361b;

    public /* synthetic */ C5371n(Object obj, int i7) {
        this.f65360a = i7;
        this.f65361b = obj;
    }

    public final Object invoke() {
        switch (this.f65360a) {
            case 0:
                return LivePush.startEncoder$lambda$60((LivePush) this.f65361b);
            default:
                ((com.bilibili.ship.theseus.cheese.pay.purchase.guide.b) this.f65361b).f90539b.invoke();
                return Unit.INSTANCE;
        }
    }
}
