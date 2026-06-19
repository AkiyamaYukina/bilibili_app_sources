package com.bilibili.ship.theseus.united.page.pausedpage;

import Aq0.B;
import android.view.MotionEvent;
import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/m.class */
public final class m implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f102214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f102215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PausedPageService f102218e;

    public m(int i7, PausedPageService pausedPageService) {
        this.f102217d = i7;
        this.f102218e = pausedPageService;
    }

    @Override // Aq0.B
    public final void onTouch(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.f102214a = motionEvent.getX();
            this.f102215b = motionEvent.getY();
            this.f102216c = false;
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 2) {
            if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 3)) {
                this.f102216c = false;
                return;
            }
            return;
        }
        if (this.f102216c) {
            return;
        }
        float x6 = motionEvent.getX() - this.f102214a;
        float y6 = motionEvent.getY() - this.f102215b;
        int i7 = this.f102217d;
        if ((y6 * y6) + (x6 * x6) > i7 * i7) {
            this.f102216c = true;
            this.f102218e.r(AdPausedPageTriggerReason.DRAG_PLAYER);
        }
    }
}
