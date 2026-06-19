package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/t.class */
@StabilityInferred(parameters = 0)
public final class t implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final u f93276a;

    public t(@NotNull u uVar) {
        this.f93276a = uVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvLimitedTimeFreeTicketsComposeContainerComponent$bindToView$2((UIComponent.b) viewEntry, this, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
