package com.bilibili.ship.theseus.ogv.continuousplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ogv.ep.ContinuingType;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import yu0.g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/continuousplay/c.class */
@StabilityInferred(parameters = 0)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f91807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a.p0.a f91808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gu0.a f91809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91810d;

    @Inject
    public c(@NotNull IPlayerSettingService iPlayerSettingService, @NotNull a.p0.a aVar, @NotNull Gu0.a aVar2, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository) {
        this.f91807a = iPlayerSettingService;
        this.f91808b = aVar;
        this.f91809c = aVar2;
        this.f91810d = ogvCurrentEpisodeRepository;
    }

    @Override // com.bilibili.ship.theseus.ogv.continuousplay.b
    @Nullable
    public final g a() {
        OgvEpisode ogvEpisodeC = this.f91810d.c();
        g.c cVar = null;
        if (ogvEpisodeC == null) {
            return null;
        }
        Gu0.a aVar = this.f91809c;
        long j7 = ogvEpisodeC.f93555a;
        boolean z6 = aVar.d(j7) == null;
        int i7 = this.f91807a.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        if (i7 == 0) {
            ExtraInfo extraInfo = (ExtraInfo) this.f91808b.get();
            Long l7 = extraInfo != null ? (Long) Ju0.a.f11700g.a(extraInfo) : null;
            if (l7 != null && l7.longValue() > 0 && aVar.i(l7.longValue()) != null) {
                return new g.a(l7.longValue(), ContinuingType.RemoteStrategy);
            }
            OgvEpisode ogvEpisodeD = aVar.d(j7);
            return ogvEpisodeD == null ? null : new g.a(ogvEpisodeD.f93555a, ContinuingType.LocalStrategy);
        }
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
        BLog.w("LocalContinuousPlayStrategy-continuingAction", "[theseus-ogv-LocalContinuousPlayStrategy-continuingAction] Cannot find next episode!", (Throwable) null);
        return null;
    }
}
