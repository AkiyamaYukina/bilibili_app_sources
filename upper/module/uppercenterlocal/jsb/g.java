package com.bilibili.upper.module.uppercenterlocal.jsb;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.rubick.api.IJsbContextV3;
import com.bilibili.app.comm.rubick.api.IJsbServiceProviderV3;
import com.bilibili.jsb.JsbMethod;
import com.bilibili.jsb.JsbServiceApi;
import com.bilibili.lib.gripper.api.Producer;
import java.util.List;
import javax.inject.Named;
import kntr.base.jsb.api.upper.UpperMuxJsbServiceApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/jsb/g.class */
@StabilityInferred(parameters = 0)
public final class g implements IJsbServiceProviderV3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<JsbMethod> f114251a;

    public g() {
        UpperMuxJsbServiceApi.Q0.getClass();
        this.f114251a = UpperMuxJsbServiceApi.a.b;
    }

    @Named("upperMux")
    @Producer(singleton = true)
    @NotNull
    public final IJsbServiceProviderV3 asProvider() {
        return this;
    }

    public final JsbServiceApi create(IJsbContextV3 iJsbContextV3) {
        return new f(iJsbContextV3);
    }

    @NotNull
    public final List<JsbMethod> getMeta() {
        return this.f114251a;
    }
}
