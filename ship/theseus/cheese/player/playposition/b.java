package com.bilibili.ship.theseus.cheese.player.playposition;

import com.bapis.bilibili.app.playerunite.pugvanymodel.EpisodeStatus;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.HistoryInfo;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/b.class */
public final class b {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/playposition/b$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90733a;

        static {
            int[] iArr = new int[EpisodeStatus.values().length];
            try {
                iArr[EpisodeStatus.EPISODE_STATUS_TRY_WATCH_WHOLE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[EpisodeStatus.EPISODE_STATUS_TRY_WATCH_5_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f90733a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(@org.jetbrains.annotations.NotNull com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r6) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.playposition.b.a(com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply):long");
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
