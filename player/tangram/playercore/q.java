package com.bilibili.player.tangram.playercore;

import androidx.compose.ui.text.font.C4496a;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/q.class */
public final class q implements tv.danmaku.biliplayerv2.service.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.player.tangram.basic.a f79454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PCSFacadeImpl f79455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CancellableContinuationImpl f79456c;

    public q(com.bilibili.player.tangram.basic.a aVar, PCSFacadeImpl pCSFacadeImpl, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f79454a = aVar;
        this.f79455b = pCSFacadeImpl;
        this.f79456c = cancellableContinuationImpl;
    }

    public final void c(int i7, int i8, boolean z6, boolean z7) {
        com.bilibili.player.tangram.basic.a aVar = this.f79454a;
        int i9 = aVar.f79320a;
        PCSFacadeImpl pCSFacadeImpl = this.f79455b;
        if (i8 == i9) {
            if (z6) {
                pCSFacadeImpl.f79387d.f79351g.invoke();
            }
            defpackage.a.b("[tangram-player-core-PCSFacadeImpl$switchToSpecificQuality$2$observer$1-onSourceChanged] ", C4496a.a("Operating quality for specified: ", String.valueOf(aVar.f79320a)), "PCSFacadeImpl$switchToSpecificQuality$2$observer$1-onSourceChanged");
            pCSFacadeImpl.f79396n.setValue(aVar);
        } else {
            BLog.i("PCSFacadeImpl$switchToSpecificQuality$2$observer$1-onSourceChanged", "[tangram-player-core-PCSFacadeImpl$switchToSpecificQuality$2$observer$1-onSourceChanged] Quality result miss!");
        }
        pCSFacadeImpl.f79384a.removePlayerSourceObserver(this);
        Result.Companion companion = Result.Companion;
        this.f79456c.resumeWith(Result.constructor-impl(Boolean.valueOf(z6)));
    }
}
