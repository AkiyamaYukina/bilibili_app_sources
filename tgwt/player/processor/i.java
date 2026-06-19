package com.bilibili.tgwt.player.processor;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/i.class */
public final class i implements ControlContainerObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f111657a;

    public i(k kVar) {
        this.f111657a = kVar;
    }

    public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
        k kVar = this.f111657a;
        ScreenModeType screenModeTypeM = kVar.f111661c.getPlayerServiceController().m();
        if (screenModeTypeM == ScreenModeType.THUMB) {
            Job job = kVar.f111665g;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            kVar.h = false;
            return;
        }
        if (screenModeTypeM == ScreenModeType.LANDSCAPE_FULLSCREEN && kVar.f111659a.f111872U && !kVar.h) {
            kVar.f111665g = BuildersKt.launch$default(kVar.f111664f, (CoroutineContext) null, (CoroutineStart) null, new TogetherWatchChatVoicePopupProcessor$requestShowPopup$1(kVar, null), 3, (Object) null);
            kVar.h = true;
        }
    }
}
