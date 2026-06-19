package com.bilibili.ship.theseus.united.page.pausedpage;

import android.os.SystemClock;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/n.class */
public final class n implements PlayerSeekObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PausedPageService f102219a;

    public n(PausedPageService pausedPageService) {
        this.f102219a = pausedPageService;
    }

    public final void onSeekComplete(long j7) {
        PausedPageService pausedPageService = this.f102219a;
        int state = pausedPageService.f102152f.getState();
        if (state != 4) {
            BLog.i("PausedPageService", com.bapis.bilibili.app.home.v1.l.a(state, j7, "sessionPlayTracker seekCompleteWaitingPlay completePosition=", " state="));
            return;
        }
        pausedPageService.f102143I = Long.valueOf(SystemClock.elapsedRealtime());
        pausedPageService.f102144J = 0L;
        BLog.i("PausedPageService", com.bapis.bilibili.app.home.v1.l.a(state, j7, "sessionPlayTracker resumedAfterSeek completePosition=", " state="));
    }

    public final void onSeekStart(long j7) {
        PausedPageService pausedPageService = this.f102219a;
        pausedPageService.f102143I = null;
        pausedPageService.f102144J = 0L;
        BLog.i("PausedPageService", com.bapis.bilibili.app.home.v1.l.a(pausedPageService.f102152f.getState(), j7, "sessionPlayTracker interruptedBySeek startPosition=", " state="));
    }
}
