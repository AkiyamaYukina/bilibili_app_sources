package com.bilibili.ship.theseus.ogv.playercontainer;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.ogv.ep.OgvSupplementService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.media.t;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/h.class */
public final class h implements com.bilibili.ship.theseus.united.page.background.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvDirectorSerialOperationsService f94320a;

    public h(OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService) {
        this.f94320a = ogvDirectorSerialOperationsService;
    }

    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final long a(PlayViewUniteReply playViewUniteReply) {
        return t.a(playViewUniteReply);
    }

    @Override // com.bilibili.ship.theseus.united.page.background.b
    public final Object b(Continuation<? super GeminiCommonPlayableParams> continuation) {
        OgvEpisode ogvEpisodeC;
        OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService = this.f94320a;
        if (!ogvDirectorSerialOperationsService.f94297f.d() || (ogvEpisodeC = ogvDirectorSerialOperationsService.f94293b.c()) == null) {
            return null;
        }
        Gu0.a aVar = ogvDirectorSerialOperationsService.f94299i;
        long j7 = ogvEpisodeC.f93555a;
        OgvEpisode ogvEpisodeD = aVar.d(j7);
        OgvEpisode ogvEpisode = ogvEpisodeD;
        if (ogvEpisodeD == null) {
            OgvEpisode ogvEpisodeB = aVar.b(j7);
            ogvEpisode = ogvEpisodeB;
            if (ogvEpisodeB == null) {
                return null;
            }
        }
        GeminiCommonPlayableParams geminiCommonPlayableParamsA = OgvSupplementService.a.a(ogvDirectorSerialOperationsService.f94292a, null, ogvEpisode, null, null, ogvDirectorSerialOperationsService.f94297f.g(), 99, ogvDirectorSerialOperationsService.f94302l, ogvDirectorSerialOperationsService.f94301k, ogvDirectorSerialOperationsService.f94303m, false, ogvDirectorSerialOperationsService.f94304n.f129026b, ogvDirectorSerialOperationsService.f94305o.f102492e, false, null, 25600);
        OgvSeason ogvSeason = ogvDirectorSerialOperationsService.h;
        geminiCommonPlayableParamsA.setSubType(ogvSeason.f94450b.f71782a);
        geminiCommonPlayableParamsA.setSeasonId(ogvSeason.f94449a);
        return geminiCommonPlayableParamsA;
    }
}
