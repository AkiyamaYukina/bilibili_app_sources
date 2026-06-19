package com.bilibili.tgwt.player.processor;

import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/d.class */
public final class d implements ControlContainerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f111639a;

    public d(f fVar) {
        this.f111639a = fVar;
    }

    public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
        f fVar = this.f111639a;
        ScreenModeType screenModeTypeM = fVar.f111641a.getPlayerServiceController().m();
        fVar.f111646f = screenModeTypeM;
        if (screenModeTypeM == ScreenModeType.THUMB) {
            fVar.f111645e = 0;
            fVar.a();
        } else if (screenModeTypeM == ScreenModeType.LANDSCAPE_FULLSCREEN) {
            fVar.f111645e = 0;
            fVar.b();
        }
    }
}
