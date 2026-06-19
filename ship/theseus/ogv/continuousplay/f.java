package com.bilibili.ship.theseus.ogv.continuousplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ogv.ep.ContinuingType;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.ogv.season.OgvSeasonInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IndexedValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;
import tv.danmaku.biliplayerv2.service.business.ShutOffTimingService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import yu0.g;
import yu0.h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/continuousplay/f.class */
@StabilityInferred(parameters = 0)
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gu0.a f91819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a.p0.a f91821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f91822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ShutOffTimingService f91823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Lu0.a f91824g;

    @NotNull
    public final d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<h> f91825i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0387  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.season.OgvSeason r4, @org.jetbrains.annotations.NotNull Gu0.a r5, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository r6, @org.jetbrains.annotations.NotNull tv.danmaku.bili.a.p0.a r7, @org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService r8, @org.jetbrains.annotations.NotNull tv.danmaku.biliplayerv2.service.business.ShutOffTimingService r9, @org.jetbrains.annotations.Nullable Lu0.a r10, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.continuousplay.d r11, @org.jetbrains.annotations.NotNull com.bapis.bilibili.app.viewunite.pgcanymodel.PlayStrategy r12) {
        /*
            Method dump skipped, instruction units count: 935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.continuousplay.f.<init>(com.bilibili.ship.theseus.ogv.season.OgvSeason, Gu0.a, com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository, tv.danmaku.bili.a$p0$a, tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService, tv.danmaku.biliplayerv2.service.business.ShutOffTimingService, Lu0.a, com.bilibili.ship.theseus.ogv.continuousplay.d, com.bapis.bilibili.app.viewunite.pgcanymodel.PlayStrategy):void");
    }

    @Override // com.bilibili.ship.theseus.ogv.continuousplay.b
    @Nullable
    public final g a() {
        g gVarA;
        IndexedValue indexedValueA;
        Long l7;
        boolean z6 = false;
        int i7 = this.f91822e.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        ShutOffTimingService shutOffTimingService = this.f91823f;
        if (shutOffTimingService.getTotalTime() == -1 || shutOffTimingService.isInSleepMode()) {
            return g.c.f129901a;
        }
        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.f91820c;
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        g.c cVar = null;
        if (ogvEpisodeC == null) {
            return null;
        }
        Gu0.a aVar = this.f91819b;
        long j7 = ogvEpisodeC.f93555a;
        if (aVar.d(j7) == null) {
            z6 = true;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                if (!z6) {
                    cVar = g.c.f129901a;
                }
                return cVar;
            }
            if (i7 == 2) {
                return g.e.f129903a;
            }
            OgvEpisode ogvEpisodeB = z6 ? aVar.b(j7) : aVar.d(j7);
            if (ogvEpisodeB != null) {
                return new g.a(ogvEpisodeB.f93555a, ContinuingType.LocalStrategy);
            }
            BLog.w("RemoteContinuousPlayStrategy-continuingAction", "[theseus-ogv-RemoteContinuousPlayStrategy-continuingAction] Cannot find next episode!", (Throwable) null);
            return null;
        }
        ExtraInfo extraInfo = (ExtraInfo) this.f91821d.get();
        long jLongValue = (extraInfo == null || (l7 = (Long) Ju0.a.f11700g.a(extraInfo)) == null) ? 0L : l7.longValue();
        if (jLongValue == 0 || aVar.i(jLongValue) == null) {
            OgvEpisode ogvEpisodeC2 = ogvCurrentEpisodeRepository.c();
            if (ogvEpisodeC2 != null) {
                Iterator it = ((ArrayList) this.f91825i).iterator();
                do {
                    gVarA = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    h hVar = (h) it.next();
                    Lu0.a aVar2 = this.f91824g;
                    gVarA = hVar.a(new h.a(ogvEpisodeC2, this.f91819b, this.f91818a, this.h, (aVar2 == null || (indexedValueA = Lu0.a.a(aVar2)) == null) ? null : (OgvSeasonInfo) indexedValueA.getValue()));
                } while (gVarA == null);
            } else {
                gVarA = null;
            }
        } else {
            gVarA = new g.a(jLongValue, ContinuingType.RemoteStrategy);
        }
        return gVarA;
    }
}
