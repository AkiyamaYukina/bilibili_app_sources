package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.utils.PanelState;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/o.class */
public final class o<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63427a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/o$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63428a;

        static {
            int[] iArr = new int[ProjectionDeviceInternal.GlobalLinkRecoveryStep.values().length];
            try {
                iArr[ProjectionDeviceInternal.GlobalLinkRecoveryStep.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ProjectionDeviceInternal.GlobalLinkRecoveryStep.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f63428a = iArr;
        }
    }

    public o(ProjectionFullScreenActivity projectionFullScreenActivity) {
        this.f63427a = projectionFullScreenActivity;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void accept(Object obj) throws NoWhenBranchMatchedException {
        ProjectionDeviceInternal.GlobalLinkRecoveryStep globalLinkRecoveryStep = (ProjectionDeviceInternal.GlobalLinkRecoveryStep) obj;
        int i7 = globalLinkRecoveryStep == null ? -1 : a.f63428a[globalLinkRecoveryStep.ordinal()];
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63427a;
        if (i7 == 1) {
            ProjectionFullScreenActivity.P6(projectionFullScreenActivity, PanelState.LOADING);
        } else if (i7 != 2) {
            ProjectionFullScreenActivity.P6(projectionFullScreenActivity, PanelState.NORMAL);
        } else {
            ProjectionFullScreenActivity.P6(projectionFullScreenActivity, PanelState.DISCONNECT);
        }
    }
}
