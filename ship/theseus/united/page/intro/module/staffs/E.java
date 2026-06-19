package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/E.class */
public final class E implements UIComponent<UIComponent.b<View>> {
    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        View view = new View(context);
        Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
        view.setVisibility(8);
        return new UIComponent.b(view);
    }
}
