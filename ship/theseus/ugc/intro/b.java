package com.bilibili.ship.theseus.ugc.intro;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/b.class */
@StabilityInferred(parameters = 1)
public final class b implements UIComponent<UIComponent.b<View>> {
    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        return new UIComponent.b(view);
    }
}
