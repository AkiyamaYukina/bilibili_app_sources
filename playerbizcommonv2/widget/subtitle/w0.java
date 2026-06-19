package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/w0.class */
@StabilityInferred(parameters = 0)
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f83804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f83805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f83806c;

    public w0(@NotNull IPlayerSettingService iPlayerSettingService, @NotNull IInteractLayerService iInteractLayerService, @NotNull IControlContainerService iControlContainerService) {
        this.f83804a = iInteractLayerService;
        this.f83805b = iPlayerSettingService;
        this.f83806c = iControlContainerService;
    }
}
