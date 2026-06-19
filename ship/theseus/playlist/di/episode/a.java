package com.bilibili.ship.theseus.playlist.di.episode;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BusinessCastScreenService f95508c;

    @Inject
    public a(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull BusinessCastScreenService businessCastScreenService) {
        this.f95506a = coroutineScope;
        this.f95507b = playlistSchedulingService;
        this.f95508c = businessCastScreenService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistCastScreenService$collectCastScreenToNext$1(this, null), 3, (Object) null);
    }
}
