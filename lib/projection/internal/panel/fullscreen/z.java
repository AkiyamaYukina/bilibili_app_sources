package com.bilibili.lib.projection.internal.panel.fullscreen;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.utils.PanelState;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/z.class */
public final class z<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f63459a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/z$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f63460a;

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
            f63460a = iArr;
        }
    }

    public z(w wVar) {
        this.f63459a = wVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void accept(Object obj) throws NoWhenBranchMatchedException {
        ProjectionDeviceInternal.GlobalLinkRecoveryStep globalLinkRecoveryStep = (ProjectionDeviceInternal.GlobalLinkRecoveryStep) obj;
        int i7 = globalLinkRecoveryStep == null ? -1 : a.f63460a[globalLinkRecoveryStep.ordinal()];
        w wVar = this.f63459a;
        if (i7 == 1) {
            w.u(wVar, PanelState.LOADING);
        } else if (i7 != 2) {
            w.u(wVar, PanelState.NORMAL);
        } else {
            w.u(wVar, PanelState.DISCONNECT);
        }
    }
}
