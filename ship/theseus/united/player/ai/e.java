package com.bilibili.ship.theseus.united.player.ai;

import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/e.class */
public final class e implements ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliGuideBubble f104369a;

    public e(BiliGuideBubble biliGuideBubble) {
        this.f104369a = biliGuideBubble;
    }

    public final void onControlContainerVisibleChanged(boolean z6) {
        if (z6) {
            return;
        }
        BiliGuideBubble biliGuideBubble = this.f104369a;
        if (biliGuideBubble.isShowing()) {
            try {
                biliGuideBubble.dismiss();
            } catch (Exception e7) {
                BLog.e("MultilangAudioBubbleGuide-showBubbleGuide$dismiss", "[theseus-united-MultilangAudioBubbleGuide-showBubbleGuide$dismiss] dismiss bubble error", e7);
            }
        }
    }
}
