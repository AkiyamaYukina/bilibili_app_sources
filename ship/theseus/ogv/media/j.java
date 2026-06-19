package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.foundation.text.selection.C3751q;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/j.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.SinglePlayViewScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.ogv.SeasonId"})
public final class j implements Factory<InteractLayerService.SubtitleKeyConfig> {
    public static InteractLayerService.SubtitleKeyConfig a(long j7) {
        return (InteractLayerService.SubtitleKeyConfig) Preconditions.checkNotNullFromProvides(new InteractLayerService.SubtitleKeyConfig((String) null, (String) null, (String) null, C3751q.a(j7, "key_ogv_subtitle_lan_main_"), C3751q.a(j7, "key_ogv_subtitle_lan_vice_"), true, 7, (DefaultConstructorMarker) null));
    }
}
