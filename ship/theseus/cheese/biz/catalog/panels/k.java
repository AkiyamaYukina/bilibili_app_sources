package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import androidx.activity.ComponentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.provider.IGlobalGetContainerInfoBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/k.class */
public final class k implements IGlobalGetContainerInfoBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f89227a;

    public k(ComponentActivity componentActivity) {
        this.f89227a = componentActivity;
    }

    public final String getContainerName() {
        return "CheeseWebFragment";
    }

    public final JSONObject getExtraInfoContainerInfo() {
        return null;
    }

    public final boolean isDestroyed() {
        return this.f89227a.isDestroyed();
    }
}
