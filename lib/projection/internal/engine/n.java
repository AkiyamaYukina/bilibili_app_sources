package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/n.class */
public final class n<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.lib.projection.internal.device.a f63168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63169b;

    public n(com.bilibili.lib.projection.internal.device.a aVar, DefaultProjectionEngineManager defaultProjectionEngineManager, C7564c c7564c) {
        this.f63168a = aVar;
        this.f63169b = defaultProjectionEngineManager;
    }

    public final void accept(Object obj) {
        ProjectionDeviceInternal.PlayerState playerState = (ProjectionDeviceInternal.PlayerState) obj;
        if (playerState == ProjectionDeviceInternal.PlayerState.STOPPED || playerState == ProjectionDeviceInternal.PlayerState.IDLE) {
            C7564c.f121633j.z(null);
            if (this.f63168a.getClient() == null) {
                this.f63169b.G();
            }
        }
    }
}
