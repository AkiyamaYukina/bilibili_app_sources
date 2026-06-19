package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/i.class */
public final class i implements ProjectionNewUiTopBarWidget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63418a;

    public i(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63418a = projectionFullScreenActivity;
    }

    @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget.a
    public final void onBackClick() {
        this.f63418a.f63383b1.a();
    }

    @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTopBarWidget.a
    public final void onCloseClick() {
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63418a;
        InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
        if (interfaceC7845m != null) {
            interfaceC7845m.reportStop();
        }
        InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
        if (interfaceC7845m2 != null) {
            interfaceC7845m2.stop();
        }
        InterfaceC7845m interfaceC7845m3 = projectionFullScreenActivity.f63357F;
        if (interfaceC7845m3 != null) {
            ProjectionClient.stopGlobalLink$default(interfaceC7845m3, false, 1, null);
        }
        projectionFullScreenActivity.f63383b1.f();
    }
}
