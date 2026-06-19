package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/d.class */
@StabilityInferred(parameters = 0)
public final class d implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f89068a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/d$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final n f89069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final StateFlow<Boolean> f89070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final StateFlow<WindowSizeClass> f89071c;

        public a(@NotNull n nVar, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<WindowSizeClass> stateFlow2) {
            this.f89069a = nVar;
            this.f89070b = stateFlow;
            this.f89071c = stateFlow2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f89069a, aVar.f89069a) && Intrinsics.areEqual(this.f89070b, aVar.f89070b) && Intrinsics.areEqual(this.f89071c, aVar.f89071c);
        }

        public final int hashCode() {
            return this.f89071c.hashCode() + androidx.core.content.b.a(this.f89070b, this.f89069a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "State(data=" + this.f89069a + ", isWideScreen=" + this.f89070b + ", windowSize=" + this.f89071c + ")";
        }
    }

    public d(@NotNull a aVar) {
        this.f89068a = aVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(793630009, true, new com.bilibili.biligame.cloudgame.v2.ui.vip.card.b(this, 1)));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        return new UIComponent.b(composeView);
    }
}
