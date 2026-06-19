package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import WI0.U;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/a.class */
@StabilityInferred(parameters = 0)
public final class a implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateFlow<h> f89283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f89284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f89285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f89286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final j f89287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final XR0.b f89288f;

    public a(@NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull StateFlow stateFlow3, @NotNull StateFlow stateFlow4, @NotNull j jVar, @NotNull XR0.b bVar) {
        this.f89283a = stateFlow;
        this.f89284b = stateFlow2;
        this.f89285c = stateFlow3;
        this.f89286d = stateFlow4;
        this.f89287e = jVar;
        this.f89288f = bVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(603561538, true, new U(this, 3)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(composeView, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new GS.m(this, 2)));
        return new UIComponent.b(composeView);
    }
}
