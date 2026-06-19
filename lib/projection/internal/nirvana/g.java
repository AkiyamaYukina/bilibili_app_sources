package com.bilibili.lib.projection.internal.nirvana;

import aY0.r;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/g.class */
public final class g<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NirvanaEngine.a f63322a;

    public g(NirvanaEngine.a aVar) {
        this.f63322a = aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void accept(Object obj) {
        r rVar = (r) obj;
        if (!rVar.d()) {
            if (NotificationLite.isError(rVar.a)) {
                BLog.w("NirvanaEngine", "GetTransportInfo failed", rVar.b());
            }
            return;
        }
        com.bilibili.lib.nirvana.api.c cVar = (com.bilibili.lib.nirvana.api.c) rVar.c();
        if (cVar == null) {
            return;
        }
        BLog.i("NirvanaEngine", "Get transport info " + cVar);
        String str = (String) cVar.a;
        int iHashCode = str.hashCode();
        NirvanaEngine.a aVar = this.f63322a;
        switch (iHashCode) {
            case -2074622387:
                if (str.equals("TRANSITIONING")) {
                    aVar.f63253g.onNext(ProjectionDeviceInternal.PlayerState.LOADING);
                    break;
                }
                break;
            case -1775020766:
                if (str.equals("NO_MEDIA_PRESENT")) {
                    if (aVar.f63267v || se0.k.b(aVar.f63247a)) {
                        BLog.i("NirvanaEngine", "Get transport info idle after play immediately");
                    } else {
                        aVar.f63253g.onNext(ProjectionDeviceInternal.PlayerState.IDLE);
                    }
                    break;
                }
                break;
            case -1166336595:
                if (str.equals("STOPPED")) {
                    if (aVar.f63267v || se0.k.b(aVar.f63247a)) {
                        BLog.i("NirvanaEngine", "Get transport info stop after play immediately");
                    } else {
                        aVar.f63253g.onNext(ProjectionDeviceInternal.PlayerState.STOPPED);
                    }
                    break;
                }
                break;
            case -953262580:
                if (str.equals("PAUSED_PLAYBACK")) {
                    aVar.f63253g.onNext(ProjectionDeviceInternal.PlayerState.PAUSED);
                    break;
                }
                break;
            case 224418830:
                if (str.equals("PLAYING")) {
                    aVar.f63253g.onNext(ProjectionDeviceInternal.PlayerState.PLAYING);
                }
                break;
        }
    }
}
