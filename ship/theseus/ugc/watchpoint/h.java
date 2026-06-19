package com.bilibili.ship.theseus.ugc.watchpoint;

import com.bapis.bilibili.app.distribution.SetUserPreferenceReply;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/h.class */
public final class h implements MossResponseHandler<SetUserPreferenceReply> {
    public final void onError(MossException mossException) {
        de.a.b("set segment progress switch error! ", mossException != null ? mossException.toPrintString() : null);
    }

    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
