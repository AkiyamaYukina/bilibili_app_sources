package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/j.class */
public final class j implements ProjectionNewUiDeviceInfoWidget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63419a;

    public j(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63419a = projectionFullScreenActivity;
    }

    @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget.a
    public final void a() {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        com.bilibili.lib.projection.internal.device.a aVarS2;
        InterfaceC7845m client;
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63419a;
        if (projectionFullScreenActivity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            ProjectionFullScreenActivity.Q6(projectionFullScreenActivity);
        } else {
            InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
            if (interfaceC7845m != null) {
                InterfaceC7845m.h(interfaceC7845m, projectionFullScreenActivity, false, true, false, 10);
            }
        }
        InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
        if (interfaceC7845m2 == null || (reporter = interfaceC7845m2.getReporter()) == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m3 = projectionFullScreenActivity.f63357F;
        IProjectionItem iProjectionItemN = (interfaceC7845m3 == null || (aVarS2 = interfaceC7845m3.s()) == null || (client = aVarS2.getClient()) == null) ? null : client.n(true);
        StandardProjectionItem standardProjectionItem = iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null;
        InterfaceC7845m interfaceC7845m4 = projectionFullScreenActivity.f63357F;
        ProjectionDeviceInternal device = (interfaceC7845m4 == null || (aVarS = interfaceC7845m4.s()) == null) ? null : aVarS.getDevice();
        ProjectionOperationConfig.ThirdProjBubbleConfig thirdProjBubbleConfig = projectionFullScreenActivity.f63373V;
        reporter.j(standardProjectionItem, device, 2, thirdProjBubbleConfig != null ? thirdProjBubbleConfig.getId() : null, projectionFullScreenActivity.f63374W ? "1" : "0");
    }
}
