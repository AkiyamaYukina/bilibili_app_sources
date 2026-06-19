package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.widget.fullscreen.newui.ProjectionNewUiDeviceInfoWidget;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/g.class */
public final class g<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63415a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/g$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63416a;

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
            f63416a = iArr;
        }
    }

    public g(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63415a = projectionFullScreenActivity;
    }

    public final void accept(Object obj) {
        ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget;
        int i7 = a.f63416a[((ProjectionDeviceInternal.DeviceState) obj).ordinal()];
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63415a;
        if (i7 != 1) {
            if (i7 == 2 && (projectionNewUiDeviceInfoWidget = projectionFullScreenActivity.f63387v0) != null) {
                projectionNewUiDeviceInfoWidget.setBiLinkHighlight(false);
                return;
            }
            return;
        }
        ProjectionNewUiDeviceInfoWidget projectionNewUiDeviceInfoWidget2 = projectionFullScreenActivity.f63387v0;
        if (projectionNewUiDeviceInfoWidget2 != null) {
            projectionNewUiDeviceInfoWidget2.setBiLinkHighlight(true);
        }
    }
}
