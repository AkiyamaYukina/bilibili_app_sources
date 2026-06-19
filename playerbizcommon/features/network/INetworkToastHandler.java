package com.bilibili.playerbizcommon.features.network;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/INetworkToastHandler.class */
public interface INetworkToastHandler {
    static /* synthetic */ boolean showCustomToast$default(INetworkToastHandler iNetworkToastHandler, VideoEnvironment videoEnvironment, long j7, boolean z6, boolean z7, boolean z8, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCustomToast");
        }
        if ((i7 & 8) != 0) {
            z7 = false;
        }
        if ((i7 & 16) != 0) {
            z8 = false;
        }
        return iNetworkToastHandler.showCustomToast(videoEnvironment, j7, z6, z7, z8);
    }

    static /* synthetic */ void showToast$default(INetworkToastHandler iNetworkToastHandler, String str, boolean z6, boolean z7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showToast");
        }
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        iNetworkToastHandler.showToast(str, z6, z7);
    }

    default boolean showCustomToast(@Nullable VideoEnvironment videoEnvironment, long j7, boolean z6, boolean z7, boolean z8) {
        return false;
    }

    void showToast(@NotNull String str, boolean z6, boolean z7);
}
