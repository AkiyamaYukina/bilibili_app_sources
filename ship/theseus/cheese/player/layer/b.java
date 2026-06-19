package com.bilibili.ship.theseus.cheese.player.layer;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.bilibili.app.gemini.ui.UIComponent;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/layer/b.class */
@StabilityInferred(parameters = 1)
public final class b implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f90622a;

    @Inject
    public b(@NotNull e eVar) {
        this.f90622a = eVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(1714124192, true, new Function2(this) { // from class: com.bilibili.ship.theseus.cheese.player.layer.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f90621a;

            {
                this.f90621a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1714124192, iIntValue, -1, "com.bilibili.ship.theseus.cheese.player.layer.CheesePayLayerComponent.bindToView.<anonymous> (CheesePayLayerComponent.kt:32)");
                    }
                    CheesePayLayerComposeViewKt.b(this.f90621a.f90622a, composer, 0);
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
