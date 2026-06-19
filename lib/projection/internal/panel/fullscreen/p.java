package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import he0.C7433b;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/p.class */
public final class p<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63429a;

    public p(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63429a = projectionFullScreenActivity;
    }

    public final Object apply(Object obj) {
        com.bilibili.lib.projection.internal.widget.e eVar;
        com.bilibili.lib.projection.internal.widget.e eVar2;
        com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) obj;
        ProjectionDeviceInternal device = aVar.getDevice();
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63429a;
        projectionFullScreenActivity.f63382a1 = device;
        ProjectionDeviceInternal device2 = aVar.getDevice();
        boolean zB = C7433b.b(device2);
        if (!zB && (((eVar = projectionFullScreenActivity.f63362K) == null || !eVar.isShowing()) && (eVar2 = projectionFullScreenActivity.f63362K) != null)) {
            com.bilibili.lib.projection.internal.widget.e.b(eVar2, 40, 0, 600L, 2);
        }
        projectionFullScreenActivity.f63354C = zB;
        if (aVar.getDevice() instanceof ProjectionDeviceInternal.b) {
            projectionFullScreenActivity.finish();
        } else {
            projectionFullScreenActivity.f63360I = device2;
        }
        return device2.j();
    }
}
