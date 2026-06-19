package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/u.class */
@StabilityInferred(parameters = 0)
public final class u implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93720c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f93721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<WindowSizeClass> f93722b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/u$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final MutableState f93723a = SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    public u(@NotNull a aVar, @NotNull StateFlow<WindowSizeClass> stateFlow) {
        this.f93721a = aVar;
        this.f93722b = stateFlow;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1833916769, true, new s(this, 0)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new UIComponent.b(composeView);
    }
}
