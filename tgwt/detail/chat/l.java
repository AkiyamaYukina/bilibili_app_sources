package com.bilibili.tgwt.detail.chat;

import com.bilibili.app.comm.supermenu.core.MenuView;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuItemClickListenerV2;
import com.bilibili.app.comm.supermenu.core.listeners.OnMenuVisibilityChangeListenerV2;
import com.bilibili.bangumi.logic.page.detail.service.refactor.FetchShareMenuCallback;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.biligame.report.mma.MMARecord;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/l.class */
public final class l implements MD0.a, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f111067a;

    public /* synthetic */ l(Object obj) {
        this.f111067a = obj;
    }

    @Override // MD0.a
    public void b(MenuView menuView) {
        ChatFragment chatFragment = (ChatFragment) this.f111067a;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
        TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
        if (togetherWatchDetailPageViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            togetherWatchDetailPageViewModel2 = null;
        }
        NewShareService.showMenu$default(togetherWatchDetailPageViewModel2.getShareService(), chatFragment.requireContext(), "ogv_video_detail_wait_people_invite_together_watch_share", (FetchShareMenuCallback) null, (OnMenuItemClickListenerV2) null, menuView, (OnMenuVisibilityChangeListenerV2) null, 44, (Object) null);
    }

    public void onFailure(Call call, IOException iOException) {
        HashMap map = new HashMap();
        MMARecord mMARecord = (MMARecord) this.f111067a;
        map.put("track_id", mMARecord.getTrackId());
        map.put(ThirdPartyExtraBuilder.CALLBACK_URL, mMARecord.getCallBackUrl());
        map.put("download_event", String.valueOf(mMARecord.getDownloadInfoStatus()));
        map.put("is_success", "0");
        ReporterV3.reportClick("game-ball.all.trackid-report.0.click", map);
    }

    public void onResponse(Call call, Response response) {
        HashMap map = new HashMap();
        MMARecord mMARecord = (MMARecord) this.f111067a;
        map.put("track_id", mMARecord.getTrackId());
        map.put(ThirdPartyExtraBuilder.CALLBACK_URL, mMARecord.getCallBackUrl());
        map.put("download_event", String.valueOf(mMARecord.getDownloadInfoStatus()));
        if (response.isSuccessful()) {
            map.put("is_success", "1");
        } else {
            map.put("is_success", "0");
        }
        ReporterV3.reportClick("game-ball.all.trackid-report.0.click", map);
    }
}
