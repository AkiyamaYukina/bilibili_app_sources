package com.bilibili.ship.theseus.cheese.player.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.player.history.MediaHistoryHelper;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import cq0.C6748a;
import eu0.C6985d;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/castscreen/b.class */
@StabilityInferred(parameters = 1)
public final class b {
    @Inject
    public b(@NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull CheeseCastScreenService cheeseCastScreenService, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull C6985d c6985d) {
        ProjectionClient.a clientState;
        IProjectionPlayableItem iProjectionPlayableItemA;
        ProjectionClient projectionClientA = theseusCastScreenRepository.a();
        ProjectionItemData projectionItemData = null;
        IProjectionItem rawItem = (projectionClientA == null || (clientState = projectionClientA.getClientState()) == null || (iProjectionPlayableItemA = clientState.a()) == null) ? null : iProjectionPlayableItemA.getRawItem();
        projectionItemData = rawItem instanceof ProjectionItemData ? (ProjectionItemData) rawItem : projectionItemData;
        boolean z6 = projectionItemData != null && projectionItemData.f63475b == c6985d.f117510e;
        ProjectionClient projectionClientA2 = theseusCastScreenRepository.a();
        if ((projectionClientA2 == null || !projectionClientA2.isGlobalLinkMode()) && !z6) {
            return;
        }
        Pair pair = projectionItemData != null ? TuplesKt.to(Long.valueOf(projectionItemData.f63475b), Long.valueOf(projectionItemData.f63477d)) : TuplesKt.to(Long.valueOf(c6985d.f117510e), Long.valueOf(c6985d.f117511f));
        long jLongValue = ((Number) pair.component1()).longValue();
        long jLongValue2 = ((Number) pair.component2()).longValue();
        long j7 = c6985d.f117511f;
        cheeseCastScreenService.getClass();
        cheeseCastScreenService.b(MediaHistoryHelper.Companion.getInstance().read(new C6748a(j7)) != null ? r0.getProgress() : 0L, z6, false);
        cheesePlayRepository.g(jLongValue, jLongValue2);
    }
}
