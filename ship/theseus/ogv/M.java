package com.bilibili.ship.theseus.ogv;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.videoquality.C6435i;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import ev0.InterfaceC7008a;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/M.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class M implements Factory<InterfaceC7008a.C1258a> {
    public static InterfaceC7008a.C1258a a(OgvSeason ogvSeason, OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, com.bilibili.ship.theseus.keel.player.h hVar, com.bilibili.ship.theseus.ogv.continuousplay.d dVar, C8043a c8043a, C6435i c6435i) {
        com.bilibili.player.tangram.playercore.u uVarO;
        MediaResource mediaResource;
        WithVideoProgress withVideoProgressP;
        com.bilibili.player.tangram.playercore.u uVarO2;
        MediaResource mediaResource2;
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
        String currentLanguage = (jVarJ == null || (uVarO2 = jVarJ.o()) == null || (mediaResource2 = uVarO2.f79460c) == null) ? null : mediaResource2.getCurrentLanguage();
        long j7 = 0;
        long j8 = currentLanguage != null ? 2L : 0L;
        long jA = j8;
        if (com.bilibili.player.tangram.basic.b.a(hVar.f91109c.c())) {
            jA = j8 | com.bilibili.playerbizcommon.utils.e.f80284a.a();
        }
        long j9 = jA;
        if (c6435i.a()) {
            j9 = jA | 1;
        }
        long jA2 = ogvEpisodeC != null ? ogvEpisodeC.a() : 0L;
        if (ogvEpisodeC != null) {
            j7 = ogvEpisodeC.f93561g;
        }
        String str = c8043a.a().f123882d;
        String str2 = c8043a.a().f123879a;
        String str3 = c8043a.a().f123881c;
        com.bilibili.ship.theseus.keel.player.j jVarJ2 = hVar.j();
        ev0.i iVar = (jVarJ2 == null || (withVideoProgressP = jVarJ2.p()) == null) ? null : new ev0.i(withVideoProgressP.F(), true);
        com.bilibili.ship.theseus.keel.player.j jVarJ3 = hVar.j();
        InterfaceC7008a.C1258a c1258a = new InterfaceC7008a.C1258a(jA2, null, j7, str2, str3, null, str, iVar, null, null, null, currentLanguage, j9, false, (jVarJ3 == null || (uVarO = jVarJ3.o()) == null || (mediaResource = uVarO.f79460c) == null) ? 0 : mediaResource.getCurProductionType(), false, 42786);
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.bean.e.f98758a.a, new com.bilibili.ship.theseus.united.bean.d(Long.valueOf(ogvSeason.f94449a), ogvSeason.f94450b, ogvEpisodeC != null ? Long.valueOf(ogvEpisodeC.f93555a) : null, null, null, 56));
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.ogv.continuousplay.e.f91815a.a, Integer.valueOf(dVar.f91811a));
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.ogv.continuousplay.e.f91817c.a, dVar.f91813c);
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.ogv.continuousplay.e.f91816b.a, dVar.f91812b);
        com.bilibili.ship.theseus.keel.player.j jVarJ4 = hVar.j();
        c1258a.m10991setTagpIAwiHE(com.bilibili.ship.theseus.united.player.mediaplay.r.f104621a.a, jVarJ4 != null ? jVarJ4.O() : null);
        return (InterfaceC7008a.C1258a) Preconditions.checkNotNullFromProvides(c1258a);
    }
}
