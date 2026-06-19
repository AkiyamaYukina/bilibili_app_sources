package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.google.protobuf.Any;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/f.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.MediaScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<com.bilibili.ogv.pub.season.a> {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static com.bilibili.ogv.pub.season.a a(com.bilibili.ship.theseus.united.player.mediaplay.f fVar) throws NoWhenBranchMatchedException {
        com.bilibili.ogv.pub.season.a aVar;
        boolean z6 = fVar instanceof f.b;
        com.bilibili.ogv.pub.season.a aVar2 = com.bilibili.ogv.pub.season.a.f71781i;
        if (z6) {
            com.bilibili.ship.theseus.united.bean.d dVar = ((f.b) fVar).f104515a.f117650f;
            aVar = aVar2;
            if (dVar != null) {
                com.bilibili.ogv.pub.season.a aVar3 = dVar.f98753b;
                aVar = aVar3;
                if (aVar3 == null) {
                    aVar = aVar2;
                }
            }
        } else if (fVar instanceof f.a) {
            com.bilibili.ship.theseus.united.bean.d dVar2 = ((f.a) fVar).f104514a.h;
            aVar = aVar2;
            if (dVar2 != null) {
                com.bilibili.ogv.pub.season.a aVar4 = dVar2.f98753b;
                aVar = aVar4;
                if (aVar4 == null) {
                    aVar = aVar2;
                }
            }
        } else if (fVar instanceof f.c) {
            Any supplement = ((f.c) fVar).f104516a.getSupplement();
            int seasonType = (!Intrinsics.areEqual(supplement.getTypeUrl(), "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class)).getBusiness().getEpisodeInfo().getSeasonInfo().getSeasonType();
            aVar = seasonType <= 0 ? aVar2 : new com.bilibili.ogv.pub.season.a(seasonType);
        } else if (fVar instanceof f.e) {
            com.bilibili.ship.theseus.united.bean.d dVar3 = ((f.e) fVar).f104523a.f117675d;
            aVar = aVar2;
            if (dVar3 != null) {
                com.bilibili.ogv.pub.season.a aVar5 = dVar3.f98753b;
                aVar = aVar5;
                if (aVar5 == null) {
                    aVar = aVar2;
                }
            }
        } else {
            if (!(fVar instanceof f.d)) {
                throw new NoWhenBranchMatchedException();
            }
            int subType = ((f.d) fVar).f104521a.getSubType();
            aVar = subType <= 0 ? aVar2 : new com.bilibili.ogv.pub.season.a(subType);
        }
        return (com.bilibili.ogv.pub.season.a) Preconditions.checkNotNullFromProvides(aVar);
    }
}
