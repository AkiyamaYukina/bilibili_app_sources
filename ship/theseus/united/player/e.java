package com.bilibili.ship.theseus.united.player;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.ship.theseus.keel.player.h;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f104449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IGestureService f104450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IReporterService f104452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f104453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f104455g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f104456i;

    @Inject
    public e(@NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IGestureService iGestureService, @NotNull IControlContainerService iControlContainerService, @NotNull IReporterService iReporterService, @NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f104449a = absFunctionWidgetService;
        this.f104450b = iGestureService;
        this.f104451c = iControlContainerService;
        this.f104452d = iReporterService;
        this.f104453e = context;
        this.f104454f = coroutineScope;
        this.f104455g = hVar;
        this.h = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TripleSpeedService$runOldTripleSpeed$1(this, null), 3, (Object) null);
    }
}
