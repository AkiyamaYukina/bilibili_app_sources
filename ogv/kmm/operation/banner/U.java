package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.operation2.banner.BannerHdrVideoConfigHelperImpl;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rj0.C8526a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/U.class */
@StabilityInferred(parameters = 0)
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final BannerHdrVideoConfigHelperImpl f68063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f68064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8526a f68065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.operation3.module.operable.delivery.a f68066d;

    @Inject
    public U(@Nullable BannerHdrVideoConfigHelperImpl bannerHdrVideoConfigHelperImpl, @NotNull String str, @NotNull C8526a c8526a, @NotNull com.bilibili.ogv.operation3.module.operable.delivery.a aVar) {
        this.f68063a = bannerHdrVideoConfigHelperImpl;
        this.f68064b = str;
        this.f68065c = c8526a;
        this.f68066d = aVar;
    }
}
