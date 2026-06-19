package com.bilibili.lib.projection.internal.panel.fullscreen;

import Ne0.InterfaceC2723b;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ie0.C7564c;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/s.class */
public final class s implements InterfaceC2723b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionOperationConfig.NewThirdProjBubbleConfig f63433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63434b;

    public s(ProjectionOperationConfig.NewThirdProjBubbleConfig newThirdProjBubbleConfig, ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63433a = newThirdProjBubbleConfig;
        this.f63434b = projectionFullScreenActivity;
    }

    @Override // Ne0.InterfaceC2723b
    public final void a() {
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        ProjectionOperationConfig.NewThirdProjBubbleConfig newThirdProjBubbleConfig = this.f63433a;
        String id = newThirdProjBubbleConfig != null ? newThirdProjBubbleConfig.getId() : null;
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63434b;
        ProjectionDeviceInternal projectionDeviceInternal = projectionFullScreenActivity.f63382a1;
        InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
        IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(true) : null;
        StandardProjectionItem standardProjectionItem = iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null;
        Integer numValueOf = null;
        if (newThirdProjBubbleConfig != null) {
            Integer position = newThirdProjBubbleConfig.getPosition();
            numValueOf = null;
            if (position != null) {
                numValueOf = Integer.valueOf(position.intValue() - 1);
            }
        }
        aVar.g(id, projectionDeviceInternal, standardProjectionItem, numValueOf);
    }

    @Override // Ne0.InterfaceC2723b
    public final void b() {
        int i7 = ProjectionFullScreenActivity.f63352c1;
        this.f63434b.S6();
    }
}
