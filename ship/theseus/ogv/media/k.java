package com.bilibili.ship.theseus.ogv.media;

import com.bapis.bilibili.app.playerunite.pgcanymodel.PGCAnyModel;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.lib.moss.util.any.AnyKt;
import com.google.protobuf.Any;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/k.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.SinglePlayViewScope")
@DaggerGenerated
@QualifierMetadata
public final class k implements Factory<PGCAnyModel> {
    public static PGCAnyModel a(PlayViewUniteReply playViewUniteReply) {
        Any supplement = playViewUniteReply.getSupplement();
        return (PGCAnyModel) Preconditions.checkNotNullFromProvides(!Intrinsics.areEqual(supplement.getTypeUrl(), "type.googleapis.com/bilibili.app.playerunite.pgcanymodel.PGCAnyModel") ? PGCAnyModel.getDefaultInstance() : AnyKt.unpackSansTypeUrl(supplement, PGCAnyModel.class));
    }
}
