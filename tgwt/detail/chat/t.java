package com.bilibili.tgwt.detail.chat;

import com.bilibili.lib.image2.bean.ImageLoadingListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/t.class */
public final class t implements ImageLoadingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f111142a;

    public t(u uVar) {
        this.f111142a = uVar;
    }

    public final void onImageLoadFailed(Throwable th) {
        u uVar = this.f111142a;
        if (uVar.h) {
            uVar.h = false;
            uVar.notifyPropertyChanged(181);
        }
        uVar.f111145c.j();
    }
}
