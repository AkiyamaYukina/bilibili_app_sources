package com.bilibili.playerbizcommon.features.hardware;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/hardware/IHardwareDelegate.class */
public interface IHardwareDelegate {
    default boolean changeOrientationEnable() {
        return true;
    }

    default boolean onAdjustControlContainerType(@NotNull ScreenModeType screenModeType, @NotNull Video.PlayableParams playableParams) {
        return false;
    }

    default boolean onAdjustWindowInset(@NotNull WindowInset windowInset) {
        return false;
    }

    @Nullable
    default ControlContainerType onGetControlContainerType(@NotNull ScreenModeType screenModeType) {
        return null;
    }

    @Nullable
    default ControlContainerType onGetControlContainerTypeForOrientation(int i7) {
        return null;
    }

    void onHandleSwitchControlContainerType(@NotNull ControlContainerType controlContainerType);
}
