package com.bilibili.ship.theseus.ugc.episode;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService;
import com.bilibili.ship.theseus.ugc.endpage.UGCEndPageService;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService;
import com.bilibili.ship.theseus.ugc.play.schedule.k;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/episode/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f96895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f96896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f96897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final k f96898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final UGCBackgroundPlayService f96899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UGCEndPageService f96900g;

    @NotNull
    public final AutoContinuousInterceptService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f96901i;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull k kVar, @NotNull UGCBackgroundPlayService uGCBackgroundPlayService, @NotNull UGCEndPageService uGCEndPageService, @NotNull AutoContinuousInterceptService autoContinuousInterceptService, @NotNull g gVar) {
        this.f96894a = coroutineScope;
        this.f96895b = hVar;
        this.f96896c = pageNestedScrollFusionRepository;
        this.f96897d = pageBackgroundPlayRepository;
        this.f96898e = kVar;
        this.f96899f = uGCBackgroundPlayService;
        this.f96900g = uGCEndPageService;
        this.h = autoContinuousInterceptService;
        this.f96901i = gVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCEpisodeCompletedService$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.episode.a r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.episode.a.a(com.bilibili.ship.theseus.ugc.episode.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
