package com.bilibili.lib.sharewrapper.Bshare;

import com.bilibili.lib.sharewrapper.Bshare.GShare;
import com.bilibili.lib.sharewrapper.ShareHelper;
import com.bilibili.lib.sharewrapper.ShareHelperV2;
import com.bilibili.lib.sharewrapper.online.api.ShareServiceManager;
import com.bilibili.lib.sharewrapper.report.ShareTrack;
import com.bilibili.lib.sharewrapper.report.ShareTrackHelper;
import com.bilibili.lib.simpleshare.WxHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/Bshare/BShareDelegate.class */
public final class BShareDelegate {
    @NotNull
    public final String getTAG() {
        return "InitShare";
    }

    @NotNull
    public final BShareDelegate setAccountDelegate(@NotNull GShare.Account account2) {
        a.f64411a = account2;
        ShareBLog.d("InitShare", "set BShareAccounts delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setBLog(@NotNull GShare.Log log) {
        ShareBLog.setLogDelegate(log);
        ShareBLog.d("InitShare", "set ShareBLog delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setBuvidDelegate(@NotNull GShare.Buvid buvid) {
        BShareBuvid.INSTANCE.setBuvidDelegate(buvid);
        ShareBLog.d("InitShare", "set BShareBuvid delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setConfigDelegate(@NotNull GShare.Config config) {
        BShareConfig.INSTANCE.setConfigDelegate(config);
        ShareBLog.d("InitShare", "set BShareConfig delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setFoundation(@NotNull GShare.Foundation foundation) {
        BShareFoudation.INSTANCE.setFoundationDelegate(foundation);
        ShareBLog.d("InitShare", "set BShareFoudation delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setNeurons(@NotNull GShare.Neurons neurons) {
        if (neurons != null) {
            b.f64412a = neurons;
        }
        ShareBLog.d("InitShare", "set BShareNeurons delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setPVManager(@NotNull GShare.PVAction pVAction) {
        PVActionManager.INSTANCE.setDelegate(pVAction);
        return this;
    }

    @NotNull
    public final BShareDelegate setShareApiManager(@NotNull ShareServiceManager.Delegate delegate) {
        ShareServiceManager.setShareAPIManager(delegate);
        ShareBLog.d("InitShare", "set ShareAPIManager delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setShareHelper(@NotNull ShareHelper shareHelper) {
        ShareHelperV2.setShareHelperDelegate(shareHelper);
        ShareBLog.d("InitShare", "set shareHelper delegate");
        return this;
    }

    @NotNull
    public final BShareDelegate setShareTrackHelper(@NotNull ShareTrack shareTrack) {
        ShareTrackHelper.INSTANCE.setShareTrackDelegate(shareTrack);
        return this;
    }

    @NotNull
    public final BShareDelegate setThirdAppKey(@NotNull GShare.ThirdAppKey thirdAppKey) {
        ThirdAppKey.INSTANCE.setDelegate(thirdAppKey);
        String qQAppId = thirdAppKey.getQQAppId();
        String wXAppId = thirdAppKey.getWXAppId();
        String sinaAppKey = thirdAppKey.getSinaAppKey();
        StringBuilder sbA = G0.b.a("set ThirdAppKey delegate, qqAppId=", qQAppId, ", wxAppId=", wXAppId, ", sinaAppId=");
        sbA.append(sinaAppKey);
        ShareBLog.d("InitShare", sbA.toString());
        return this;
    }

    @NotNull
    public final BShareDelegate setWxHelperImpl(@NotNull WxHelper.WxHelperDelegate wxHelperDelegate) {
        WxHelper.INSTANCE.setWxHelperImpl(wxHelperDelegate);
        ShareBLog.d("InitShare", "set ShareAPIManager delegate");
        return this;
    }
}
