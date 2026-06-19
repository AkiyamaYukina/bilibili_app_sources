package com.bilibili.playerbizcommonv2.web;

import tv.danmaku.videoplayer.coreV2.MediaPlayContextImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/e.class */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f82223b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f82222a = i7;
        this.f82223b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f82222a) {
            case 0:
                ((PlayerV3WebGeneralUIComponent) this.f82223b).d();
                break;
            default:
                MediaPlayContextImpl mediaPlayContextImpl = (MediaPlayContextImpl) this.f82223b;
                mediaPlayContextImpl.c(mediaPlayContextImpl.a);
                break;
        }
    }
}
