package com.bilibili.playerbizcommonv2.danmaku.widget;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.provider.IGlobalGetContainerInfoBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/z.class */
public final class z implements IGlobalGetContainerInfoBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f81731a;

    public z(w wVar) {
        this.f81731a = wVar;
    }

    public final String getContainerName() {
        return "mainsite web container 1.0";
    }

    public final JSONObject getExtraInfoContainerInfo() {
        return new JSONObject();
    }

    public final boolean isDestroyed() {
        return !this.f81731a.isShowing();
    }
}
