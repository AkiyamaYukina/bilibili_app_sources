package com.bilibili.sistersplayer.p2p.peer;

import com.bilibili.sistersplayer.p2p.utils.PLog;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.Loggable;
import org.webrtc.Logging;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/peer/d.class */
public final /* synthetic */ class d implements Loggable {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void onLogMessage(String str, Logging.Severity severity, String str2) throws NoWhenBranchMatchedException {
        PLog.onLogMessage(severity, str2, str);
    }
}
