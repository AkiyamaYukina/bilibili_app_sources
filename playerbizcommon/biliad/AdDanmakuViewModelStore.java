package com.bilibili.playerbizcommon.biliad;

import com.bilibili.playerbizcommon.features.delegate.AbsDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/biliad/AdDanmakuViewModelStore.class */
public final class AdDanmakuViewModelStore extends AbsDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BiliAdDanmakuViewModelv2 f79550a;

    public AdDanmakuViewModelStore(@NotNull BiliAdDanmakuViewModelv2 biliAdDanmakuViewModelv2) {
        this.f79550a = biliAdDanmakuViewModelv2;
    }

    @NotNull
    public final BiliAdDanmakuViewModelv2 getAdDanmakuViewModel() {
        return this.f79550a;
    }
}
