package com.bilibili.ship.theseus.ogv.dubbing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bilibili.ship.theseus.ogv.dubbing.m;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import zu0.Q0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/h.class */
@StabilityInferred(parameters = 0)
public final class h extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f91855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f91856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final q f91857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Q0 f91859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PlayDubbingInfo f91860f;

    @Inject
    public h(@NotNull Context context, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull q qVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        super(context);
        this.f91855a = context;
        this.f91856b = absFunctionWidgetService;
        this.f91857c = qVar;
        this.f91858d = cVar;
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f91859e = Q0.inflate(LayoutInflater.from(frameLayout.getContext()), frameLayout, true);
        return frameLayout;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(false, false, true, true, true);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    public final void onRelease() {
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        PlayDubbingInfo playDubbingInfo = this.f91860f;
        if (playDubbingInfo == null) {
            this.f91856b.hideWidget(getToken());
            return;
        }
        m mVarA = m.a.a(this.f91855a, this.f91857c, !this.f91858d.h().f102987a, playDubbingInfo);
        Q0 q02 = this.f91859e;
        Q0 q03 = q02;
        if (q02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dubbingBinding");
            q03 = null;
        }
        q03.q(mVarA);
    }
}
