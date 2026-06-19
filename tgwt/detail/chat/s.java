package com.bilibili.tgwt.detail.chat;

import com.bilibili.lib.image2.bean.AnimationListener;
import com.bilibili.lib.image2.bean.BiliAnimatable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/s.class */
public final class s implements AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f111141a;

    public s(u uVar) {
        this.f111141a = uVar;
    }

    public final void onAnimationLastFrame(BiliAnimatable biliAnimatable) {
        u uVar = this.f111141a;
        if (uVar.h) {
            uVar.h = false;
            uVar.notifyPropertyChanged(181);
        }
        uVar.f111145c.j();
    }

    public final void onAnimationStart(BiliAnimatable biliAnimatable) {
    }

    public final void onAnimationStop(BiliAnimatable biliAnimatable) {
    }
}
