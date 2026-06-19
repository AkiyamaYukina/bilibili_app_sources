package com.bilibili.lib.projection.internal.engine;

import By0.C1511z;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/h.class */
public final class h<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IProjectionItem f63154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC7845m f63155c;

    public h(DefaultProjectionEngineManager defaultProjectionEngineManager, IProjectionItem iProjectionItem, InterfaceC7845m interfaceC7845m) {
        this.f63153a = defaultProjectionEngineManager;
        this.f63154b = iProjectionItem;
        this.f63155c = interfaceC7845m;
    }

    public final void accept(Object obj) {
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63153a;
        ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        IProjectionItem iProjectionItem = this.f63154b;
        StandardProjectionItem standardProjectionItem = null;
        aVar.X(iProjectionItem, null, 2);
        ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
        ProjectionDeviceInternal projectionDeviceInternalC = this.f63155c.i().c();
        aVar.getClass();
        if (iProjectionItem instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItem;
        }
        if (standardProjectionItem != null) {
            he0.j.h("player.cast.search.checkvalidtimeout", projectionDeviceInternalC, true, (StandardProjectionItem) iProjectionItem, aVar.f63524a, new C1511z(standardProjectionItem, 8));
        }
    }
}
