package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.bilibili.app.provider.IGlobalCloseBrowserBehavior;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.IPlayerContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/y.class */
public final class y implements IGlobalCloseBrowserBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f81730a;

    public y(w wVar) {
        this.f81730a = wVar;
    }

    public final void closeBrowser() {
        w wVar = this.f81730a;
        IPlayerContainer iPlayerContainer = wVar.f81702a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        iPlayerContainer2.getFunctionWidgetService().hideWidget(wVar.getToken());
    }

    public final boolean isDestroyed() {
        return !this.f81730a.isShowing();
    }
}
