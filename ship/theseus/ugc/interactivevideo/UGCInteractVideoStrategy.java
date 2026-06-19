package com.bilibili.ship.theseus.ugc.interactivevideo;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import com.bilibili.ship.theseus.united.page.interactvideo.v;
import com.bilibili.ship.theseus.united.page.interactvideo.x;
import com.bilibili.ship.theseus.united.page.playingarea.i;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import javax.inject.Inject;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/interactivevideo/UGCInteractVideoStrategy.class */
@StabilityInferred(parameters = 0)
public final class UGCInteractVideoStrategy implements TheseusInteractVideoService.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f96919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f96920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final x f96921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f96922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f96923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final i f96924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96925g;

    @Inject
    public UGCInteractVideoStrategy(@NotNull Context context, @NotNull Activity activity, @NotNull x xVar, @NotNull c cVar, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull i iVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f96919a = context;
        this.f96920b = activity;
        this.f96921c = xVar;
        this.f96922d = cVar;
        this.f96923e = absFunctionWidgetService;
        this.f96924f = iVar;
        this.f96925g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.interactivevideo.UGCInteractVideoStrategy.a(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.c
    @Nullable
    public final Object b(boolean z6, @NotNull v vVar, @NotNull Continuation continuation) {
        return this.f96921c.b(z6, vVar, continuation);
    }

    @Override // com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.c
    public final void c() {
        this.f96921c.c();
    }
}
