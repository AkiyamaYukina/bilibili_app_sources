package com.bilibili.ship.theseus.united.utils;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.playerbizcommonv2.widget.subtitle.C5893z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/a.class */
@StabilityInferred(parameters = 1)
public abstract class a implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ThemeStrategy f104845a;

    public a(@NotNull ThemeStrategy themeStrategy) {
        this.f104845a = themeStrategy;
    }

    @Composable
    public abstract void a(@NotNull Modifier.Companion companion, @Nullable Composer composer);

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-1837229001, true, new C5893z(this, 1)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
