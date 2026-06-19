package com.bilibili.ship.theseus.united.page.floatlayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import com.bilibili.app.gemini.ui.m;
import dv0.C6885w;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.MutablePropertyReference2Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/j.class */
@StabilityInferred(parameters = 0)
public final class j<V extends UIComponent.ViewEntry> extends m<C6885w> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final KProperty<Object>[] f99826d = {new MutablePropertyReference2Impl(j.class, "childViewEntry", "getChildViewEntry(Landroid/view/View;)Lcom/bilibili/app/gemini/ui/UIComponent$ViewEntry;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UIComponent<V> f99827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.a f99828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99829c = 2131313230;

    public j(@NotNull UIComponent uIComponent, @NotNull com.bilibili.ship.theseus.ogv.web.a aVar) {
        this.f99827a = uIComponent;
        this.f99828b = aVar;
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6885w c6885w = (C6885w) viewBinding;
        c6885w.f117160b.setOnClickListener(new JI0.c(this, 3));
        KProperty<Object> kProperty = f99826d[0];
        Object objBindToView = this.f99827a.bindToView((UIComponent.ViewEntry) c6885w.f117159a.getTag(this.f99829c), continuation);
        if (objBindToView != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objBindToView = Unit.INSTANCE;
        }
        return objBindToView;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C6885w c6885wInflate = C6885w.inflate(layoutInflater, viewGroup, false);
        UIComponent.ViewEntry viewEntryCreateViewEntry = this.f99827a.createViewEntry(c6885wInflate.f117159a.getContext(), c6885wInflate.f117161c);
        KProperty<Object> kProperty = f99826d[0];
        c6885wInflate.f117159a.setTag(this.f99829c, viewEntryCreateViewEntry);
        c6885wInflate.f117161c.addView(viewEntryCreateViewEntry.getRoot());
        return c6885wInflate;
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair(super/*com.bilibili.app.gemini.ui.UIComponent*/.viewReusingKey(), this.f99827a.viewReusingKey());
    }
}
