package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.theme.R$color;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/y0.class */
@StabilityInferred(parameters = 1)
public final class y0 implements UIComponent<UIComponent.b<View>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f101432a;

    public y0(@Nullable Integer num) {
        this.f101432a = num;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        View view = ((UIComponent.b) viewEntry).a;
        Integer num = this.f101432a;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        } else {
            view.setBackgroundResource(R$color.Line_regular);
        }
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, NewPlayerUtilsKt.toPx(0.5f)));
        return new UIComponent.b(view);
    }
}
