package com.bilibili.playerbizcommonv2.widget.subtitle;

import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/G0.class */
public final class G0 implements ControlContainerVisibleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiliGuideBubble f83493a;

    public G0(BiliGuideBubble biliGuideBubble) {
        this.f83493a = biliGuideBubble;
    }

    public final void onControlContainerVisibleChanged(boolean z6) {
        if (z6) {
            return;
        }
        SubtitleAndAiWidget.n0(this.f83493a);
    }
}
