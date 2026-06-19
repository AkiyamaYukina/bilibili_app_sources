package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionDeviceSwitchFullScreenWidget;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionSpeedFullScreenWidget;
import he0.C7433b;
import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import ze0.C9190q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/t.class */
public final class t<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63435a;

    public t(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63435a = projectionFullScreenActivity;
    }

    public final void accept(Object obj) {
        com.bilibili.lib.projection.internal.device.a aVarS;
        ProjectionDeviceInternal device = ((com.bilibili.lib.projection.internal.device.a) obj).getDevice();
        int i7 = ProjectionFullScreenActivity.f63352c1;
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63435a;
        projectionFullScreenActivity.getClass();
        boolean zE = C7433b.e(device);
        InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
        boolean z6 = interfaceC7845m != null && interfaceC7845m.isGlobalLinkMode();
        ProjectionSpeedFullScreenWidget projectionSpeedFullScreenWidget = projectionFullScreenActivity.f63364M;
        StandardProjectionItem standardProjectionItem = null;
        ProjectionSpeedFullScreenWidget projectionSpeedFullScreenWidget2 = projectionSpeedFullScreenWidget;
        if (projectionSpeedFullScreenWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSpeedWidget");
            projectionSpeedFullScreenWidget2 = null;
        }
        projectionSpeedFullScreenWidget2.setVisibility(zE ? 0 : 8);
        ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget = projectionFullScreenActivity.f63363L;
        ProjectionDeviceSwitchFullScreenWidget projectionDeviceSwitchFullScreenWidget2 = projectionDeviceSwitchFullScreenWidget;
        if (projectionDeviceSwitchFullScreenWidget == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwitchWidget");
            projectionDeviceSwitchFullScreenWidget2 = null;
        }
        projectionDeviceSwitchFullScreenWidget2.setVisibility(!z6 ? 0 : 8);
        if (zE) {
            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
            InterfaceC7845m interfaceC7845m2 = projectionFullScreenActivity.f63357F;
            Float fValueOf = interfaceC7845m2 != null ? Float.valueOf(interfaceC7845m2.getPlaySpeed()) : null;
            InterfaceC7845m interfaceC7845m3 = projectionFullScreenActivity.f63357F;
            ProjectionDeviceInternal device2 = (interfaceC7845m3 == null || (aVarS = interfaceC7845m3.s()) == null) ? null : aVarS.getDevice();
            InterfaceC7845m interfaceC7845m4 = projectionFullScreenActivity.f63357F;
            IProjectionItem iProjectionItemN = interfaceC7845m4 != null ? interfaceC7845m4.n(true) : null;
            if (iProjectionItemN instanceof StandardProjectionItem) {
                standardProjectionItem = (StandardProjectionItem) iProjectionItemN;
            }
            aVar.getClass();
            he0.j.g("player.player.screencast.speed-button-show.player", device2, standardProjectionItem, aVar.f63524a, null, new C9190q(2, fValueOf), 48);
        }
    }
}
