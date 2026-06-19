package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget;
import ie0.C7564c;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/k.class */
public final class k implements ProjectionNewUiTvControlWidget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63420a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/k$a.class */
    public static final class a implements ProjectionDeviceInternal.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProjectionDeviceInternal f63421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProjectionFullScreenActivity f63422b;

        public a(ProjectionDeviceInternal projectionDeviceInternal, ProjectionFullScreenActivity projectionFullScreenActivity) {
            this.f63421a = projectionDeviceInternal;
            this.f63422b = projectionFullScreenActivity;
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void a() {
        }

        @Override // com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal.a
        public final void b(boolean z6) {
            ProjectionFullScreenActivity projectionFullScreenActivity = this.f63422b;
            ProjectionDeviceInternal projectionDeviceInternal = this.f63421a;
            if (projectionDeviceInternal != null) {
                com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
                InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
                StandardProjectionItem standardProjectionItem = null;
                boolean z7 = true;
                IProjectionItem iProjectionItemN = interfaceC7845m != null ? interfaceC7845m.n(true) : null;
                if (iProjectionItemN instanceof StandardProjectionItem) {
                    standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
                }
                InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
                if (interfaceC7845m2 == null || !interfaceC7845m2.isGlobalLinkMode()) {
                    z7 = false;
                }
                aVar.K(standardProjectionItem, projectionDeviceInternal, z7, 2);
            }
            projectionFullScreenActivity.showPanel("ProjectionClientQualityPanel");
        }
    }

    public k(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63420a = projectionFullScreenActivity;
    }

    @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget.a
    public final void a(ProjectionDeviceInternal projectionDeviceInternal) {
        C7564c.f121625a.j(new a(projectionDeviceInternal, this.f63420a));
    }

    @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget.a
    public final void b(boolean z6) {
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63420a;
        if (!z6) {
            if (projectionFullScreenActivity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                ProjectionFullScreenActivity.Q6(projectionFullScreenActivity);
                return;
            }
            InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
            if (interfaceC7845m != null) {
                InterfaceC7845m.h(interfaceC7845m, projectionFullScreenActivity, false, true, false, 10);
                return;
            }
            return;
        }
        InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
        if (interfaceC7845m2 != null) {
            boolean danmakuShow = interfaceC7845m2.getDanmakuShow();
            com.bilibili.lib.projection.internal.reporter.a reporter = interfaceC7845m2.getReporter();
            boolean z7 = !danmakuShow;
            reporter.u(interfaceC7845m2.i().c(), z7);
            interfaceC7845m2.danmakuToggle(z7, true);
        }
    }

    @Override // com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiTvControlWidget.a
    public final void c() {
        com.bilibili.lib.projection.internal.reporter.a reporter;
        com.bilibili.lib.projection.internal.device.a aVarS;
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63420a;
        projectionFullScreenActivity.showPanel("ProjectionClientSpeedPanel");
        InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
        if (interfaceC7845m == null || (reporter = interfaceC7845m.getReporter()) == null) {
            return;
        }
        InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
        StandardProjectionItem standardProjectionItem = null;
        Float fValueOf = interfaceC7845m2 != null ? Float.valueOf(interfaceC7845m2.getPlaySpeed()) : null;
        InterfaceC7845m interfaceC7845m3 = projectionFullScreenActivity.f63357F;
        ProjectionDeviceInternal device = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
        InterfaceC7845m interfaceC7845m4 = projectionFullScreenActivity.f63357F;
        IProjectionItem iProjectionItemN = interfaceC7845m4 != null ? interfaceC7845m4.n(true) : null;
        if (iProjectionItemN instanceof StandardProjectionItem) {
            standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
        }
        reporter.T(2, fValueOf, device, standardProjectionItem);
    }
}
