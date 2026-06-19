package com.bilibili.player.tangram.playercore;

import androidx.compose.foundation.text.selection.C3751q;
import com.bilibili.player.tangram.playercore.A;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerPerformanceListener;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/m.class */
public final class m implements IPlayerPerformanceListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PCSFacadeImpl f79451a;

    public m(PCSFacadeImpl pCSFacadeImpl) {
        this.f79451a = pCSFacadeImpl;
    }

    public final void onPlayerPrepared(long j7) {
        BLog.i("PCSFacadeImpl$newPlayerPerformanceListener$1-onPlayerPrepared", "[tangram-player-core-PCSFacadeImpl$newPlayerPerformanceListener$1-onPlayerPrepared] " + C3751q.a(j7, "timestamp = "));
        BLog.i("PCSFacadeImpl$newPlayerPerformanceListener$1-onPlayerPrepared", "[tangram-player-core-PCSFacadeImpl$newPlayerPerformanceListener$1-onPlayerPrepared] Emitting ProfilingEvent.Prepared");
        this.f79451a.f79389f.invoke(new A.d(j7));
    }

    public final void onVideoFirstRender(long j7) {
        BLog.i("PCSFacadeImpl$newPlayerPerformanceListener$1-onVideoFirstRender", "[tangram-player-core-PCSFacadeImpl$newPlayerPerformanceListener$1-onVideoFirstRender] " + C3751q.a(j7, "timestamp = "));
        BLog.i("PCSFacadeImpl$newPlayerPerformanceListener$1-onVideoFirstRender", "[tangram-player-core-PCSFacadeImpl$newPlayerPerformanceListener$1-onVideoFirstRender] Emitting ProfilingEvent.FirstFrame");
        this.f79451a.f79389f.invoke(new A.c(j7));
    }
}
