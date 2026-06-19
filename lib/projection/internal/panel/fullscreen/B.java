package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionGlobalLinkModeFullScreenWidget;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/B.class */
public final class B<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f63338a;

    public B(w wVar) {
        this.f63338a = wVar;
    }

    public final void accept(Object obj) {
        ProjectionDeviceInternal.DeviceState deviceState = (ProjectionDeviceInternal.DeviceState) obj;
        ProjectionGlobalLinkModeFullScreenWidget projectionGlobalLinkModeFullScreenWidget = this.f63338a.f63447l;
        if (projectionGlobalLinkModeFullScreenWidget != null) {
            projectionGlobalLinkModeFullScreenWidget.g(deviceState == ProjectionDeviceInternal.DeviceState.CONNECTED);
        }
    }
}
