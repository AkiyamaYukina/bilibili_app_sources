package com.bilibili.ship.theseus.ogv.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.player.history.MediaHistoryHelper;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import cq0.C6748a;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/c.class */
@StabilityInferred(parameters = 1)
public final class c {
    @Inject
    public c(@NotNull OgvEpisode ogvEpisode, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull OgvCastScreenService ogvCastScreenService, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull Gu0.a aVar) {
        OgvEpisode ogvEpisodeH;
        ProjectionClient.a clientState;
        IProjectionPlayableItem iProjectionPlayableItemA;
        ProjectionClient projectionClientA = theseusCastScreenRepository.a();
        IProjectionItem rawItem = (projectionClientA == null || (clientState = projectionClientA.getClientState()) == null || (iProjectionPlayableItemA = clientState.a()) == null) ? null : iProjectionPlayableItemA.getRawItem();
        ProjectionItemData projectionItemData = rawItem instanceof ProjectionItemData ? (ProjectionItemData) rawItem : null;
        boolean z6 = projectionItemData != null && projectionItemData.f63478e == ogvEpisode.f93555a;
        ProjectionClient projectionClientA2 = theseusCastScreenRepository.a();
        if ((projectionClientA2 == null || !projectionClientA2.isGlobalLinkMode()) && !z6) {
            return;
        }
        long j7 = ogvEpisode.f93561g;
        ogvCastScreenService.getClass();
        defpackage.a.b("[theseus-ogv-OgvCastScreenService-retainCastScreen] ", "return to cast state cid: " + j7, "OgvCastScreenService-retainCastScreen");
        ogvCastScreenService.b(MediaHistoryHelper.Companion.getInstance().read(new C6748a(j7)) != null ? r0.getProgress() : 0L, z6, false);
        ProjectionClient projectionClientA3 = theseusCastScreenRepository.a();
        defpackage.a.b("[theseus-ogv-OgvEpisodeGlobalLinkService-<init>] ", "ogv retain cast screen global link:" + (projectionClientA3 != null ? Boolean.valueOf(projectionClientA3.isGlobalLinkMode()) : null) + ", isSameEpisode:" + z6, "OgvEpisodeGlobalLinkService-<init>");
        if (projectionItemData == null) {
            ogvCurrentEpisodeRepository.a(ogvEpisode);
            return;
        }
        long j8 = projectionItemData.f63478e;
        if (j8 > 0) {
            ogvEpisodeH = aVar.i(j8);
        } else {
            long j9 = projectionItemData.f63477d;
            ogvEpisodeH = null;
            if (j9 > 0) {
                ogvEpisodeH = aVar.h(j9);
            }
        }
        if (ogvEpisodeH == null) {
            ogvCurrentEpisodeRepository.p(OgvCurrentEpisodeRepository.b.C0683b.f92126a);
        } else {
            ogvCurrentEpisodeRepository.a(ogvEpisodeH);
        }
    }
}
