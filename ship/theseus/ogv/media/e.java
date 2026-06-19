package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.google.protobuf.Any;
import dagger.Module;
import dagger.Provides;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/e.class */
@StabilityInferred(parameters = 1)
@Module
public final class e {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Provides
    public static long a(@NotNull com.bilibili.ship.theseus.united.player.mediaplay.f fVar) throws NoWhenBranchMatchedException {
        long jE;
        if (fVar instanceof f.b) {
            com.bilibili.ship.theseus.united.bean.d dVar = ((f.b) fVar).f104515a.f117650f;
            jE = 0;
            if (dVar != null) {
                Long l7 = dVar.f98754c;
                jE = 0;
                if (l7 != null) {
                    jE = l7.longValue();
                }
            }
        } else if (fVar instanceof f.a) {
            com.bilibili.ship.theseus.united.bean.d dVar2 = ((f.a) fVar).f104514a.h;
            jE = 0;
            if (dVar2 != null) {
                Long l8 = dVar2.f98754c;
                jE = 0;
                if (l8 != null) {
                    jE = l8.longValue();
                }
            }
        } else if (fVar instanceof f.c) {
            Any supplement = ((f.c) fVar).f104516a.getSupplement();
            jE = (!Intrinsics.areEqual(supplement.getTypeUrl(), "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class)).getBusiness().getEpisodeInfo().getEpId();
        } else if (fVar instanceof f.e) {
            com.bilibili.ship.theseus.united.bean.d dVar3 = ((f.e) fVar).f104523a.f117675d;
            jE = 0;
            if (dVar3 != null) {
                Long l9 = dVar3.f98754c;
                jE = 0;
                if (l9 != null) {
                    jE = l9.longValue();
                }
            }
        } else {
            if (!(fVar instanceof f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            jE = com.bilibili.ogv.infra.util.i.e((String) ((f.d) fVar).f104521a.getExtraContentForResolve().get("ep_id"));
        }
        return jE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Provides
    public static long b(@NotNull com.bilibili.ship.theseus.united.player.mediaplay.f fVar) throws NoWhenBranchMatchedException {
        long seasonId;
        if (fVar instanceof f.b) {
            com.bilibili.ship.theseus.united.bean.d dVar = ((f.b) fVar).f104515a.f117650f;
            seasonId = 0;
            if (dVar != null) {
                Long l7 = dVar.f98752a;
                seasonId = 0;
                if (l7 != null) {
                    seasonId = l7.longValue();
                }
            }
        } else if (fVar instanceof f.a) {
            com.bilibili.ship.theseus.united.bean.d dVar2 = ((f.a) fVar).f104514a.h;
            seasonId = 0;
            if (dVar2 != null) {
                Long l8 = dVar2.f98752a;
                seasonId = 0;
                if (l8 != null) {
                    seasonId = l8.longValue();
                }
            }
        } else if (fVar instanceof f.c) {
            Any supplement = ((f.c) fVar).f104516a.getSupplement();
            seasonId = (!Intrinsics.areEqual(supplement.getTypeUrl(), "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class)).getBusiness().getEpisodeInfo().getSeasonInfo().getSeasonId();
        } else if (fVar instanceof f.e) {
            com.bilibili.ship.theseus.united.bean.d dVar3 = ((f.e) fVar).f104523a.f117675d;
            seasonId = 0;
            if (dVar3 != null) {
                Long l9 = dVar3.f98752a;
                seasonId = 0;
                if (l9 != null) {
                    seasonId = l9.longValue();
                }
            }
        } else {
            if (!(fVar instanceof f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            seasonId = ((f.d) fVar).f104521a.getSeasonId();
        }
        return seasonId;
    }
}
