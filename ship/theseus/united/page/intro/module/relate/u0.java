package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/u0.class */
@StabilityInferred(parameters = 0)
public final class u0 implements UIComponent<UIComponent.b<ComposeView>>, z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f101399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f101400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C6333u f101401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C6334v f101402f;

    public u0(@NotNull String str, @NotNull String str2, @NotNull StateFlow stateFlow, @NotNull ActivityColorRepository activityColorRepository, @NotNull C6333u c6333u, @NotNull C6334v c6334v) {
        this.f101397a = str;
        this.f101398b = str2;
        this.f101399c = stateFlow;
        this.f101400d = activityColorRepository;
        this.f101401e = c6333u;
        this.f101402f = c6334v;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-61726714, true, new com.bilibili.playerbizcommonv2.danmaku.feedback.i(1, this)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ViewCompositionStrategy.Companion.getClass();
        return com.bilibili.app.gemini.ui.c.b(context, ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.INSTANCE);
    }
}
