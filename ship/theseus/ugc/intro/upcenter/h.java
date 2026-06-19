package com.bilibili.ship.theseus.ugc.intro.upcenter;

import J3.W0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.moduleservice.ugc.IUploaderCenterService;
import com.bilibili.moduleservice.ugc.IUploaderCenterServiceProvider;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/h.class */
@Singleton
@StabilityInferred(parameters = 0)
public final class h implements IUploaderCenterServiceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f97564a = LazyKt.lazy(new W0(11));

    @Override // com.bilibili.moduleservice.ugc.IUploaderCenterServiceProvider
    @Nullable
    public final IUploaderCenterService getService(@NotNull com.bapis.bilibili.app.view.v1.ExtType extType) {
        return (IUploaderCenterService) ((ConcurrentHashMap) this.f97564a.getValue()).get(extType);
    }

    @Override // com.bilibili.moduleservice.ugc.IUploaderCenterServiceProvider
    public final void putService(@NotNull com.bapis.bilibili.app.view.v1.ExtType extType, @NotNull IUploaderCenterService iUploaderCenterService) {
        ((ConcurrentHashMap) this.f97564a.getValue()).put(extType, iUploaderCenterService);
    }
}
