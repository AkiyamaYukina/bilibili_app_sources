package com.bilibili.ship.theseus.cheese.player.module;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.pugvanymodel.PUGVAnyModel;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import dagger.Module;
import dagger.Provides;
import hu0.C7503a;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/f.class */
@StabilityInferred(parameters = 1)
@Module
public final class f {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Provides
    public static long a(@NotNull com.bilibili.ship.theseus.united.player.mediaplay.f fVar) throws NoWhenBranchMatchedException {
        long epIdForReport = 0;
        if (!(fVar instanceof f.b)) {
            if (fVar instanceof f.a) {
                epIdForReport = 0;
            } else if (fVar instanceof f.c) {
                epIdForReport = C7503a.a(AnyKt.unpack(((f.c) fVar).f104516a.getSupplement(), PUGVAnyModel.class)).f121484b;
            } else if (fVar instanceof f.e) {
                com.bilibili.ship.theseus.united.bean.b bVar = ((f.e) fVar).f104523a.f117677f;
                epIdForReport = 0;
                if (bVar != null) {
                    Long l7 = bVar.f98741b;
                    epIdForReport = 0;
                    if (l7 != null) {
                        epIdForReport = l7.longValue();
                    }
                }
                BLog.d("historyStrategy sharedPlay provide epId: " + epIdForReport);
            } else {
                if (!(fVar instanceof f.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                epIdForReport = ((f.d) fVar).f104521a.getEpIdForReport();
                BLog.d("historyStrategy playableParams provide epId: " + epIdForReport);
            }
        }
        return epIdForReport;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Provides
    public static long b(@NotNull com.bilibili.ship.theseus.united.player.mediaplay.f fVar) throws NoWhenBranchMatchedException {
        long seasonId = 0;
        if (!(fVar instanceof f.b)) {
            if (fVar instanceof f.a) {
                seasonId = 0;
            } else if (fVar instanceof f.c) {
                seasonId = C7503a.a(AnyKt.unpack(((f.c) fVar).f104516a.getSupplement(), PUGVAnyModel.class)).f121483a;
            } else if (fVar instanceof f.e) {
                com.bilibili.ship.theseus.united.bean.b bVar = ((f.e) fVar).f104523a.f117677f;
                seasonId = 0;
                if (bVar != null) {
                    Long l7 = bVar.f98740a;
                    seasonId = 0;
                    if (l7 != null) {
                        seasonId = l7.longValue();
                    }
                }
            } else {
                if (!(fVar instanceof f.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                seasonId = ((f.d) fVar).f104521a.getSeasonId();
            }
        }
        return seasonId;
    }
}
