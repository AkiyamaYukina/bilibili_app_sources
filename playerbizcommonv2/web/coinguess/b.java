package com.bilibili.playerbizcommonv2.web.coinguess;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.rubick.api.IJsbContextV3;
import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.biligame.bean.GameCenterBottomTabConfig;
import com.bilibili.jsb.JsbMethod;
import com.bilibili.jsb.JsbServiceApi;
import com.bilibili.lib.gripper.api.Producer;
import java.util.List;
import javax.inject.Named;
import kntr.base.jsb.api.activity.ActivityJsbServiceApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/coinguess/b.class */
@StabilityInferred(parameters = 0)
public final class b implements IJsbServiceProviderV3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<JsbMethod> f82208a;

    public b() {
        ActivityJsbServiceApi.m0.getClass();
        this.f82208a = ActivityJsbServiceApi.a.b;
    }

    @Named(GameCenterBottomTabConfig.TAB_TYPE_ACT)
    @Producer(singleton = true)
    @NotNull
    public final IJsbServiceProviderV3 asProvider() {
        return this;
    }

    @NotNull
    public final JsbServiceApi create(@NotNull IJsbContextV3 iJsbContextV3) {
        return new a(iJsbContextV3);
    }

    @NotNull
    public final List<JsbMethod> getMeta() {
        return this.f82208a;
    }
}
