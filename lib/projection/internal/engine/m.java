package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.projectionitem.DefaultProjectionPlayRecord;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/m.class */
public final class m<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.lib.projection.internal.device.a f63166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63167b;

    public m(com.bilibili.lib.projection.internal.device.a aVar, DefaultProjectionEngineManager defaultProjectionEngineManager, C7564c c7564c) {
        this.f63166a = aVar;
        this.f63167b = defaultProjectionEngineManager;
    }

    public final void accept(Object obj) {
        IProjectionPlayableItem iProjectionPlayableItem = (IProjectionPlayableItem) obj;
        int clientType = iProjectionPlayableItem.getRawItem().getClientType();
        com.bilibili.lib.projection.internal.device.a aVar = this.f63166a;
        if (clientType < 0) {
            if (aVar.getClient() == null) {
                this.f63167b.G();
            }
        } else {
            DeviceSnapshot deviceSnapshotF = aVar.getDevice().F();
            if (deviceSnapshotF != null) {
                C7564c.f121633j.z(new DefaultProjectionPlayRecord(deviceSnapshotF, iProjectionPlayableItem));
            }
        }
    }
}
