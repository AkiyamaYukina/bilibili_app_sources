package com.bilibili.search2.result.holder.aichat;

import com.bapis.bilibili.broadcast.message.main.ChatResultV2;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/a.class */
public final class a implements MossResponseHandler<ChatResultV2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f87769a;

    public a(b bVar) {
        this.f87769a = bVar;
    }

    public final void onError(MossException mossException) {
        BLog.e("[Search]AIChatConnectionManager", "onError: " + mossException);
    }

    public final void onNext(Object obj) {
        ChatResultV2 chatResultV2 = (ChatResultV2) obj;
        Integer numValueOf = null;
        String sessionId = chatResultV2 != null ? chatResultV2.getSessionId() : null;
        if (chatResultV2 != null) {
            numValueOf = Integer.valueOf(chatResultV2.getBubblesCount());
        }
        BLog.i("[Search]AIChatConnectionManager", "onNext: session=" + sessionId + ", bubbles=" + numValueOf);
        if (chatResultV2 != null) {
            this.f87769a.f87772b.a(chatResultV2);
        }
    }
}
