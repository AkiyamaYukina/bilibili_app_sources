package com.bilibili.lib.sharewrapper.online.api;

import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.sharewrapper.Bshare.BShareBuvid;
import com.bilibili.lib.sharewrapper.Bshare.PVActionManager;
import com.bilibili.lib.sharewrapper.online.ShareOnlineParams;
import com.bilibili.lib.sharewrapper.online.api.ShareServiceManager;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Callback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/online/api/a.class */
public final class a implements ShareServiceManager.Delegate {
    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void clickShare(@Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable String str4, @NotNull String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i8, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Long l7, @Nullable String str14, @NotNull BiliApiDataCallback<ShareClickResult> biliApiDataCallback) {
        ShareAPIService shareAPIService = (ShareAPIService) ServiceGenerator.createService(ShareAPIService.class);
        String strValueOf = l7 != null ? String.valueOf(l7.longValue()) : null;
        String sessionId = SessionManager.INSTANCE.getSessionId();
        String actionId = PVActionManager.INSTANCE.getActionId();
        String str15 = actionId;
        if (actionId == null) {
            str15 = "";
        }
        shareAPIService.clickShare(str, str2, str3, i7, str4, str5, str9, str10, str6, str7, i8, str8, str11, str12, str13, strValueOf, str14, Constant.SDK_OS, 1, sessionId, str15).enqueue(biliApiDataCallback);
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    @NotNull
    public final BiliCall<GeneralResponse<ShareChannels>> getShareChannels(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        return ShareAPIService.a((ShareAPIService) ServiceGenerator.createService(ShareAPIService.class), str, str2, str3, str5, str6, str4, str7, str8, str9, str10);
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void getShareChannels(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull BiliApiDataCallback<ShareChannels> biliApiDataCallback) {
        ShareAPIService.a((ShareAPIService) ServiceGenerator.createService(ShareAPIService.class), str, str2, str3, str5, str6, str4, str7, str8, str9, str10).enqueue(biliApiDataCallback);
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void placardShare(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull BiliApiDataCallback<PlacardData> biliApiDataCallback) {
        ShareAPIService shareAPIService = (ShareAPIService) ServiceGenerator.createService(ShareAPIService.class);
        String buvid = BShareBuvid.getBuvid();
        String actionId = PVActionManager.INSTANCE.getActionId();
        String str5 = actionId;
        if (actionId == null) {
            str5 = "";
        }
        shareAPIService.placardShare(str, str2, buvid, str3, str4, str5).enqueue(biliApiDataCallback);
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void quickWord(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @NotNull BiliApiDataCallback<QuickWordData> biliApiDataCallback) {
        ((ShareAPIService) ServiceGenerator.createService(ShareAPIService.class)).quickWord(str, str2, str3, str4, str5, str6, Constant.SDK_OS, str7, str8, str9, str10, 1, SessionManager.INSTANCE.getSessionId()).enqueue(biliApiDataCallback);
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void shareFinish(@Nullable String str, boolean z6, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        ((ShareAPIService) ServiceGenerator.createService(ShareAPIService.class)).shareFinish(str, z6, str2, str3, str4, 1, SessionManager.INSTANCE.getSessionId()).enqueue();
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void shareFinish(boolean z6, @Nullable String str, @Nullable String str2, @Nullable ShareOnlineParams shareOnlineParams, @NotNull Callback<GeneralResponse<FinishResult>> callback) {
        ((ShareAPIService) ServiceGenerator.createService(ShareAPIService.class)).shareFinish(str, z6, shareOnlineParams != null ? shareOnlineParams.spmId : null, shareOnlineParams != null ? shareOnlineParams.fromSpmId : null, shareOnlineParams != null ? shareOnlineParams.objectExtraFields : null, shareOnlineParams != null ? shareOnlineParams.shareId : null, shareOnlineParams != null ? shareOnlineParams.oid : null, shareOnlineParams != null ? shareOnlineParams.sid : null, shareOnlineParams != null ? shareOnlineParams.shareOrigin : null, str2, 1, SessionManager.INSTANCE.getSessionId()).enqueue(callback);
    }

    @Override // com.bilibili.lib.sharewrapper.online.api.ShareServiceManager.Delegate
    public final void wordShare(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull BiliApiDataCallback<WordShareData> biliApiDataCallback) {
        ((ShareAPIService) ServiceGenerator.createService(ShareAPIService.class)).wordShare(str, str2, str3, str4, str5, str6, Constant.SDK_OS, str7, str8, str9, 1, SessionManager.INSTANCE.getSessionId()).enqueue(biliApiDataCallback);
    }
}
