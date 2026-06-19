package com.bilibili.ship.theseus.ugc.play.schedule;

import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/j.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class j implements Factory<AutoContinuousInterceptService.a> {
    public static AutoContinuousInterceptService.a a(UGCPlaybackRepository uGCPlaybackRepository, UGCEpisodeListRepository uGCEpisodeListRepository, UnitedSeasonDetailRepository unitedSeasonDetailRepository, com.bilibili.ship.theseus.united.page.view.d dVar, C8043a c8043a, rW0.a aVar) {
        return (AutoContinuousInterceptService.a) Preconditions.checkNotNullFromProvides(new i(uGCPlaybackRepository, uGCEpisodeListRepository, unitedSeasonDetailRepository, dVar, c8043a, aVar));
    }
}
