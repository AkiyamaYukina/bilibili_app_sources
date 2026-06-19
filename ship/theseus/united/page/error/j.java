package com.bilibili.ship.theseus.united.page.error;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import hv0.C7510d;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OnRenderLayerFloatLayerManager f99630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f99631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f99632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f99633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7510d f99634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f99635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f99636g;

    @NotNull
    public final PageNestedScrollFusionRepository h;

    @Inject
    public j(@NotNull CoroutineScope coroutineScope, @NotNull OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull Context context, @NotNull C7510d c7510d, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository) {
        this.f99630a = onRenderLayerFloatLayerManager;
        this.f99631b = hVar;
        this.f99632c = cVar;
        this.f99633d = context;
        this.f99634e = c7510d;
        this.f99635f = pageReportService;
        this.f99636g = aVar;
        this.h = pageNestedScrollFusionRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusPlayErrorStateService$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.error.b r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.SuspendLambda r12) {
        /*
            Method dump skipped, instruction units count: 878
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.error.j.a(com.bilibili.ship.theseus.united.page.error.b, kotlin.coroutines.jvm.internal.SuspendLambda):java.lang.Object");
    }
}
