package com.bilibili.ship.theseus.united.player.aspectratio;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/aspectratio/PlayerAspectRatioService.class */
@StabilityInferred(parameters = 0)
public final class PlayerAspectRatioService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7893a f104379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f104380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final AspectRatio f104381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f104382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Job f104383f;

    @Inject
    public PlayerAspectRatioService(@NotNull CoroutineScope coroutineScope, @NotNull C7893a c7893a, @NotNull c cVar, @Nullable AspectRatio aspectRatio, @NotNull IRenderContainerService iRenderContainerService) {
        this.f104378a = coroutineScope;
        this.f104379b = c7893a;
        this.f104380c = cVar;
        this.f104381d = aspectRatio;
        this.f104382e = iRenderContainerService;
        a();
    }

    public final void a() {
        Job job = this.f104383f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (this.f104381d != null) {
            return;
        }
        this.f104383f = BuildersKt.launch$default(this.f104378a, (CoroutineContext) null, (CoroutineStart) null, new PlayerAspectRatioService$startCorrectingRatio$1(this, null), 3, (Object) null);
    }

    public final void b() {
        BuildersKt.launch$default(this.f104378a, (CoroutineContext) null, (CoroutineStart) null, new PlayerAspectRatioService$stopCorrectingRatio$1(this, null), 3, (Object) null);
    }
}
