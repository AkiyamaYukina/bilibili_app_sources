package com.bilibili.ship.theseus.ugc;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.HistoryInfo;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/k.class */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(@org.jetbrains.annotations.NotNull com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r6) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.k.a(com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply):long");
    }

    public static final long b(PlayViewUniteReply playViewUniteReply) {
        long duration;
        long cid = playViewUniteReply.getPlayArc().getCid();
        HistoryInfo currentVideo = playViewUniteReply.getHistory().getCurrentVideo();
        if (currentVideo.getLastPlayCid() == cid) {
            Duration.Companion companion = Duration.Companion;
            duration = DurationKt.toDuration(currentVideo.getProgress(), DurationUnit.SECONDS);
        } else {
            duration = Duration.Companion.getZERO-UwyO8pc();
        }
        return duration;
    }
}
