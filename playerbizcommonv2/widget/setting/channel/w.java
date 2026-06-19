package com.bilibili.playerbizcommonv2.widget.setting.channel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/channel/w.class */
@StabilityInferred(parameters = 1)
public final class w implements UIComponent<UIComponent.b<View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83315a;

    public w(int i7) {
        this.f83315a = i7;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        View view = ((UIComponent.b) viewEntry).a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = DimenUtilsKt.dpToPx(this.f83315a);
        view.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
        return new UIComponent.b(view);
    }
}
