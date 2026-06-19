package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.rubick.api.IJsbContextV3;
import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.jsb.JsbMethod;
import com.bilibili.jsb.JsbServiceApi;
import com.bilibili.lib.gripper.api.Producer;
import java.util.List;
import javax.inject.Named;
import kntr.base.jsb.api.following.FollowingJsbServiceApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/b.class */
@StabilityInferred(parameters = 0)
public final class b implements IJsbServiceProviderV3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<JsbMethod> f101983a;

    public b() {
        FollowingJsbServiceApi.o0.getClass();
        this.f101983a = FollowingJsbServiceApi.a.b;
    }

    @Named("following")
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
        return this.f101983a;
    }
}
