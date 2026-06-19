package com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/uicomponent/Z.class */
@StabilityInferred(parameters = 0)
public final class Z implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X f102839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final GS0.E f102840b;

    public Z(@NotNull X x6, @NotNull GS0.E e7) {
        this.f102839a = x6;
        this.f102840b = e7;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1194866825, true, new Function2(this) { // from class: com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.Y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Z f102838a;

            {
                this.f102838a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1194866825, iIntValue, -1, "com.bilibili.ship.theseus.united.page.restrictionlayer.uicomponent.RestrictionUniversalInterceptUIComponent2.bindToView.<anonymous> (RestrictionUniversalInterceptUIComponent2.kt:79)");
                    }
                    BiliThemeKt.BiliTheme(ThemeStrategy.ForceDay, false, ComposableLambdaKt.rememberComposableLambda(-927566383, true, new MT.y(this.f102838a, 2), composer, 54), composer, 390, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
