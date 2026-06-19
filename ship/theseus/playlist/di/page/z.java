package com.bilibili.ship.theseus.playlist.di.page;

import com.bilibili.ship.theseus.united.page.story.StoryEntranceService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/z.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class z implements Factory<StoryEntranceService.a> {
    public static StoryEntranceService.a a() {
        return (StoryEntranceService.a) Preconditions.checkNotNullFromProvides(new StoryEntranceService.a(0L));
    }
}
