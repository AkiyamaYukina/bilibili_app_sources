package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionDeviceNameWidget;
import he0.C7433b;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/x.class */
public final class x<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f63457a;

    public x(w wVar) {
        this.f63457a = wVar;
    }

    public final Object apply(Object obj) {
        com.bilibili.lib.projection.internal.widget.e eVar;
        com.bilibili.lib.projection.internal.widget.e eVar2;
        ProjectionDeviceInternal device = ((com.bilibili.lib.projection.internal.device.a) obj).getDevice();
        w wVar = this.f63457a;
        ProjectionDeviceNameWidget projectionDeviceNameWidget = wVar.f63449n;
        if (projectionDeviceNameWidget != null) {
            projectionDeviceNameWidget.setText(device.getRealName());
        }
        if (!C7433b.b(device) && (((eVar = wVar.f63454s) == null || !eVar.isShowing()) && (eVar2 = wVar.f63454s) != null)) {
            com.bilibili.lib.projection.internal.widget.e.b(eVar2, 0, 0, 0L, 3);
        }
        return device.j();
    }
}
