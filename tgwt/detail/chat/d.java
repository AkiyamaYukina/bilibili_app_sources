package com.bilibili.tgwt.detail.chat;

import android.net.Uri;
import android.view.View;
import com.bilibili.bangumi.data.page.detail.entity.BangumiUniformSeason;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService;
import com.bilibili.bangumi.module.chatroom.ChatRoomInfo;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.playset.playlist.ui.LoadingErrorEmptyView;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.ui.TogetherWatchDetailPageViewModel;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/d.class */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f111058b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f111057a = i7;
        this.f111058b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri uri;
        ChatRoomInfo chatRoomInfo;
        switch (this.f111057a) {
            case 0:
                ChatFragment chatFragment = (ChatFragment) this.f111058b;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel = chatFragment.f111019i;
                TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel2 = togetherWatchDetailPageViewModel;
                if (togetherWatchDetailPageViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                    togetherWatchDetailPageViewModel2 = null;
                }
                togetherWatchDetailPageViewModel2.getScreenStateService().getScreenStateHelper().h();
                p pVar = chatFragment.f111021k;
                p pVar2 = pVar;
                if (pVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                    pVar2 = null;
                }
                String str = pVar2.f111103O.get();
                if (str != null && (uri = Uri.parse(str)) != null) {
                    boolean zAreEqual = Intrinsics.areEqual(uri.getQueryParameter("openstyle"), "1");
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel3 = chatFragment.f111019i;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel4 = togetherWatchDetailPageViewModel3;
                    if (togetherWatchDetailPageViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel4 = null;
                    }
                    LegacyPagePopService webAndExternalBusinessPagePopService = togetherWatchDetailPageViewModel4.getWebAndExternalBusinessPagePopService();
                    p pVar3 = chatFragment.f111021k;
                    p pVar4 = pVar3;
                    if (pVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCharViewModel");
                        pVar4 = null;
                    }
                    String strAdjustUrl$default = LegacyPagePopService.adjustUrl$default(webAndExternalBusinessPagePopService, String.valueOf(pVar4.f111103O.get()), !zAreEqual, false, (String) null, 12, (Object) null);
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel5 = chatFragment.f111019i;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel6 = togetherWatchDetailPageViewModel5;
                    if (togetherWatchDetailPageViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel6 = null;
                    }
                    LegacyPagePopService.showLayer$default(togetherWatchDetailPageViewModel6.getWebAndExternalBusinessPagePopService(), chatFragment.requireContext(), strAdjustUrl$default, (String) null, 0, 12, (Object) null);
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel7 = chatFragment.f111019i;
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel8 = togetherWatchDetailPageViewModel7;
                    if (togetherWatchDetailPageViewModel7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel8 = null;
                    }
                    ChatService chatService = togetherWatchDetailPageViewModel8.getChatService();
                    TogetherWatchDetailPageViewModel togetherWatchDetailPageViewModel9 = chatFragment.f111019i;
                    if (togetherWatchDetailPageViewModel9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
                        togetherWatchDetailPageViewModel9 = null;
                    }
                    BangumiUniformSeason season = togetherWatchDetailPageViewModel9.getSeasonService().getSeason();
                    Neurons.reportClick(false, "pgc.watch-together-cinema.pendant.0.click", chatService.c(MapsKt.mapOf(TuplesKt.to("wtgt_scene", (season == null || (chatRoomInfo = season.E) == null || chatRoomInfo.u() != 6) ? "3" : "2"))));
                    break;
                }
                break;
            case 1:
                Runnable runnable = (Runnable) this.f111058b;
                int i7 = LoadingErrorEmptyView.f85508f;
                runnable.run();
                break;
            default:
                ((com.bilibili.upper.module.contribute.up.ui.section.j) this.f111058b).invoke(Boolean.TRUE);
                break;
        }
    }
}
