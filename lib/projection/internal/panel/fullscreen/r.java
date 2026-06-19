package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.widget.fullscreen.ProjectionGlobalLinkModeFullScreenWidget;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/r.class */
public final class r<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63431a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/r$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63432a;

        static {
            int[] iArr = new int[ProjectionDeviceInternal.DeviceState.values().length];
            try {
                iArr[ProjectionDeviceInternal.DeviceState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ProjectionDeviceInternal.DeviceState.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f63432a = iArr;
        }
    }

    public r(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63431a = projectionFullScreenActivity;
    }

    public final void accept(Object obj) {
        int i7 = a.f63432a[((ProjectionDeviceInternal.DeviceState) obj).ordinal()];
        ProjectionGlobalLinkModeFullScreenWidget projectionGlobalLinkModeFullScreenWidget = null;
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63431a;
        if (i7 == 1) {
            ProjectionGlobalLinkModeFullScreenWidget projectionGlobalLinkModeFullScreenWidget2 = projectionFullScreenActivity.f63366O;
            if (projectionGlobalLinkModeFullScreenWidget2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGlobalLinkMode");
            } else {
                projectionGlobalLinkModeFullScreenWidget = projectionGlobalLinkModeFullScreenWidget2;
            }
            projectionGlobalLinkModeFullScreenWidget.g(true);
            return;
        }
        if (i7 != 2) {
            return;
        }
        ProjectionGlobalLinkModeFullScreenWidget projectionGlobalLinkModeFullScreenWidget3 = projectionFullScreenActivity.f63366O;
        if (projectionGlobalLinkModeFullScreenWidget3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGlobalLinkMode");
            projectionGlobalLinkModeFullScreenWidget3 = null;
        }
        projectionGlobalLinkModeFullScreenWidget3.g(false);
    }
}
