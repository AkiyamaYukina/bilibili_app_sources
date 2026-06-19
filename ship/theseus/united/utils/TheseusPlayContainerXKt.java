package com.bilibili.ship.theseus.united.utils;

import com.bilibili.playerbizcommon.features.network.VideoEnvironment;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/TheseusPlayContainerXKt.class */
public final class TheseusPlayContainerXKt {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/TheseusPlayContainerXKt$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104839a;

        static {
            int[] iArr = new int[VideoEnvironment.values().length];
            try {
                iArr[VideoEnvironment.WIFI_FREE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[VideoEnvironment.FREE_DATA_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[VideoEnvironment.FREE_DATA_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f104839a = iArr;
        }
    }

    @NotNull
    public static final Flow<Oi1.d> a(@NotNull IPlayerSettingService iPlayerSettingService) {
        return FlowKt.conflate(FlowKt.callbackFlow(new TheseusPlayContainerXKt$cloudConfigFlow$1(iPlayerSettingService, null)));
    }

    @NotNull
    public static final Flow<ScreenModeType> b(@NotNull IControlContainerService iControlContainerService) {
        return FlowKt.conflate(FlowKt.callbackFlow(new TheseusPlayContainerXKt$screenTypeFlow$1(iControlContainerService, null)));
    }
}
