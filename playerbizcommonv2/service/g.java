package com.bilibili.playerbizcommonv2.service;

import android.content.Context;
import androidx.compose.foundation.Q;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.features.hardware.HardwareService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.collection.Collections;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.videoplayer.core.log.PlayerLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/g.class */
@StabilityInferred(parameters = 0)
public final class g implements IPlayerService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private IPlayDirector f81875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @InjectPlayerService
    private IControlContainerService f81876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InjectPlayerService
    private Context f81877d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collections.SafeIteratorList<Object> f81874a = Q.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f81878e = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/g$a.class */
    public static final class a implements VideoDirectorObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f81879a;

        public a(g gVar) {
            this.f81879a = gVar;
        }

        public final void onItemStart(Video.PlayableParams playableParams) {
            g gVar = this.f81879a;
            IPlayDirector iPlayDirector = gVar.f81875b;
            IPlayDirector iPlayDirector2 = iPlayDirector;
            if (iPlayDirector == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlayDirectorService");
                iPlayDirector2 = null;
            }
            Video.PlayableParams currentPlayableParams = iPlayDirector2.getCurrentPlayableParams();
            if (currentPlayableParams == null) {
                return;
            }
            ScreenModeType screenModeTypeB = g.b(gVar);
            if (currentPlayableParams.getDisplayParams().getDisplayOrientation() == DisplayOrientation.VERTICAL) {
                if (screenModeTypeB == ScreenModeType.LANDSCAPE_FULLSCREEN) {
                    PlayerLog.i(HardwareService.TAG, "current screen mode type is Landscape fullscreen, but video orientation is vertical, do not match");
                }
            } else if (screenModeTypeB == ScreenModeType.VERTICAL_FULLSCREEN) {
                PlayerLog.i(HardwareService.TAG, "current screen mode type is vertical fullscreen, but video orientation is landscape, do not match");
            }
        }
    }

    public static final ScreenModeType b(g gVar) {
        IControlContainerService iControlContainerService = gVar.f81876c;
        IControlContainerService iControlContainerService2 = iControlContainerService;
        if (iControlContainerService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mControlContainerService");
            iControlContainerService2 = null;
        }
        return iControlContainerService2.getScreenModeType();
    }

    public final void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
    }

    public final void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
        IPlayDirector iPlayDirector = this.f81875b;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayDirectorService");
            iPlayDirector2 = null;
        }
        iPlayDirector2.addVideoDirectorObserver(this.f81878e);
    }

    public final void onStop() {
        IPlayDirector iPlayDirector = this.f81875b;
        IPlayDirector iPlayDirector2 = iPlayDirector;
        if (iPlayDirector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayDirectorService");
            iPlayDirector2 = null;
        }
        iPlayDirector2.removeVideoDirectorObserver(this.f81878e);
    }

    @NotNull
    public final PlayerServiceManager.ServiceConfig serviceConfig() {
        return PlayerServiceManager.ServiceConfig.Companion.obtain(true);
    }
}
