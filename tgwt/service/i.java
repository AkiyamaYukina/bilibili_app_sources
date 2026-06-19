package com.bilibili.tgwt.service;

import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.tencent.connect.common.Constants;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/i.class */
public final class i<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatService f111969a;

    public i(ChatService chatService) {
        this.f111969a = chatService;
    }

    public final void accept(Object obj) {
        Ql.b bVar = (Ql.b) obj;
        ChatService chatService = this.f111969a;
        if (chatService.f111859H) {
            return;
        }
        boolean z6 = Intrinsics.areEqual(bVar.j, Constants.VIA_REPORT_TYPE_CHAT_AUDIO) || Intrinsics.areEqual(bVar.j, Constants.VIA_REPORT_TYPE_CHAT_VIDEO);
        chatService.f111872U = z6;
        if (z6) {
            BangumiPlayerContainerService bangumiPlayerContainerService = chatService.f111895n;
            bangumiPlayerContainerService.getPlayerServiceController().j().registerVolumeChangeObserver(chatService.f111871T);
            bangumiPlayerContainerService.getPlayerServiceController().j().setVolume(0.5f, 0.5f);
        }
        chatService.f111859H = true;
    }
}
