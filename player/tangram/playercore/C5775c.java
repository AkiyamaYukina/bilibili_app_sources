package com.bilibili.player.tangram.playercore;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.HookErrorType;
import tv.danmaku.biliplayerv2.service.OnMeteredNetworkUrlHookListener;
import tv.danmaku.biliplayerv2.service.network.PlayerFreeDataHelper;
import tv.danmaku.ijk.media.player.IjkNetworkUtils;

/* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/c.class */
public final class C5775c implements OnMeteredNetworkUrlHookListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5776d f79441a;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.c$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/c$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f79442a;

        static {
            int[] iArr = new int[IjkNetworkUtils.NetWorkType.values().length];
            try {
                iArr[IjkNetworkUtils.NetWorkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[IjkNetworkUtils.NetWorkType.WIFI_METERED.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[IjkNetworkUtils.NetWorkType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f79442a = iArr;
        }
    }

    public C5775c(C5776d c5776d) {
        this.f79441a = c5776d;
    }

    public final String onMeteredNetworkUrlHook(String str, IjkNetworkUtils.NetWorkType netWorkType, HookErrorType hookErrorType) {
        int i7 = a.f79442a[netWorkType.ordinal()];
        C5776d c5776d = this.f79441a;
        if (i7 == 1 || i7 == 2) {
            BLog.i("NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$listener$1-onMeteredNetworkUrlHook", "[tangram-player-core-NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$listener$1-onMeteredNetworkUrlHook] from play core onMeteredNetworkUrlHook, type is wifi");
            C5776d.c(c5776d, PlayNetworkEnv.c.f79290a);
        } else if (i7 != 3) {
            defpackage.a.b("[tangram-player-core-NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$listener$1-onMeteredNetworkUrlHook] ", "from play core onMeteredNetworkUrlHook, type is " + netWorkType, "NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$listener$1-onMeteredNetworkUrlHook");
            PlayerFreeDataHelper playerFreeDataHelper = PlayerFreeDataHelper.INSTANCE;
            if (playerFreeDataHelper.shouldProcessUrl() && (playerFreeDataHelper.isFreeCardUser() || playerFreeDataHelper.isFreePackageUser())) {
                MediaResource mediaResource = c5776d.f79443a.getMediaResource();
                if (mediaResource != null && mediaResource.isDrm()) {
                    C5776d.c(c5776d, new PlayNetworkEnv.a(PlayNetworkEnv.Info.OnFreeDataFailed));
                } else if (hookErrorType == HookErrorType.TYPE_FREE_DATA_URL_INVALID) {
                    C5776d.c(c5776d, new PlayNetworkEnv.a(PlayNetworkEnv.Info.OnFreeDataFailedAndDowngradeMobile));
                } else if (playerFreeDataHelper.checkMediaUrlProcessed(str)) {
                    C5776d.c(c5776d, new PlayNetworkEnv.a(PlayNetworkEnv.Info.OnFreeDataSuccessful));
                } else {
                    C5776d.c(c5776d, new PlayNetworkEnv.a(PlayNetworkEnv.Info.OnFreeDataFailed));
                }
            } else {
                C5776d.c(c5776d, new PlayNetworkEnv.a(PlayNetworkEnv.Info.Cellular));
            }
        } else {
            BLog.i("NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$listener$1-onMeteredNetworkUrlHook", "[tangram-player-core-NetworkEnvByPlayCoreImpl$collectPlayCoreNetwork$listener$1-onMeteredNetworkUrlHook] from play core onMeteredNetworkUrlHook, type is none network");
            C5776d.c(c5776d, PlayNetworkEnv.b.f79289a);
        }
        return str;
    }
}
