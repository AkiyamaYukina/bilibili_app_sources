package com.bilibili.ship.theseus.united.player.ai;

import F3.E;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.popupwindow.PopupWindowRepository;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<a> f104360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PopupWindowRepository f104361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f104364g;

    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f104365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f104367k = LazyKt.lazy(new E(12));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f104368a;

        public a(@NotNull View view) {
            this.f104368a = view;
        }
    }

    public d(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull Flow flow, @NotNull PopupWindowRepository popupWindowRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IControlContainerService iControlContainerService, @NotNull h hVar, @NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f104358a = coroutineScope;
        this.f104359b = context;
        this.f104360c = flow;
        this.f104361d = popupWindowRepository;
        this.f104362e = cVar;
        this.f104363f = iControlContainerService;
        this.f104364g = hVar;
        this.h = aVar;
        this.f104365i = iPlayerSettingService;
        this.f104366j = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.united.player.ai.d r17, android.view.View r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.ai.d.a(com.bilibili.ship.theseus.united.player.ai.d, android.view.View, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
