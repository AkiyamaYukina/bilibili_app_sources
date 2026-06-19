package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.servercomm.ServerClock;
import com.bilibili.inline.plugin.HistoryPlugin;
import com.bilibili.ogv.pub.play.OGVPlayableParams;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.player.history.MediaHistoryEntry;
import cq0.C6750c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.video.bilicardplayer.ICardPlayerContext;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/i.class */
@StabilityInferred(parameters = 0)
public final class i extends HistoryPlugin {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f70944f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f70945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final UB.b f70946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f70947e;

    public i() {
        this(null, 1, null);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [UB.b, java.lang.Object] */
    public i(@Nullable String str) {
        this.f70945c = str;
        this.f70946d = new Object();
    }

    public /* synthetic */ i(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }

    public final void a(@NotNull Video.PlayableParams playableParams, long j7, long j8, boolean z6) {
        MediaHistoryEntry mediaHistoryEntry;
        boolean z7;
        if (!(playableParams instanceof OGVPlayableParams)) {
            R9.v.a("save ogv inline history from error params , params = ", playableParams.getLogDescription(), "BangumiInlineHistoryService");
            return;
        }
        OGVPlayableParams oGVPlayableParams = (OGVPlayableParams) playableParams;
        String strA = UB.c.a(oGVPlayableParams.getSeasonId(), oGVPlayableParams.getEpId(), oGVPlayableParams.getCid());
        if (((long) 1000) + j7 >= j8) {
            mediaHistoryEntry = new MediaHistoryEntry((int) j8);
            z7 = true;
        } else {
            mediaHistoryEntry = new MediaHistoryEntry((int) j7);
            z7 = false;
        }
        IMediaHistoryKeyParams mediaHistoryKayParams = oGVPlayableParams.getMediaHistoryKayParams();
        int iIntValue = 0;
        if (mediaHistoryKayParams != null) {
            MediaHistoryEntry history = readHistory(mediaHistoryKayParams);
            Integer numValueOf = history != null ? Integer.valueOf(history.getProgress()) : null;
            iIntValue = 0;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        mediaHistoryEntry.setForceStartAccurateSeek(true);
        this.f70946d.write(strA, mediaHistoryEntry);
        if (z6) {
            long j9 = iIntValue;
            long j10 = (0 > j9 || j9 > j7) ? 0L : j7 - j9;
            h hVar = h.f70939a;
            long cid = oGVPlayableParams.getCid();
            long avid = oGVPlayableParams.getAvid();
            long seasonId = oGVPlayableParams.getSeasonId();
            long epId = oGVPlayableParams.getEpId();
            if (z7) {
                j7 = -1;
            }
            hVar.a(cid, avid, seasonId, epId, j10, j7, oGVPlayableParams.getSubType(), this.f70947e, j8, BangumiInlineHistoryReportSource.CINEMA_INLINE);
        }
        ze.c.a(mediaHistoryEntry.getProgress(), "save ogv inline history key = ", strA, " progress = ", "BangumiInlineHistoryService");
    }

    public void onPrepared(@NotNull ICardPlayerContext iCardPlayerContext) {
        super/*tv.danmaku.video.bilicardplayer.ICardPlaySateChangedCallback*/.onPrepared(iCardPlayerContext);
        this.f70947e = ServerClock.unreliableNow();
    }

    @Nullable
    public MediaHistoryEntry readHistory(@NotNull IMediaHistoryKeyParams iMediaHistoryKeyParams) {
        if (!(iMediaHistoryKeyParams instanceof C6750c)) {
            R9.v.a("read ogv inline history from error params , params = ", iMediaHistoryKeyParams.getType(), "BangumiInlineHistoryService");
            return null;
        }
        C6750c c6750c = (C6750c) iMediaHistoryKeyParams;
        String strA = UB.c.a(c6750c.f116263b, c6750c.f116264c, c6750c.f116261a);
        MediaHistoryEntry mediaHistoryEntry = new MediaHistoryEntry(this.f70946d.b(strA, this.f70945c));
        mediaHistoryEntry.setForceStartAccurateSeek(true);
        ze.c.a(mediaHistoryEntry.getProgress(), "read ogv inline history key = ", strA, " progress = ", "BangumiInlineHistoryService");
        return mediaHistoryEntry;
    }

    public final void resetUri(@Nullable String str) {
        this.f70947e = 0L;
        this.f70945c = str;
    }

    public void saveHistory(@NotNull Video.PlayableParams playableParams, long j7, long j8, long j9, long j10) {
        a(playableParams, j7, j8, true);
    }
}
