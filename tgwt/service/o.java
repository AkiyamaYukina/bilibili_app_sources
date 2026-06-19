package com.bilibili.tgwt.service;

import com.bilibili.bililive.bilirtc.openplatform.exception.MixBaseException;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/o.class */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatVoiceRtcService f111992a;

    public o(ChatVoiceRtcService chatVoiceRtcService) {
        this.f111992a = chatVoiceRtcService;
    }

    public final void a(MixBaseException mixBaseException) {
        int code = mixBaseException.getCode();
        ChatVoiceRtcService chatVoiceRtcService = this.f111992a;
        if (code == 1) {
            Kl.a.a(chatVoiceRtcService.f111936e, 2131836352);
        } else if (code == 2) {
            com.bilibili.ogv.infra.util.e.b(mixBaseException);
        } else if (code != 3 && code == 4) {
            Kl.a.a(chatVoiceRtcService.f111936e, 2131836352);
        }
        BLog.e("ChatVoiceRtcService$openRtcBizCallback$1-onError", "[together-watch-ChatVoiceRtcService$openRtcBizCallback$1-onError] voice room onError", mixBaseException);
    }
}
