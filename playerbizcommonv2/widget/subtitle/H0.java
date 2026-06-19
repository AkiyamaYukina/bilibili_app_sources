package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.jvm.functions.Function0;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/H0.class */
public final /* synthetic */ class H0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IPlayerSettingService f83504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IInteractLayerService f83505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IControlContainerService f83506c;

    public /* synthetic */ H0(IPlayerSettingService iPlayerSettingService, IInteractLayerService iInteractLayerService, IControlContainerService iControlContainerService) {
        this.f83504a = iPlayerSettingService;
        this.f83505b = iInteractLayerService;
        this.f83506c = iControlContainerService;
    }

    public final Object invoke() {
        return Boolean.valueOf(SubtitleAndAiWidget$subtitlesAvailableFlow$1.invokeSuspend$lambda$0(this.f83504a, this.f83505b, this.f83506c));
    }
}
